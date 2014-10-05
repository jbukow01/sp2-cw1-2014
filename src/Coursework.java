import java.util.Scanner;
import java.util.Arrays;

public class Coursework {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int ENTRIES = 5;
		int[] data = new int[ENTRIES];
		int check = -1;
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < data.length; i++) {
			System.out.print("Enter data for array 1 (0 to finish): ");
			check = in.nextInt();
			if (check == 0) {
				break;
			}
			data[i] = check;
		}
		System.out.print("Values for array 1 are: ");
		for (int i = 0; i < data.length; i++) {
			if (data[i] != 0) {
				System.out.print(data[i] + " ");
			} else if (data[1] == 0) {
				System.out.print("Array is empty");
				break;
			}
		}
			//System.out.println("Values for array 1 are: " + Arrays.toString(data1));
	}

}
