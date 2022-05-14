import java.util.Scanner;
public class NumbersDivisibleBy3_and_5 {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("Enter Range:");
        int range=s.nextInt();
       for(int i=1;i<=range;i++){
           if((i % 3==0) && (i % 5==0))
                System.out.print(i + " ");
        }
    }
}
