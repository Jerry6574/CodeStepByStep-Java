/* DnaErrors.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/dnaErrors

Write a method named dnaErrors that accepts two strings representing 
DNA sequences as parameters and returns an integer representing the number of errors 
found between the two sequences, using a formula described below. 
DNA contains nucleotides, which are represented by four different letters A, C, T, and G. 

DNA is made up of a pair of nucleotide strands, 
where a letter from the first strand is paired with a corresponding letter from the second. 
The letters are paired as follows:

	A is paired with T and vice-versa.
	C is paired with G and vice-versa.
	
Below are two perfectly matched DNA strands. Notice how the letters are paired up according to the above rules.

"GCATGGATTAATATGAGACGACTAATAGGATAGTTACAACCCTTACGTCACCGCCTTGA"
 |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
"CGTACCTAATTATACTCTGCTGATTATCCTATCAATGTTGGGAATGCAGTGGCGGAACT"

In some cases, errors occur within DNA molecules; the task of your method is to find two particular kinds of errors:

	Unmatched nucleotides, in which one strand contains a dash ('-') at a given index, 
	or does not contain a nucleotide at the given index (if the strings are not the same length). 
	Each of these counts as 1 error.
	
	Point mutations, in which a letter from one strand is matched against the wrong letter in the other strand. 
	For example, A might accidentally pair with C, or G might pair with G. Each of these counts as 2 errors.


For example, consider these two DNA strands:

index 01234567890123456789012
     "GGGA-GAATCTCTGGACT"
     "CTCTACTTA-AGACCGGTACAGG"
     
     
This pair of strands has three point mutations (at indexes 1, 15, and 17), 
and seven unmatched nucleotides (dashes at indexes 4 and 9, 
and nucleotides in the second string with no match at indexes 18-22). 
The point mutations count as a total of 3 * 2 = 6 errors, 
and the unmatched nucleotides count as 7 * 1 = 7 errors, 
so your method would return an error count of 6+7 = 13 total errors if passed the two above strands.

You may assume that each string consists purely of the characters A, C, T, G, and - (the dash character), 
but the letters could appear in either upper or lowercase. 
The strings might be the same length, or the first or second might be longer than the other. 
Either string could be very long, very short, or even the empty string. 
If the strings match perfectly with no errors as defined above, your method should return 0.

 */
import acm.program.*;

public class DnaErrors extends ConsoleProgram {
    
    public void run() {
    	println(dnaErrors("GGGA-GAATCTCTGGACT", "CTCTACTTA-AGACCGGTACAGG"));
    }
    
    public int dnaErrors(String dna1, String dna2) {
    	int unmatchedErrors = Math.abs(dna1.length() - dna2.length());
    	int pointMutationErrors = 0;
    	
    	int shortestDNALength = Math.min(dna1.length(), dna2.length());
    	
    	for(int i = 0; i < shortestDNALength; i++) {
    		if(dna1.charAt(i) == '-' || dna2.charAt(i) == '-') {
    			unmatchedErrors++;
    		} else {
    			pointMutationErrors += calculatePointMutationErrors(dna1.charAt(i), dna2.charAt(i));
    		}
    	}
    	return unmatchedErrors + pointMutationErrors;
    }
    
    private int calculatePointMutationErrors(char nucleotide1, char nucleotide2) {
    	if((nucleotide1 == 'A' && nucleotide2 == 'T') || (nucleotide1 == 'T' && nucleotide2 == 'A')) {
    		return 0;
    	} else if((nucleotide1 == 'C' && nucleotide2 == 'G') || (nucleotide1 == 'G' && nucleotide2 == 'C')){
    		return 0;
    	} else {
    		return 2;
    	}
    }
    
}
