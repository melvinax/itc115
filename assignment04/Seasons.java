import java.util.Scanner;

public class Seasons {
		
	public static void main(String[]args) {
		season();
	}
	
	public static void season() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the day to find Season: ");
		int day = scan. nextInt ();
		
		System.out.println("Enter the month to find Season: ");
		int month = scan.nextInt();
		
		if (month == 1 || month == 2) {
			System.out.println ("Season is Winter");
		}
		else if (month==3) {
			if (day<=15) {
				System.out.println(("Season is Winter"));				
			} else {
				System.out.println("Season is Spring");
			}
		}
		else if (month==4 || month== 5) {
			System.out.println("Season is Spring");
		} 
		else if (month==6) {
			if (day<=15) {
				System.out.println("Season is Spring");
			}else {
				System.out.println("Season is Summer");
			}
		}else if (month ==7 || month==8) {
			System.out.println("Season is Summer");			
		}
		else if (month==9) {
			if (day<=15) {
				System.out.println("Season is Summer");
			}
			else {
				System.out.println("Season is Fall");
			}
		}else if (month ==10 || month ==11) {
			System.out.println("Season is Fall");
		}
		else if (month==12) {
			if (day<=15) {
				System.out.println("Season is Fall");	
			}
			else {
				System.out.println("Season is Winter");
			}
		}
	
	}
		
}


