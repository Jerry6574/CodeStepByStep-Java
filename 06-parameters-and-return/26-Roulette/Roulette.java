/* Roulette.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/Roulette

Write a console program in a class named Roulette that simulates the gambling game of Roulette, 
with the following characteristics. 
The player begins with $10 and bets (up to) $3 per spin of the wheel. 
If the wheel comes up 1-18, the player wins $3. Otherwise, player loses $3. 
Play until the player gets $1000 or drops to $0. At the end, print the max money the player ever earned. 
Here is an example dialogue:

bet $3, spin 15, money = $13
bet $3, spin 35, money = $10
bet $3, spin 7,  money = $13
bet $3, spin 4,  money = $16
bet $3, spin 28, money = $13
bet $3, spin 19, money = $10
bet $3, spin 21, money = $7
bet $3, spin 26, money = $4
bet $3, spin 36, money = $1
bet $1, spin 22, money = $0
max = $16

You should break down your program into several methods, 
each of which helps solve the overall problem. 

 */
import java.util.Random;

import acm.program.*;
import acm.util.*;

public class Roulette extends ConsoleProgram {
    
    public void run() {
    	
    	int money = 10;
    	int maxMoney = money;
    	
    	while(money > 0 && money < 1000) {
    		int bet = 0;
    		if(money >= 3) {
    			bet = 3;
    		} else {
    			bet = money;
    		}
    		
    		int num = spin();
    		money += payout(num, bet);
    		println(String.format("bet $%d, spin %d, money = $%d", bet, num, money));
    		
    		if(money >  maxMoney) {
    			maxMoney = money;
    		}
    	}
    	
    	println("max = $" + maxMoney);
    	
    }
    
    public int payout(int num, int bet) {
    	if(num >= 1 && num <= 18) {
    		return bet;
    	} else {
    		return -bet;
    	}
    }
   
    public int spin() {
    	Random rgen = new Random();
//    	RandomGenerator rgen = new RandomGenerator();
    	
    	// simulate a roulette spin, return a number that the ball lands on
    	int num = rgen.nextInt(36);
    	return num;
    }
    
}
