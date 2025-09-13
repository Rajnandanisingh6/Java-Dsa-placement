import java.util.Scanner;
public class Ques {
    public static void main(String[] args) {
        //ques 1
        // int age =20;
        // float marks=66.5F;
        // System.out.println("age : " + age);
        // System.out.println("marks : " + marks);

        //ques 2
        //area of circle is pi*r square
        //radius r=C/2pi
         //input
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a radius");
        // int radius=sc.nextInt();
        // double circle=3.14f*radius*radius;
        // System.out.println("Area of circle : " + circle);

        //-------------------------
        //Calculate radius
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a circumference");
        double circumference=sc.nextDouble();
        double radius=circumference /(2*Math.PI) ;
        System.out.println("Calulate radius : " + radius );
        



        

        
// Homework Problems
// 1 -Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.

// 2 -Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
//  3-Make a program that prints the table of a number that is input by the user. 
// (HINT - You will have to write 10 lines for this but as we proceed in the course you will be studying about ‘LOOPS’ that will simplify your work A LOT!)



    }
    
}
