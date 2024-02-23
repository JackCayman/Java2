package CodeWars;

public class SumWithoutHighestAndLowestNumber {
    public static int main(String[] args) {
        int count = 0;
        int[] arrInt = new int[]{6, 2, 1, 8, 10};
        if (arrInt.length == 1 || arrInt.length == 0) {
            return 0;
        }
        if (arrInt != null) {
            int min = arrInt[0];
            int max = arrInt[0];


            for (int i = 0; i < arrInt.length; i++) {
                count = count + arrInt[i];
                if (min > arrInt[i]) {
                    min = arrInt[i];
                }
                if (max < arrInt[i]) {
                    max = arrInt[i];
                }
            }


            count = count - (max + min);
        } else {
            count = 0;
        }
        return count;
    }
}