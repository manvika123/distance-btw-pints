import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class distance {

    public static void main(String[] args) {

        double x1, x2, y1, y2;
        Scanner sc= new Scanner(System.in);
        x1= sc.nextDouble();
        x2= sc.nextDouble();
        y1= sc.nextDouble();
        y2= sc.nextDouble();

        double distance = sqrt(pow((x2-x1),2.0)+pow((y2-y1),2.0));
        System.out.println("distance btw two points is"+distance);
    }
}
