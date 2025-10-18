//import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class Exception2 {
    public void disp() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        int result ;
        try {

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            result = n1 / n2;
        }
        //System.out.println(result);
        finally{
            //throw new InputMismatchException("write down correctly");
            System.out.println("method");

        }
//        }
//        catch (Exception e) {
//            System.out.println("method");
//           //throw new ArithmeticException("write down correctly");
//        }
//        finally {
//            System.out.println("jaya");
//
//        }
        System.out.println(result);
    }
}
public class ExceptionMain{
    public static void main(String[] args){
        Exception2 e2=new Exception2();
        try{
            e2.disp();
        } catch (ArithmeticException | InputMismatchException e1) {
            System.out.println(e1.getMessage());
        }

    }

}
