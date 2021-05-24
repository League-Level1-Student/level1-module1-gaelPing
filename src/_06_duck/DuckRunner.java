package _06_duck;

public class DuckRunner {
public static void main(String[] args) {
	Duck shuba=new Duck("bread",3);
	System.out.println(shuba.favoriteFood);
	shuba.quack();
	shuba.waddle();
}
}
