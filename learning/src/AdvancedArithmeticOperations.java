import java.util.Scanner;

public class AdvancedArithmeticOperations extends ArithmeticOperations
{

    private int a ;
    private int b;

    private void readvalues(){
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();

    }
    /*public void sum(){
        System.out.println("enter the values: ");
        *//*int a;int b;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();*//*
        readvalues();
        int c = a+b;
        System.out.println("answer is " + c);

    }*/
//    public void sub(){
//        System.out.println("enter the values: ");
//        /*int a;int b;
//        Scanner scanner=new Scanner(System.in);
//        a=scanner.nextInt();
//        b=scanner.nextInt();*/
//        readvalues();
//        int c = a-b;
//        System.out.println("answer is " + c);
//    }
    public void reminder(){
        System.out.println("enter the values: ");
        /*int a;int b;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();*/
        readvalues();
        int c = a % b;
        System.out.println("reminder is " + c);
    }
}

/*AdvancedArithmeticOperations aaops =new AdvancedArithmeticOperations();
        aaops.reminder();
        aaops.sum();
        aaops.prod();
*/