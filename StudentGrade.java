import java.util.*;
class StudentGrade{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String subject[]={"Maths","Science","English","Computer","Hindi"};
        int marks[]=new int[subject.length];
        int sum=0;

        for(int i=0;i<marks.length;i++){
            System.out.print("Enter the marks of "+subject[i]+" subject:- ");
            marks[i]=s.nextInt();
            sum=sum+marks[i];

        }
          float avg=sum/marks.length;
        System.out.println("The average percentage is "+avg+"%");
        if(avg>=80){
            System.out.println("Grade:-'A'");
        }else if(avg>=60 && avg<80){
            System.out.println("Grade:-'B'");
        }else if(avg>=40 && avg<60){
            System.out.println("Grade:-'C'");
        }else{
            System.out.println("Grade:-'D'");
        }


    }
}