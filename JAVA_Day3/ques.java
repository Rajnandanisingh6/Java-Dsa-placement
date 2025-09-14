package JAVA_Day3;
import java.util.Scanner;
public class ques {
    public static void main(String[] args) {
        //print the sum of first n Natural Numbers.
        //n=4;
        //1+2+3+4=10
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     sum=sum+i;
        // }
        // System.out.println(sum);

        //-------------------------
        //print the table of a number input by the user
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(n*i);
        }

    }
    
}
