package Lesson2;

public class ExpApp {
    public static void main(String[] args) {

        try {
           int a = 10;
           int b =2;
            System.out.println("a/b="+(a/b));
            b=0;
            System.out.println("a/b="+(a/b));
            System.out.println();
        }catch (ArithmeticException ae){
            System.out.println("Поймал ошибку");
            ae.printStackTrace();
        }
        try {
            System.out.println( divFirstAndSecond(args));
        }catch (ArithmeticException ae){
            System.out.println("zer0 exeption");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bount array");
        }catch (Exception ex){
            System.out.println("somting wrong");
        }finally {
            System.out.println("вополняется всегда)");
        }
    }

    static int div (int a,int b){
        return div2(a,b);
    }
    static int div2 (int a,int b){



        return a/b;
    }
    static int divFirstAndSecond(String[]array) throws Exception {
           int a =Integer.parseInt(array[0]);
           int b = Integer.parseInt(array[1]);
           if (b == 10){
               throw new MyCustomExp("not / 10");
           }
        return a/b;
    }
}
