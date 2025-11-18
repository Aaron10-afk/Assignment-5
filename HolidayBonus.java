/*
 * Class: CMSC203 
 * Instructor:Farnez Eaviazi
 * Description: This class uses the TwoDimRaggedArrayUtility class to go through and hand out bonuses 
 * Due: 11/17/2025
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Aaron Brezovec
*/
public class HolidayBonus {
	public static final double HIGHEST_BONUS = 5000.0;
	public static final double LOWEST_BONUS = 1000.0;
	public static final double OTHER_BONUS = 2000.0;

	public HolidayBonus() {
	}

	public static double[] calculateHolidayBonus(double[][] data) {
		double[] bonuses = new double[data.length];

		int highestColumns = 0;
		for (double[] row : data) {
			if (row.length > highestColumns) {
				highestColumns = row.length;
			}
		}
		for (int col = 0; col < highestColumns; col++) {
			int highestIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col);
			int lowestIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col);

			for (int row = 0; row < data.length; row++) {
				if (col >= data[row].length || data[row][col] <= 0 ){
					continue;// this skips the empty and negative numbers 
				}

				if (row == highestIndex) {
					bonuses[row] += HIGHEST_BONUS;
				} else if (row == lowestIndex) {
					bonuses[row] += LOWEST_BONUS;
				} else {
					bonuses[row] += OTHER_BONUS;
				}
			}

		}
		return bonuses;
	}

	public static double calculateTotalHolidayBonus(double[][] data) {
		double[] bonuses = calculateHolidayBonus(data);
		double total = 0;
		for (double bonus : bonuses) {
			total += bonus;
		}
		return total;
	}
}
