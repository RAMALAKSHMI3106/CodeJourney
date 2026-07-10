public class CountWord {
    public static void main(String[] args) {
        String input = "Hello World! Welcome to Java programming.";
        int wordCount = getCount(input);
        System.out.println("Word count: " + wordCount);
    }

    private static int getCount(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if ((i == 0 && input.charAt(i) != ' ') ||
                (i > 0 && input.charAt(i) != ' ' && input.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        return count;
    }
}