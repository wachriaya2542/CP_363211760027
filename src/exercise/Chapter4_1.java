package exercise;

import java.util.Scanner;

public class Chapter4_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a test 1: " );
        int a = scanner.nextInt();
        System.out.println("Enter a test 2: " );
        int b = scanner.nextInt();
        System.out.println("Enter a test 3: " );
        int c = scanner.nextInt();
        System.out.println("Enter a test 4: " );
        int d = scanner.nextInt();
        System.out.println("Enter a test 5: " );
        int e = scanner.nextInt();
        System.out.println("Enter a test 6: " );
        int f = scanner.nextInt();
        System.out.println("Enter a test 7: " );
        int g = scanner.nextInt();
        System.out.println("Enter a test 8: " );
        int s = scanner.nextInt();
        System.out.println("Enter a test 9: " );
        int i = scanner.nextInt();
        System.out.println("Enter a test 10:" );
        int t = scanner.nextInt();

        int total = a + b + c + d + e + f + g + s + i + t;
        int avg = total / 10;

        System.out.println("Total : "+total);
        System.out.println("Auerage:"+avg);









    }


}
