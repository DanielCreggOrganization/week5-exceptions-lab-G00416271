package ie.atu.exceptions;

public class UncheckedExceptionsFix {
    public static void main(String[] args) {
        String text = "the quick brown fox jumped over the lazy dog";
        System.out.println(text.length()); // Throws NullPointerException

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[3]); // Throws ArrayIndexOutOfBoundsException
    }
}