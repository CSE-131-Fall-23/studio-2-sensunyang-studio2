package studio2;

import java.util.Scanner;


public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner startAmount1 = new Scanner(System.in);
		System.out.println("How much do you have? ");
		double startAmount = startAmount1.nextDouble();
		
		Scanner winChance1 = new Scanner(System.in);
		System.out.println("What's the win chance? ");
		double winChance = winChance1.nextDouble();
		
		Scanner winLimit1 = new Scanner(System.in);
		System.out.println("What is your win limit? ");
		double winLimit = winLimit1.nextDouble();
		
		Scanner totalSimulations1 = new Scanner(System.in);
		System.out.println("How many total simulations?");
		double totalSimulations = totalSimulations1.nextDouble();
		for(int i = 0; i < totalSimulations; i++) {
			System.out.println("Day " + (i+1));
			int counter = 0;
			while( startAmount < winLimit && startAmount > 0) {
				double chance = Math.random();
				if (chance < winChance) {
					startAmount = startAmount + 1;
				}
				else {
					startAmount = startAmount - 1;
				}
				counter++;
			}
			System.out.println("Number of plays: " + counter);
			if (startAmount == 0) {
				System.out.println("Ruin");
			}
			else if (startAmount == winLimit){
				System.out.println("You Win");
			}
		}	
		}

}
