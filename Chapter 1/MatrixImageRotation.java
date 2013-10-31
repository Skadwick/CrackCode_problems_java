// Author: Josh Shadwick
// Date: 10-31-13
//
// Problem: 
// 1.6 Given an image represented by an NxN matrix, where each 
// pixel in the image is 4 bytes, write a method to rotate 
// the image by 90 degrees. Can you do this in place?

public class MatrixImageRotation {


	private static char[][] rotate(char[][] matrix) {

		
	}


	private static void printMatrix(char[][] matrix) {
		for(int x = 0; x < matrix.length; x++) {
			for(int y = 0; y < matrix[x].length; y++) {
				System.out.print(matrix[x][y] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		char[][] matrixImg = {
			{'O','O','O','O','O'},
			{'X','X','X','X','X'},
			{'O','O','O','O','O'},
			{'X','X','X','X','X'},
			{'O','O','O','O','O'}
		};
		char[][] rotatedMatrix;

		//Displaying matrix before rotation.
		System.out.println("Initial matrix image: ");
		printMatrix(matrixImg);

		//Displaying matrix after rotation.
		rotatedMatrix = rotate(matrixImage);
		System.out.println("Rotated matrix image: ");
		printMatrix(rotatedMatrix);
	}
}