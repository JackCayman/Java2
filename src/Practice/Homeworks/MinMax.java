package Practice.Homeworks;

public class MinMax {
    public static void main(String[] args) {

        double[] arr = new double[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        double max = arr[0];
        double min = arr[0];
        double avg = 0;
        for (double v : arr) {
            if(max < v){
                max = v;
            }
            if ( min > v){
                min = v;
            }
            avg += v/arr.length;
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("avg: " + avg);
    }
}
