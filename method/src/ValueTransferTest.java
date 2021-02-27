import org.junit.Test;



/**
 * @author Thinlk
 * @create 2021-02-08 11:43 PM
 **/
public class ValueTransferTest {
    int value = 10;
    int[] arr = {10,20,30};
    @Test
    public void testValueTrans() {

        System.out.println("值传递之前："+value);
        valueChange(value);
        System.out.println("值传递后："+value);

        int[] arr = {10,20,30};
        System.out.println(arr[1]);
        valueChange(arr);
        System.out.println(arr[1]);

    }

    public static void valueChange(int value) {
        value = 200;
    }

    public static void valueChange(int[] arr) {
        arr[1] = 200;
    }

}
