import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Range:");
        int range=s.nextInt();
    //HomeWork: Print numbers divisible by 3 or 5 in given range.
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
