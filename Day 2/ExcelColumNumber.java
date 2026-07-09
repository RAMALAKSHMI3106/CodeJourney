public class ExcelColumNumber {
    public static void main(String[] args) {
        String columnTitle = "AB";
        int columnNumber = titleToNumber(columnTitle);
        System.out.println("The column number for " + columnTitle + " is: " + columnNumber);
    }
    private static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
