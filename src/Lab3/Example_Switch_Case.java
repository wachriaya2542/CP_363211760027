package Lab3;

import java.util.Scanner;

public class Example_Switch_Case {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //dislay menu
        System.out.println("What is youe favorite food ?");
        System.out.println("1.KFC");
        System.out.println("2.Pizza");
        System.out.println("3.MK");
        System.out.println("Please, select (1-3):");
        int select = sc.nextInt();

        switch (select) {
            case  1: System.out.println("I love KFC too.");
                     break;
            case  2: System.out.println("I getting fat because I ate pizz a lot.");
                     break;
            case  3: System.out.println("It too expensive for me.");
                     break;
            default: System.out.println("Please ,enter number 1-3 Thank.");



        }//suitch
    }
}
