package _06_duck;

public class BobitWormRunner {
public static void main(String[] args) {
	bobitWorm wormy=new bobitWorm("fish", 3);
	System.out.println(wormy.numberOfFriends);
	System.out.println(wormy.favoriteFood);
	wormy.dig();
	wormy.trapFish();
}
}
