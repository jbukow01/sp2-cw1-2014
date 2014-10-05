import java.util.Scanner;
import java.util.Arrays;

public class Coursework {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int ENTRIES = 5;
		int[] data1 = new int[ENTRIES];
		int[] data2 = new int[ENTRIES];
		int check = -1;
		int counter = 0;
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < data1.length; i++) {
			System.out.print("Enter data for array 1 (0 to finish): ");
			check = in.nextInt();
			if (check == 0) {
				break;
			}
			data1[i] = check;
		}
		for (int i = 0; i < data2.length; i++) {
			System.out.print("Enter data for array 2 (0 to finish): ");
			check = in.nextInt();
			if (check == 0) {
				break;
			}
			data2[i] = check;
		}
		System.out.print("Values for array 1 are: ");
		for (int i = 0; i < data1.length; i++) {
			if (data1[i] != 0) {
				System.out.print(data1[i] + " ");
			} else if (data1[1] == 0) {
				System.out.print("Array is empty");
				break;
			}
		}
		System.out.print("\nValues for array 2 are: ");
		for (int i = 0; i < data2.length; i++) {
			if (data2[i] != 0) {
				System.out.print(data2[i] + " ");
			} else if (data2[1] == 0) {
				System.out.print("Array is empty");
				break;
			}
		}
		System.out.print("\nCommon data is: ");
		for (int x = 0; x < data1.length; x++) {
			for (int y = 0; y < data2.length; y++) {
				if (data1[x] == data2[y]) {
					if (data1[x] != 0) {
						System.out.print(data1[x] + " ");
						counter++;
					}
				}
			}			
		}
		System.out.print("\nNumber of common data: " + counter);
		System.out.print("\nNon-common values for array 1 are: ");
		System.out.print("\nNon-common values for array 2 are: ");
	}

}