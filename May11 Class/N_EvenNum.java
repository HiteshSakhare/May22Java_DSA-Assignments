import java.util.Scanner;
public class N_EvenNum{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter Range:");
        int range=s.nextInt();
        System.out.println("Enter Number: ");
        int num=s.nextInt();

    // Use of while loop.
       while(num<=range){
        if(num % 2==0){
            System.out.print(num + " ");
        }
        num++;
       }
    }
}