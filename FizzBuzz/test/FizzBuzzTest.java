import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void isFizzBuzz() {
        String expected = "FizzBuzz";
        String result = FizzBuzz.isFizzBuzz(15);
        assertEquals(expected, result);
    }
}