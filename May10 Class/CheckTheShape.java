import java.util.Scanner;

public class CheckTheShape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length and Width: ");
        int length=sc.nextInt();
        int Width=sc.nextInt();
        int area;
        area=length*Width;

        if (length==Width) {

            System.out.println("Its Rectangle. and area of rectangle is: " + area);
        }
        else{
            System.out.println("Its not a Rectangle.");
        }
    }
    
}
