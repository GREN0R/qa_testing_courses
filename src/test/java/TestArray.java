import org.testng.annotations.Test;

public class TestArray {

    @Test
    public void checkArray() {
 //       for (int i = 1; i <= 10000; i++) {
//            System.out.println(i);
//        }

//        String name = "Grygory";
//        for (int interator = 0; interator < name.length(); interator++){
//            System.out.println(name.charAt(interator));

        int[] nums = {2,3,6,22,332,123,12,12,3,123};

        for (int element : nums){
            System.out.println(element);
        }
    }
}

