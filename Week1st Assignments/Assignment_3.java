import java.util.Scanner;
public class Assignment_3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Range:");
        int range=s.nextInt();
        for(int i=0;i<=range;i++){
            System.out.println("Enter Two Numbers: ");
            int num1=s.nextInt();
            int num2=s.nextInt();
            if(i % 2 == 0){
                int result=num1+num2;
                System.out.println("Sum of two numbers: " + result);
            }
            else{
                int mul=num1*num2;
                System.out.println("Multiplication of two numbers: " + mul);
            }
        }
    }
}
