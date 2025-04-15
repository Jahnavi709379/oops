import java.util.Scanner;

/*
This method solves the basic Addition, Subtraction, Divison and Multiplication
 */
public class ArithmeticOperations {

    private int value1;
    private int value2;

    public static void printDescription(){
        System.out.println("This class solves ArithmeticOperations");
    }

    private void readValues(){
        Scanner scanner= new Scanner(System.in);
        value1 =scanner.nextInt();
        value2 =scanner.nextInt();
    }

    public void sum(){
        System.out.println("Enter the sum value: ");
        //int value1, value2;
        //Scanner scanner = new Scanner(System.in);
        //value1 = scanner.nextInt();
        //value2 = scanner.nextInt();
        readValues();

        int c = value1 + value2;
        System.out.println("Sum is: "+ c);


    }
    public void sub(){
        System.out.println("Enter two numbers: ");

        /*int value1, value2;
        Scanner scanner = new Scanner(System.in);
        value1 = scanner.nextInt();
        value2 = scanner.nextInt();*/
        readValues();

        int c = value1 - value2;
        System.out.println("Sub is: "+ c);

    }
    public void division(){
        System.out.println("Enter two numbers: ");

//        int value1, value2;
//        Scanner scanner = new Scanner(System.in);
//        value1 = scanner.nextInt();
//        value2 = scanner.nextInt();
        readValues();
        int c = value1 / value2;
        System.out.println("div is: "+ c);
    }

    public void prod(){
        System.out.println("Enter two numbers: ");

        /*int value1, value2;
        Scanner scanner = new Scanner(System.in);
        value1 = scanner.nextInt();
        value2 = scanner.nextInt();*/
        readValues();

        int c = value1 * value2;
        System.out.println("prod is: "+ c);
    }
}




//        ArithmeticOperations arOps=new ArithmeticOperations();
//        arOps.sum();