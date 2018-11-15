
public class isSorted {
	public static void main (String[] args) {
		double[] list1 = {16.1, 12.3, 22.2,14.4};
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		
		if (isSorted(list1)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if (isSorted(list2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	//write method that accepts an array of numbers as parameter and returns true if list is sorted or false otherwise.
	public static boolean isSorted(double[] list) {
			double lastValue = 0.0;
		int counter = 0;
		for (double n : list) {
			if (counter > 0)
			{
				if (lastValue > n) {
				return false;
				}
			}
			lastValue = n;
			counter ++;
		}
		return true;
	}
}
