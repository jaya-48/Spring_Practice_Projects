import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//enum Roles{
//    ADMIN,MANAGER;
//}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface AnnotationsCreation {
    String role() default "ADMIN" ;
    int value();
}
class Employee {
    @AnnotationsCreation(value = 1)
    static String Role;
}
public class AnnotationMain{
    public static void main(String[] args){
        //Employee e3=new Employee();
        Employee.Role="manager";
        System.out.println(Employee.Role);

    }
}
