package methods;

import java.util.Random;

public class MiscMethods {

	public String coinFlip() {
		String [] arr = {"Heads", "Tails"};
		Random random = new Random();
		int select = random.nextInt(arr.length);
		return arr[select];
	}
	
	public int diceRoll() {
		Random random = new Random();
		int roll = random.nextInt(20) + 1;
		return roll;
	}
}