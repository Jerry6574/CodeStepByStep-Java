/* WordChain.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/wordChain

Write a method named wordChain that accepts two string parameters, the first representing an input 
filename and the second representing a starting word, and that produces a random "word chain" 
starting from the given word.

For this problem let's define a "word chain" as a sequence of words where the last two letters 
of the current word will be the first two letters of the next word. 
For example, here is a possible word chain that starts from the word "program":

program → amender → erected → edaciousness

The words you use in your word chain come from the given input file. 
You should assume that this file contains a sequence of words, one per line. 
Your method should open and read the contents of this input file and use those words 
when creating a word chain. If the file exists and is readable, you may assume that its 
contents consist entirely of words listed one-per-line in lowercase, and that each word 
in the dictionary is at least 2 letters long. For example, the file dictionary.txt might 
contain words in the format shown below (abbreviated by ...).

aah
aahed
...
zygoid
zygote

You are producing a random word chain, so the idea is that you should randomly choose a next 
word whose first two letters are the same as the last two letters of the current word. 
In our sample chain above, any word starting with "am" would be a valid choice for the second word; 
and if the second word chosen is "amender", then any word starting with "er" would be a valid choice 
for the third word. And so on. A word chain might have a duplicate in it; this is okay.

A word chain ends when you reach a two-letter word suffix that is not the start of any word in the dictionary. 
For example, in the chain shown above, we produced "edaciousness". 
There are no words in the dictionary that begin with "ss", so the chain ends and the method stops.

Your method should print the word chain to the console, one word per line. 
Here are several example outputs from the call of wordChain("dictionary.txt", "computer"); . 
The implication of the outputs below is that the given dictionary does not contain any words 
that begin with "gs", or "ss", or "ns", which is why the chains end there.

computer
erecting
ngatis
isocyanates
esthete
terminism
smug
uglying
ngati
tidings

computer
ere
reservednesses
espouse
serovar
arpeggio
iodines
eschalot
ototoxicity
tyeing
nganas
assentive
vestibule
lecherousness

computer
erotize
zecchins

Notice that the same word suffix/prefix could occur more than once in the same chain, 
such as "ng" in "erecting" / "ngatis" and again later in "uglying" / "ngati". 
If the start word passed in ends with a two-letter sequence that is not the start of any words in the input file, 
your method should simply print the start word and then exit.

If the file is missing/unreadable, or the start word's length is less than 2, 
your method should throw an IllegalArgumentException.

Constraints: Your solution should read the file only once, not make multiple passes over the file data. 
Similarly, don't store the entire file contents in a collection and loop over that entire collection multiple times. 
You should choose an efficient solution. Choose data structures intelligently and use them properly. 
You may create up to two additional data structures (stack, queue, set, map, etc.) as auxiliary storage. 
A nested structure, such as a set of lists, counts as one additional data structure. 
(You can have as many simple variables as you like, such as ints or strings.)

 */
import java.io.*;
import java.util.*;

import acm.program.*;
import acm.util.ErrorException;

public class WordChain extends ConsoleProgram {
    
    public void run() {
    	try {
			wordChain("dictionary.txt", "can");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void wordChain(String filename, String startWord) throws FileNotFoundException {
    	BufferedReader rd = null;
    	
    	HashMap<String, ArrayList<String>> dictionary = new HashMap<>();
    	
    	// read file to BufferedReader
		try{
			FileInputStream stream = new FileInputStream(filename);
			rd = new BufferedReader(new InputStreamReader(stream));
			
		} catch(FileNotFoundException ex){
			println("That file doesn't exist. ");
			throw ex;
		}
		
		// added "first2Letter: wordList" entries to dictionary
		try {
			while(true){
				String word = rd.readLine();
				
				if(word == null){
					break;
				}
				
				word = word.toLowerCase();
				String first2Letters = word.substring(0, 2).toLowerCase();
				
				if(dictionary.containsKey(first2Letters)) {
					ArrayList<String> wordList = dictionary.get(first2Letters);
					wordList.add(word);
					dictionary.put(first2Letters, wordList);
				} else {
					ArrayList<String> wordList = new ArrayList<>();
					wordList.add(word);
					dictionary.put(first2Letters, wordList);
				}
				
			}
			rd.close();
			
		} catch(IOException ex){
			throw new ErrorException(ex);
		}
		
		String word = startWord.toLowerCase();
		String end2Letters = word.substring(word.length()-2, word.length());
		
		// print wordchain
		while(true) {
			println(word);
			Random random = new Random();
			
			if(dictionary.containsKey(end2Letters)) {
				ArrayList<String> wordList = dictionary.get(end2Letters);
				word = wordList.get(random.nextInt(wordList.size()));
				end2Letters = word.substring(word.length()-2, word.length());
				
			} else {
				break;
			}
		}
    }

}
