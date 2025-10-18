import java.util.Scanner;

public class ExceptionConditional {
    public static void main(String[] args){
        int age;
        Scanner sc =new Scanner(System.in);
        age=sc.nextInt();
        if(age>=18){
            System.out.println("eligible");
        }
        else{
            System.out.println("Try again");
            age=sc.nextInt();
            if(age>=18){
                System.out.println("eligible");
            }
            else{
                System.out.println("Try again");
                age=sc.nextInt();
                if(age>=18){
                    System.out.println("eligible");
                }
                else{
                    System.out.println("Not eligible");


                }


            }


        }

    }
}
