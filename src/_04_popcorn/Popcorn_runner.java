package _04_popcorn;

public class Popcorn_runner {
public static void main(String[] args) {
	Microwave micro = new Microwave();
	Popcorn corn = new Popcorn("butter");
	
	micro.putInMicrowave(corn);
	micro.setTime(2);
	micro.startMicrowave();
}
}
