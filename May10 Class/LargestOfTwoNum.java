import java.util.Scanner;
public class LargestOfTwoNum {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter Two numbers: ");
       int num1=s.nextInt();
       int num2=s.nextInt();
       
       if(num1>num2){
           System.out.println(num1 + " is largest.");
       }
       else{
           System.out.println(num2 + " is largest.");
       }
    }
}
