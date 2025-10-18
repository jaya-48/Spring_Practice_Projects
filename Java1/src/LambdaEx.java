interface Ex {
    String s1();
}
public class LambdaEx {
    Ex e=()->"jaya lakshmi";
    public void disp() {
        System.out.println(e.s1());
    }
}
