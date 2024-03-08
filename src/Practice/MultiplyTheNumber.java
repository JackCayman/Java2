package Practice;

public class MultiplyTheNumber {
    public static void main(String[] args) {

        int b;
        int number = 10;
        if (number < 0) {
            String str = Integer.toString(number);
            b = str.length() - 1;
        } else {
            String str = Integer.toString(number);
            b = str.length();
        }
        int result = (int) (number * (Math.pow(5, b)));
        System.out.println(result);
    }

}
