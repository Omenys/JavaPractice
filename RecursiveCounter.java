public class RecursiveCounter {

    // Recursive function to count number of times specific character occurs
    public static int charCount(char[] array, char letter, int pos) {

        // Base case end of array
        if (pos >= array.length) {
            return 0;
        }
        // Check if letter matches; defaults to no match
        int i = 0;
        if (array[pos] == letter) {
            i = 1;
        }
        // Recursive method
        return i += charCount(array, letter, pos + 1);
    }

    public static void main(String[] args) {

        // Create array of characters
        char[] charArray = { 'j', 'a', 'v', 'a' };
        System.out.println(charCount(charArray, 'a', 0));
    }
}
