import java.util.Scanner;
public class Lab10{
    public static void main(String[] args) {
        Scanner Get = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        int mark = Get.nextInt();

        assert(mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("The Grade for the Entered Mark is: " + grade);

        boolean correctGrade = false;
        if (mark >= 75 && grade == 'A') {
            correctGrade =true;
        } else if (mark>=60 && mark <= 74 && grade =='B') {
            correctGrade = true;
        } else if (mark>=50 && mark <= 59 && grade =='C') {
            correctGrade =true;
        } else if (mark>=40 && mark <= 49 && grade =='D') {
            correctGrade =true ;
        } else if (mark<40 && grade=='F') {
            correctGrade = true ;
        }

        assert correctGrade : "Incorrect Grade Assigned";
    } 
}
