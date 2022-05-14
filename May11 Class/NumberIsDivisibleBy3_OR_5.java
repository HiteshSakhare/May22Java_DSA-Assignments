import java.util.Scanner;
public class NumberIsDivisibleBy3_OR_5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Range:");
        int range=s.nextInt();
    //HomeWork
        for(int i=1;i<=range;i++){
            if(i % 3==0){
                 System.out.print(i + " ");
            }
            else if(i % 5==0){
                System.out.print(i + " ");
            }
            
         }
    }
}
