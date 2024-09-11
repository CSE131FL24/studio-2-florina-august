package studio2;

import java.util.Scanner;

public class studio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("The amount of money you start with:");
		int startAmount = in.nextInt();
		System.out.println("The win probability, or the probability that you win a single play:");
		double winChance = in.nextDouble();
		System.out.println("If you reach this amount of money you had a successful day or leave:");
		int winLimit = in.nextInt();
		System.out.println("The number of day's you'll simulate:");
		int totalSimulations = in.nextInt();
		
		int plays=0;
		int wingame=0;
		
		for(int p=0; p < totalSimulations; p++ ) {
		int count = startAmount;
		
		while(count < winLimit && count > 0) {
			
		    plays++;
			if(Math.random()>winChance) {
				count++;		
		}
			else {
				count--;
			if()
			}
		}
	}
}	



