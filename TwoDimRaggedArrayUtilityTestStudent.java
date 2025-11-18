import static org.junit.jupiter.api.Assertions.*;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] dataSet2 = new double[][] {{7, 2, 9, 4},{5},{8, 1, 3},{11, 6, 7, 2} };

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	// Totals & Averages
    @Test
    void testGetTotal() {
        assertEquals(65.0, TwoDimRaggedArrayUtility.getTotal(dataSet2));
    }

    @Test
    void testGetAverage() {
        assertEquals(65.0 / 12.0, TwoDimRaggedArrayUtility.getAverage(dataSet2));
    }

    // Row operations
    @Test
    void testGetRowTotal() {
        assertEquals(22.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet2, 0));
        assertEquals(5.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet2, 1));
        assertEquals(12.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet2, 2));
        assertEquals(26.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet2, 3));
    }

    @Test
    void testGetHighestInRow() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet2, 0));
        assertEquals(5.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet2, 1));
        assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet2, 2));
        assertEquals(11.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet2, 3));
    }

    @Test
    void testGetHighestInRowIndex() {
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet2, 0));
        assertEquals(0, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet2, 1));
        assertEquals(0, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet2, 2));
        assertEquals(0, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet2, 3));
    }

    @Test
    void testGetLowestInRow() {
        assertEquals(2.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet2, 0));
        assertEquals(5.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet2, 1));
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet2, 2));
        assertEquals(2.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet2, 3));
    }

    @Test
    void testGetLowestInRowIndex() {
        assertEquals(1, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet2, 0));
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet2, 1));
        assertEquals(1, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet2, 2));
        assertEquals(3, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet2, 3));
    }

    // Column operations
    @Test
    void testGetColumnTotal() {
        assertEquals(31.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 0));
        assertEquals(9.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 1));
        assertEquals(19.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 2));
        assertEquals(6.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 3));
    }

    @Test
    void testGetHighestInColumn() {
        assertEquals(11.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet2, 0));
        assertEquals(6.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet2, 1));
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet2, 2));
        assertEquals(4.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet2, 3));
    }

    @Test
    void testGetHighestInColumnIndex() {
        assertEquals(3, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet2, 0));
        assertEquals(3, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet2, 1));
        assertEquals(0, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet2, 2));
        assertEquals(0, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet2, 3));
    }

    @Test
    void testGetLowestInColumn() {
        assertEquals(5.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet2, 0));
        assertEquals(2.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet2, 1));
        assertEquals(3.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet2, 2));
        assertEquals(2.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet2, 3));
    }

    @Test
    void testGetLowestInColumnIndex() {
        assertEquals(1, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet2, 0));
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet2, 1));
        assertEquals(2, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet2, 2));
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet2, 3));
    }
	// Array-wide operations
    @Test
    void testGetHighestInArray() {
        assertEquals(11.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet2));
    }

    @Test
    void testGetLowestInArray() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet2));
    }
}
