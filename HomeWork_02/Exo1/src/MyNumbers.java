import java.util.Arrays;

public class MyNumbers {
    protected int[] ArrayNumbers;

    public MyNumbers(int arraySize) {
        ArrayNumbers = new int[arraySize];

    }

    public void setNumber(int number, int index) {

        if (index >= ArrayNumbers.length || index < 0) {
            System.out.println("Wrong index, can't insert " + number + " at position " + index + " !");
            return;
        }

        for (int i = 0; i < ArrayNumbers.length; i++) {
            if (ArrayNumbers[i] == number) {
                System.out.println("Number " + number +" already in the array !");
                return;
            }
        }

        ArrayNumbers[index] = number;

    }

    public int getNumberbyIndex(int index) {
        if (index < 0 || index >= ArrayNumbers.length) {
            System.out.println("Wrong index !");
            return -1;
        }
        return ArrayNumbers[index];
    }

    public int getIndexbyNumber(int number) {
        for (int i = 0; i < ArrayNumbers.length; i++) {
            if (number == ArrayNumbers[i]) {
                return i;
            }
        }
        System.out.println("Number not in the array");
        return -1;
    }

    public int Average(){
        int sum = 0,avg = 0;
        for (int i = 0; i<ArrayNumbers.length; i++){
            sum += ArrayNumbers[i];
        }

        avg = (int) ((double) sum/ ArrayNumbers.length);

        return avg;
    }

}