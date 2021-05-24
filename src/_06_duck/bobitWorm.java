package _06_duck;

public class bobitWorm {
	String favoriteFood;
	int numberOfFriends;

	bobitWorm(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	  
	void dig(){
		System.out.println("the worm has dug a hole");}
	
	void trapFish() {System.out.println("the work caught a fish");}
}
