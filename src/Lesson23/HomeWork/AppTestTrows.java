package Lesson2.HomeWork;

public class AppTestTrows {
    public static void main(String[] args) {
        String[][] strOfNums = {{"0", "0", "0", "0"}, {"0", "0", "0", "0"},
                {"0", "0", "0", "0"}, {"0", "4", "4,", "0"}};

        try {
            expTransformAndSum(strOfNums);
        } catch (MyArraySizeException mae) {
            mae.printExpInfo();
        } catch (MyArrayDataException made) {

        }

    }

    public static void expTransformAndSum(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4) {
            throw new MyArraySizeException();
        } else {
            for (int i = 0; i != array.length; i++) {
                if (array[i].length != 4) {
                    throw new MyArraySizeException();
                }
            }
        }

        int sumArray = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sumArray += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    System.out.println("MyArrayDataException in "+"["+i+"]["+j+"]");
                    throw new MyArrayDataException();

                }

            }
        }
        System.out.println("Сумма всех элементов массива = " + sumArray);
    }

}
