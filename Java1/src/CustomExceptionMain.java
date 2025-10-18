import java.util.Scanner;

class CustomAgeException extends RuntimeException{
    String c1;
    public CustomAgeException(String msg){
        this.c1=msg;
        System.out.println("CustomException"+c1);
    }

}
class Exception3{
    public void method() {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("eligible");
        } else {
            throw new CustomAgeException("Age Exception caught");

        }
//        } catch (CustomAgeException e1) {
//            System.out.println("Try again");
//            try{
//                age = sc.nextInt();
//                if (age >= 18) {
//                    System.out.println("eligible");
//                } else {
//                    throw new CustomAgeException("Age Exception caught");
//
//                }
//            } catch (CustomAgeException e2) {
//                System.out.println("Try again");
//                try{
//                    age = sc.nextInt();
//                    if (age >= 18) {
//                        System.out.println("eligible");
//                    } else {
//                        throw new CustomAgeException("Age Exception caught");
//
//                    }
//                } catch (CustomAgeException e3) {
//                    System.out.println("Not eligible");
//                }
//            }
//        }
    }
}
public class CustomExceptionMain {
    public static void main(String[] args){
        Exception3 e2=new Exception3();
//        try{
//            e2.method();
//        } catch (CustomAgeException e) {
//            //throw new RuntimeException(e);
//            System.out.println("Try again");
//            try{
//                e2.method();
//            } catch (CustomAgeException e1) {
//                //throw new RuntimeException(e);
//                System.out.println("Try again");
//                try{
//                    e2.method();
//                } catch (CustomAgeException e4) {
//                    //throw new RuntimeException(e);
//                    System.out.println("Sorry");
//
//                }
//
//            }
//
//        }
        e2.method();
    }
}
