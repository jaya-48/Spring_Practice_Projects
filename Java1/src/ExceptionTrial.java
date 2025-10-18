import java.util.Scanner;

class Exception5{
    public void disp(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=a/b;
        System.out.println(result);
    }
}
public class ExceptionTrial {
    public static void main(String[] args) {
        Exception5 exc = new Exception5();
        exc.disp();
    }
}
