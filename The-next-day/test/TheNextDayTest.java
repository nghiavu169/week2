import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheNextDayTest {

    @Test
    void getNextDayMonthYear() {
        int[] expected = {1, 3, 2020};
        int[] result = TheNextDay.getDayMonthYear(29, 2, 2020);
        for (int i = 0; i < 3; i++) {
            assertEquals(result[i],expected[i]);
        }
    }
}