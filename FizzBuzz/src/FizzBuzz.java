
public class FizzBuzz {
    public static boolean fizzBuzz(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    public static boolean Fizz(int number) {
        return number % 3 == 0;
    }

    public static boolean Buzz(int number) {
        return number % 5 == 0;
    }

    public static String isFizzBuzz(int number) {
        if (fizzBuzz(number)){
            return "FizzBuzz";
        }
        if (Fizz(number)){
            return "Fizz";
        }
        if (Buzz(number)){
            return "Buzz";
        }
        return number+"";
    }
}
