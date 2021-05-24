package _06_duck;

import javax.swing.JOptionPane;

public class Duck {
	String favoriteFood;
	int numberOfFriends;

	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	void quack() {
		
	System.out.println("quack");
	}
	
	void waddle() {
		
		JOptionPane.showMessageDialog(null, "The duck waddled away.");
	}

}
