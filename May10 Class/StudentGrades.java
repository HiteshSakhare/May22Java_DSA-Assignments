import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Marks: ");
        int marks=s.nextInt();

        // Check the grade of student

        if(marks>0 && marks<100){
            if (marks>90) {
                System.out.println("A Grade.");
            }
            else if(marks>60){
                System.out.println("B Grade");
            }
            else if(marks>=40){
                System.out.println("C Grade.");
            }
            else{
                System.out.println("You are Failed ! try again.");
            }
        }
        else{
            System.out.println("Invalid Marks. Please Enter correct Marks.");
        }
    }
}
