//import static jdk.internal.org.jline.utils.Colors.s;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Checker {
    boolean check(int a);
}
public class Main {
    public static void main(String[] args) {
//        Stat1 n = new Stat(5,5);
//        //System.out.println(Stat.var2);
//        ((Stat) n).method2();
//        n.method1();
        LambdaEx e1=new LambdaEx();
        e1.disp();
        Checker c=(int a)->(a>0)?true:false;
        System.out.println(c.check(-2));
        Llambda2 l2=new Llambda2();
        //l2.disp2(Arrays.asList("jaya","lakshmi","pureti"));
        l2.disp2();
        l2.length1();
        Imp i1=new Imp();
        i1.disp(new form1());
        i1.disp(new form2());
        i1.disp(new form3());
    }
}