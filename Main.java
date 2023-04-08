import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(" Enter an x value(degrees) :");
    double angleDeg = input.nextDouble();
    double angleRad = angleDeg * (Math.PI / 180 );
    double function =  3 * Math.sin(Math.sin(angleRad- (3 * Math.PI / 4)) + 1);
    System.out.println("The point is:" + " ( " + angleRad + "," + function + " ) " );
  }
}