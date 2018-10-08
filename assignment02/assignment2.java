
public class assignment2 {
	
public static void main(String []args) {
	//print out the first 12 Fibonacci numbers.
	int one = 0, two = 1;
	int result = 0;
	for (int x =1; x<14; x++) {
		System.out.println("x=" + one);
		result = one + two;
		one = two;
		two = result;
	}
	
}
}
