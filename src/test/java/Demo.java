import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by chen on 2018/12/5.
 */
public class Demo {


    @Test
    public void func1() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        ArrayDemo arrayDemo = new ArrayDemo();
        System.out.println(arrayDemo.pivotIndex(nums));
    }

    @Test
    public void func2() {
        int [] nums={0, 0, 3, 2};
        ArrayDemo arrayDemo = new ArrayDemo();
        System.out.println(arrayDemo.dominantIndex(nums));
    }

    @Test
    public void func3() {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        ArrayDemo demo = new ArrayDemo();
        Arrays.stream(demo.plusOne(nums)).forEach(System.out::println);
    }

    @Test
    public void func4() {
        String s = "9876543210";
        Long.valueOf(s);
        System.out.println(Long.valueOf(s));
    }
}
