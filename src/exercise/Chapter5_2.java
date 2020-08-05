package exercise;
//1. รับค่า รัศมีวงกลม (r)
//2. หาพื้นที่วงกลม (PI * r *r)
//3. หาเส้นรอง (2 * PI * r)
//4. หาปาริมาตรวงกลม (4/3 * PI *r*r*r)

import java.util.Scanner;

public class Chapter5_2 {

    public static final double PI = 3.141;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // รับค่า รัศมีวงกลม r
        System.out.println("ระบุรัศมีวงกลม (r): ");
        double r = scanner.nextDouble();


        //หาพื้นที่วงกลม
        double area = PI * r * r;
        System.out.println("พื้นที่วงกลม: "+area);

        //หาเส้นรอบวง
        double Cycle = 2 * PI * r;
        System.out.println("หาเส้นรอบวง: ."+Cycle);

        //หาปริมาตรทรงกลม
        double v = (4/3)*PI*r*r*r;
        System.out.println("ปริมาตรทรงกลม:"+v);





    }//main
}
