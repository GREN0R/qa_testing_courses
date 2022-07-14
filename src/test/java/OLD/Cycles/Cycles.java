package OLD.Cycles;

import org.testng.annotations.Test;

public class Cycles {

    @Test
    public void cyclesInt() {
        for (int i = 0; i < 5; i++) {
            System.out.println(100);
        }
    }

    @Test
    public void cyclesString() {
        String name = "Grenor";
        for (int iterator = 0; iterator < name.length(); iterator++) {
            System.out.println(name.charAt(iterator));
        }
    }

    @Test
    public void forEach() {
        int[] nums = {1,22,333,4444,55555,666666,7777777};
        for (int element : nums){
            System.out.println(element);
        }
    }
}
