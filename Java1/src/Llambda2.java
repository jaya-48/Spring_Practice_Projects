import java.util.Arrays;
import java.util.List;

public class Llambda2 {
    List<String> strs= Arrays.asList("jaya","lakshmi","pureti");
    List<Integer>nums=Arrays.asList(-1,1,-2,2,-3,3);
    public void disp2(){
        strs.forEach(str->System.out.println(str));
    }
    public void length1(){
        strs.forEach((str1)->System.out.println(str1.length()));
        nums.forEach(num->System.out.println((num>0)?"positive":"negative"));

    }
}
