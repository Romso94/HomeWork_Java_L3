public class Main {
    public static void main(String[] args) {

        MyNumbers mynumbers = new MyNumbers(5);

        mynumbers.setNumber(10,0);
        mynumbers.setNumber(78,1);
        mynumbers.setNumber(56,2);
        mynumbers.setNumber(15,3);
        mynumbers.setNumber(25,4);



        mynumbers.setNumber(15,0);
        mynumbers.setNumber(56,7);

        System.out.println("Average of the array is : "+ mynumbers.Average());
    }
}