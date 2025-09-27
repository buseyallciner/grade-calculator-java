import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        double total=0;
        System.out.println("--- Grade Calculator ---");
        Scanner input=new Scanner(System.in);
        System.out.println("How many courses");
        int courseCount=input.nextInt();
        System.out.println("Courses: "+courseCount);

        for(int i=1;i<=courseCount;i++){
            System.out.println("Enter grade for course: ");
            double grade=input.nextDouble();
            total+=grade;
        }
        double average=total/courseCount;
        System.out.println("Average grade: "+average);

        if(average>=60){
            System.out.println("Result:Passed");
        } else {
            System.out.println("Result:Failed");
        }

    }


}
