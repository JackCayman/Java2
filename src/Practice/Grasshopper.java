package Practice;

public class Grasshopper {
    public static void main(String[] args) {
        ddd(70,70,100);
       int a = 345;

    }

    public static void ddd(int s1, int s2, int s3) {
        char scoreChar = 'x';
        int score = ((s1 + s2 + s3) / 3);

        if (score >= 90 && score <= 100) {
            scoreChar = 'A';
        }
        if (score >= 80 && score < 90) {
            scoreChar = 'B';
        }
        if (score >= 70 && score < 80) {
            scoreChar = 'C';
        }
        if (score >= 60 && score < 70) {
            scoreChar = 'D';
        }
        if (score >= 0 && score < 60) {
            scoreChar = 'F';
        }
        System.out.println(scoreChar);
    }
}
