
import java.util.ArrayList;
import java.util.List;


public class Algorithm {

public static void main(String[] args) {
	Algorithm x = new Algorithm();
}
Algorithm(){
	
}
static public int findBrokenEgg(List<String> c){
	 int num = 0;
	for (String e : c) {

	
		if (e.equals("cracked")) {
			
			return num;
			
		}
		num += 1;
	}
	return num;
	
}
static public int countPearls(List<Boolean> c){
	int num2 = 0;
	for (Boolean d: c) {
		
		if (d.equals(true)) {
			num2 += 1;
		}
	}
	return num2;
}
static public double findTallest(List<Double> c){
	Double num2 = 0.0;
	for (Double dd: c) {
		
		if (dd > num2) {
			num2 = dd;
		}
		
	}
	return num2;
	
}
static public String findLongestWord(List<String> c){
	 int num = 0;
	for (String ee : c) {


}
}}
