import java.util.Random;


public class ArrayListPuzzles {
	Random r;
public static void main(String[] args) {
	ArrayListPuzzles x = new ArrayListPuzzles();
}
ArrayListPuzzles(){
	r = new Random();
	String[] food = {"bread", "Chicken", "Steak"};
	int x = r.nextInt(3);
	if (x == 0) {
		System.out.println("Eat bread tonight");
	}
	if (x == 1) {
		System.out.println("Eat chicken tonight");
	}
	if (x == 2) {
		System.out.println("Eat Steak tonight");
	}
}
}
