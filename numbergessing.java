import java.util.*;
class numbergessing{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int n=r.nextInt(100);
        int round=5;
        System.out.println("---Start Game---");
        System.out.println("You have only "+round+" rounds to guess a correct number");
        while(round>0){
        System.out.print("Guess a number(0-100):-");
        int a=s.nextInt();
        if(a==n){
            System.out.println("Congratulations!, You guessed the Number");
            int score=(round*100)/5;
            System.out.println("---Your Score is "+score);
            break;
        }else if(a>n){
            System.out.println("Number is too high, pls choose another");
        }else{
            System.out.println("Number is too low, pls choose another");
        }
        round--;
        }
        if(round==0){
            System.out.println("You had reached your limit");
            System.out.println("----Your Score is 0----");
            
        }

    }
}