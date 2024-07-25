import java.util.*;

class Grid {
	// do not make any changes to this method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of square array (2+): ");
		int size = input.nextInt();
		input.close();

		int[][] data = buildArray(size); // create a 2D array of desired size
		printArray(data); // display initial array
		cornerSwap(data); // swap corner values diagonally
		printArray(data); // display new array
	}

	// student code here
	private static void cornerSwap(int[][] data) {
		// swap the values between the diagonal corners
		int finalIndex = data.length-1;

		int temp = data[0][0];
		data[0][0] = data[finalIndex][finalIndex];
		data[finalIndex][finalIndex] = temp; 

		temp = data[0][finalIndex];
		data[0][finalIndex] = data[finalIndex][0];
		data[finalIndex][0] = temp; 
	}

	// do not make any changes to this method
	private static int[][] buildArray(int size) {
		int[][] data = new int[size][size];
		int value = 1;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				data[i][j] = value;
				value++;
			}
		}
		return data;
	}

	// do not make any changes to this method
	private static void printArray(int[][] data) {
		System.out.println("ARRAY CONTENTS:");
		for (int[] row : data) {
			for (int value : row) {
				System.out.print(String.format("%02d", value) + " ");
			}
			System.out.println();
		}
	}
}
