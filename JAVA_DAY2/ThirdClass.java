// package JAVA_DAY2;
import java.util.Scanner;
public class ThirdClass {
    private static int button;

    public static void main(String[] args) {
       // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter your age");
        //int age=sc.nextInt();
        // if(age>18){
        //     System.out.println("Adults");

        // }
        // else{
        //     System.out.println("Not Adults");
        // }


        //-----------------------------------
        //check even or odd 
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter a number");
        // int x=sc.nextInt();
        // if(x%2==0){
        //     System.out.println("number is even");
        // }
        // else{
        //     System.out.println("number is odd");
        // }


        //----------------------------------
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a first number");
        // int a=sc.nextInt();
        // System.out.println("Enter a second number");
        // int b=sc.nextInt();
        // if(a==b){
        //     System.out.println("number is equal");
        // }else if(a>b){
        //         System.out.println("a is greater");
        // }
        // else{
        //         System.out.println("a is lesser");
            
        // }

        //---------------------------------------------
        //Print the Greeting
        // Scanner sc=new Scanner(System.in);
        // int button=sc.nextInt();
        // if(button==1){
        //     System.out.println("Hello");
        // }else if(button == 2){
        //     System.out.println("Namste");
        // }else if(button ==3){
        //     System.out.println("Bonjour");
        // }else{
        //     System.out.println("Invalid Button");
        // }

     
        //---------------------------------------------
        //using switch case
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch(button) {
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("namste");
            break;
            case 3:System.out.println("bonjour");
            break;
            default:System.out.println("Invalid button");
        }
       

        
    }
}  

