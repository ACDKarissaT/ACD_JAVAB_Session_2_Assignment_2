package assignment2;

public class Assignment2 {
	public static void main(String[] args) {
		int i, j;
		int n = 3;
		
		for(i = 0; i < n; i++) {
			for (j=0; j < n-i; j++) {
				System.out.print(" ");
			}
			for(j = 0; j < i; j++) {
				System.out.printf("%c", (char)(j+65));
			}
			for(j=i;j>=0;j--) {
				System.out.printf("%c", (char)(j+65));
			}
			System.out.println();
		}
		for(i = n-2; i >= 0; i--) {
			for (j=0; j < n-i; j++) {
				System.out.print(" ");
			}
			for(j = 0; j < i; j++) {
				System.out.printf("%c", (char)(j+65));
			}
			for(j=i;j>=0;j--) {
				System.out.printf("%c", (char)(j+65));
			}
			System.out.println();
		}
		
	}
}
