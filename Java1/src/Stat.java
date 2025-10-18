//import javax.xml.namespace.QName;

class Stat1{
    int var2=30;
    static{
        System.out.println("jayalakshmi");
    }
    {
        System.out.println("jayalakshmi1");
    }
    Stat1(){
        //result=var+var1;
        System.out.println("java");
    }
    public static  void  method1(){
        System.out.println("parent class method1 ");
    }
}
public class Stat extends Stat1{

    Stat(int var, int var1) {
        //super(var, var1);
        System.out.println(var+var1);
    }
    static{
        System.out.println("jayalakshmi2");
    }
    {
        System.out.println("jayalakshmi3");
        System.out.println(var2);
    }
    public void method2(){
        System.out.println("child class method1 ");
    }
}
