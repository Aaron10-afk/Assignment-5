
/*
 * Class: CMSC203 
 * Instructor:Farnez Eaviazi
 * Description: This class performs multiple functions for files, rows, columns and the array
 * Due: 11/17/2025
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Aaron Brezovec
*/
import java.io.*;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

	public TwoDimRaggedArrayUtility() {

	}

	public static double[][] readFile(File file) throws FileNotFoundException {
		// temp 10x10 array to store raw string values
		String[][] temp = new String[10][10];
		Scanner input = new Scanner(file);
		int row = 0;
		// Read each line up to the 10th row
		while (input.hasNextLine() && row < 10) {
			String line = input.nextLine().trim();
			// skip empty strings
			if (line.isEmpty())
				continue;
			// store value in temp
			String[] tokens = line.split(" ");
			for (int c = 0; c < tokens.length && c < 10; c++) {
				temp[row][c] = tokens[c];
			}
			row++;
		}
		input.close();
		// if file has no valid lines return null
		if (row == 0) {
			return null;
		}
		// final array
		double[][] data = new double[row][];

		for (int r = 0; r < row; r++) {
			// count how many columns are not empty
			int col = 0;
			for (int c = 0; c < 10; c++) {
				if (temp[r][c] != null)
					col++;
				else
					break;
			}
			// create a new row with the updated column length
			data[r] = new double[col];
			// converting the strings to doubles
			for (int c = 0; c < col; c++) {
				data[r][c] = Double.parseDouble(temp[r][c]);
			}
		}
		return data;

	}

	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
		try {
			PrintWriter writer = new PrintWriter(outputFile);
	        for (double[] row : data) {
	            for (int c = 0; c < row.length; c++) {
	                writer.print(Double.toString(row[c])); // writes values
	                if (c < row.length - 1) // adds a space unless the last value in the row
	                    writer.print(" ");
	            }
	            writer.print("\n"); 
	        }
	        writer.close();
	    } catch (Exception e) {
	        // does this if writer fails
	        throw new FileNotFoundException("Unable to write to file: " + outputFile.getName());
	    }
	}

	public static double getTotal(double[][] data) {
		double sum = 0;
		for (double[] row : data) {
			for (double value : row) {
				sum += value;
			}
		}
		return sum;

	}

	public static double getAverage(double[][] data) {
		double sum = 0;
		int count = 0;
		for (double[] row : data) {
			for (double value : row) {
				sum += value;
				count++;
			}
		}
		if (count == 0) {
			return 0;
		} else {
			return (sum / count);
		}

	}

	// Row Operations
	public static double getRowTotal(double[][] data, int row) {
		double total = 0;
		for (double value : data[row]) {
			total += value;
		}
		return total;
	}

	public static double getHighestInRow(double[][] data, int row) {
		double highest = data[row][0];
		for (double value : data[row]) {
			if (value > highest) {
				highest = value;
			}
		}
		return highest;
	}

	public static int getHighestInRowIndex(double[][] data, int row) {
		double highest = data[row][0];
		int index = 0;
		int i = 0;
		for (double value : data[row]) {
			if (value > highest) {
				highest = value;
				index = i;
			}
			i++;
		}
		return index;

	}

	public static double getLowestInRow(double[][] data, int row) {
		double lowest = data[row][0];
		for (double value : data[row]) {
			if (value < lowest) {
				lowest = value;
			}
		}
		return lowest;
	}

	public static int getLowestInRowIndex(double[][] data, int row) {
		double lowest = data[row][0];
		int index = 0;
		int i = 0;
		for (double value : data[row]) {
			if (value < lowest) {
				lowest = value;
				index = i;
			}
			i++;
		}
		return index;
	}

	// Column Operations
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0;
		for (double[] row : data) {
			if (col < row.length) {
				total += row[col];
			}
		}
		return total;

	}

	public static double getHighestInColumn(double[][] data, int col) {
		Double highest = null;
		for (double[] row : data) {
			if (col < row.length) {
				if (highest == null || row[col] > highest) {
					highest = row[col];
				}
			}
		}
		return highest;
	}

	public static int getHighestInColumnIndex(double[][] data, int col) {
		Double highest = null;
		int index = -1;
		int i = 0;
		for (double[] row : data) {
			if (col < row.length) {
				if (highest == null || row[col] > highest) {
					highest = row[col];
					index = i;
				}
			}
			i++;
		}
		return index;
	}

	public static double getLowestInColumn(double[][] data, int col) {
		Double lowest = null;
		for (double[] row : data) {
			if (col < row.length) {
				if (lowest == null || row[col] < lowest) {
					lowest = row[col];
				}
			}
		}
		return lowest;
	}

	public static int getLowestInColumnIndex(double[][] data, int col) {
		Double lowest = null;
		int index = -1;
		int i = 0;
		for (double[] row : data) {
			if (col < row.length) {
				if (lowest == null || row[col] < lowest) {
					lowest = row[col];
					index = i;
				}
			}
			i++;
		}
		return index;
	}

	// Array Operations
	public static double getHighestInArray(double[][] data) {
		double highest = data[0][0];
		for (double[] row : data)
			for (double value : row)
				if (value > highest)
					highest = value;
		return highest;
	}

	public static double getLowestInArray(double[][] data) {
		double lowest = data[0][0];
		for (double[] row : data)
			for (double value : row)
				if (value < lowest)
					lowest = value;
		return lowest;
	}

}
