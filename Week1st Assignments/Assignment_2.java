import java.util.Scanner;
public class Assignment_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Range:");
        int range=s.nextInt();
    // Print the prime numbers from 1 to n.
        for(int i=2;i<=range;i++){
            boolean isPrime=true;  // Consider given number is prime.
            for(int factor=2;factor<=i-1;factor++){
                if (i % factor ==0) {
                    isPrime=false;
                }
            }
            if (isPrime == true) {
                System.out.print(i +" ");
            }
        }
    }
}
