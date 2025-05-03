import static org.junit.Assert.*;
import org.junit.Test;

import com.averageTest.Average;

public class averageTest {

    @Test
    public void testAverageNormalCase() {
        Average avg = new Average();
        int[] list = {2, 4, 6, 8};
        assertEquals(2, avg.average(1, list));  // (2+4)/2 = 3
    }

    @Test
    public void testAverageAllElements() {
        Average avg = new Average();
        int[] list = {1, 2, 3, 4};
        assertEquals(2, avg.average(4, list));  // (1+2+3+4)/4 = 2
    }

    @Test
    public void testAverageMoreThanLength() {
        Average avg = new Average();
        int[] list = {10, 20};
        assertEquals(15, avg.average(5, list));  // (10+20)/2 = 15
    }

    @Test
    public void testAverageEmptyList() {
        Average avg = new Average();
        int[] list = {};
        assertEquals(0, avg.average(3, list));  // n = 0
    }

    @Test
    public void testAverageZeroK() {
        Average avg = new Average();
        int[] list = {5, 10, 15};
        assertEquals(0, avg.average(0, list));  // n = 0
    }
}

