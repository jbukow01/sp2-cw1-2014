import java.util.Scanner;

public class Coursework1 {
	
	/* Software and Programming 2
	 * Coursework 1
	 * Jarek Bukowski
	 * jbukow01
	 */

	public static void main(String[] args) {
		
		int ENTRIES = 100;
		int[] data1 = new int[ENTRIES];
		int[] data2 = new int[ENTRIES];
		int counter = 0;
		int checkElem1 = 0;
		int checkCount1 = 0;
		int checkElem2 = 0;
		int checkCount2 = 0;
		boolean checkNonCommon1 = true;
		boolean checkNonCommon2 = true;
		Scanner in = new Scanner(System.in);
		
		//do loop for the first array
		do {
			System.out.print("Enter data for array 1 (0 to finish): ");
			checkElem1 = in.nextInt();
			if(checkElem1 != 0) {
				for(int i = 0; i <= checkElem1; i++) {
					if(checkElem1 == data1[i]) {
						i = checkCount1;
					//add value to the array if doesn't exist yet
					} else if (i == checkCount1) {
						data1[i] = checkElem1;
						checkCount1++;
						i = checkCount1;
					}
				}
			}
		} while (checkElem1 != 0 && checkCount1 < 100);
		
		//do loop for the second array
		do {
			System.out.print("Enter data for array 2 (0 to finish): ");
			checkElem2 = in.nextInt();
			if(checkElem2 != 0) {
				for(int i = 0; i <= checkElem2; i++) {
					if(checkElem2 == data2[i]) {
						i = checkCount2;
					//add value to the array if doesn't exist yet
					} else if (i == checkCount2) {
						data2[i] = checkElem2;
						checkCount2++;
						i = checkCount2;
					}
				}
			}
		} while (checkElem2 != 0 && checkCount2 < 100);
		
		System.out.print("Values for array 1 are: ");
		
		for (int i = 0; i < ENTRIES; i++) {
			if (data1[i] != 0) {
				System.out.print(data1[i] + " ");
			} else if (checkCount1 == 0) {
				System.out.print("Array is empty");
				break;
			}
		}
		
		System.out.print("\nValues for array 2 are: ");
		
		for (int i = 0; i < ENTRIES; i++) {
			if (data2[i] != 0) {
				System.out.print(data2[i] + " ");
			} else if (data2[1] == 0) {
				System.out.print("Array is empty");
				break;
			}
		}
		
		//print both arrays are empty if true and don't do any calculations
		if (data1[1] == 0 && data2[1] == 0) {
			System.out.print("\nBoth arrays are empty");
		//otherwise print calculations
		} else {
			System.out.print("\nCommon data is: ");
			for (int i = 0; i < ENTRIES; i++) {
				for (int j = 0; j < ENTRIES; j++) {
					if (data1[i] == data2[j]) {
						if (data1[i] != 0) {
							System.out.print(data1[i] + " ");
							counter++;
						}
					}
				}			
			}
			System.out.print("\nNumber of common data: " + counter);
			
			System.out.print("\nNon-common values for array 1 are: ");
			
			//compare first array to the second array and print if value doesn't exist
			for (int i = 0; i < ENTRIES; i++) {
				for (int j = 0; j < ENTRIES; j++) {
					checkNonCommon1 = true;
					if(data1[i] == data2[j]) {
						checkNonCommon1 = false;
						j = ENTRIES;
					}
				}
				if(checkNonCommon1) {
					System.out.print(data1[i] + " ");
				}
			}
			
			System.out.print("\nNon-common values for array 2 are: ");
			
			//compare second array to the first and print if value doesn't exist
			for (int i = 0; i < ENTRIES; i++) {
				for (int j = 0; j < ENTRIES; j++) {
					checkNonCommon2 = true;
					if(data2[i] == data1[j]) {
						checkNonCommon2 = false;
						j = ENTRIES;
					}
				}
				if(checkNonCommon2) {
					System.out.print(data2[i] + " ");
				}
			}
		}
		in.close();
	}
}