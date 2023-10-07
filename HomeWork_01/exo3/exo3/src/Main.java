import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> NumbersInput = new ArrayList<>();
        int number,minimum,maximum,sum;
        double OlympicAVG,AVG;
        Scanner scanner = new Scanner(System.in);


            System.out.println("Enter a number");
            number = scanner.nextInt();

            if(number==-1){
                return;
            }

            while (number>=0){
                NumbersInput.add(number);

                System.out.println("Enter a number");
                number = scanner.nextInt();

            }

            minimum = NumbersInput.get(0);
            maximum = NumbersInput.get(0);
            sum = NumbersInput.get(0);

            for(int i=1;i<NumbersInput.size();i++){

                if(minimum>NumbersInput.get(i)){
                    minimum = NumbersInput.get(i);
                }

                if(maximum<NumbersInput.get(i)){
                    maximum = NumbersInput.get(i);
                }

                sum += NumbersInput.get(i);

            }


            OlympicAVG =(double)(sum - maximum - maximum) / (NumbersInput.size()-2);
            AVG = (double) sum / NumbersInput.size();

            System.out.println("The Olympic Average of all numbers inputed is : "+ OlympicAVG);
            System.out.println("The average of all numbers inputed is :" + AVG);


    }
}