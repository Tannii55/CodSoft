import java.util.*;
public class QuizApplication {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String que[]={
            "1. Who invented Java Programming?",
        "2. Which component is used to compile, debug and execute the java program?",
    "3. Which of these cannot be used for a variable name in Java?"
};

    String option[]={
        "(a) Guido van Rossum\t(b) James Gosling\t(c) Dennis Ritchie",
    "(a) JRE\t(b) JIT\t(c) JDK\t(d) JVM",
    "(a) identifier & keyword\t(b) identifier\t(c) keyword"
 };

    String answer[]={"b","c","c"};
    
   
    System.out.println("<< Now Start the Quiz >>");
    System.out.println("Answer the following questions:-");
   
    for(int i=0;i<3;i++){
                    
System.out.println(que[i]);
System.out.println("Options:-");
System.out.println(option[i]);
System.out.print("Your Answer:-");

String userAns=s.next();
if(userAns.equals(answer[i])){
    System.out.println(" Correct ");

}else{

    System.out.println("Incurrect");
    System.out.println("Correct Answer is "+answer[i]);
}

System.out.println("*************");
}
   }             

}
