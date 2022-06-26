package OLD;

import org.testng.annotations.Test;

public class Arrays {
    @Test
    public void Arrays() {
        int age = 35;
        int age2 = 40;
        int age3 = 45;
        int age4 = 28;
        int age5 = 30;
        int[] arr = {35,40,45,28,30};
        int arr2d[] = {35,40,45,28,30};
//        System.out.println(arr[0]);

        arr[0] = 25;

        System.out.println(arr[0]);
        int arrDefault[]= new int[10];
        System.out.println(arrDefault[3]);
    }
}
