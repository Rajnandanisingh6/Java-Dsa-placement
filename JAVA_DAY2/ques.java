import java.util.Scanner;
public class ques {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a first number");
        int a=sc.nextInt();
        System.out.println("Enter a Second number");
        int b=sc.nextInt();
        int operator=sc.nextInt();
        //1 : + (Addition) a + b
        // 2 : - (Subtraction) a - b
        // 3 : * (Multiplication) a * b
        // 4 : / (Division) a / b
        // 5 : % (Modulo or remainder) a % b
        switch (operator){
            case 1:System.out.println("Addition is : " + a+b);
            break;
            case 2:System.out.println("subtraction is : " + (a-b));
            break;
            case 3:System.out.println("Multiplication is : " + (a*b));
            break;
            case 4:if(b==0){
                System.out.println("invalid division");
            }else{
                System.out.println(a/b);
            }
            break;
            case 5:if(b==0){
                System.out.println("invalid division");              
            }else{
                System.out.println(a%b);
            }
            break;

        }
        

        
        
    }
    
}








// Homework Problems
// 1.Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.
//2. Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

