package OLD;

import org.testng.annotations.Test;

    public class Concatinations {

        @Test
        public void TestStrings2() {
            String sourceStr = "Hello my name is Grenor";
            String Concatinations2 = "Jack";
            int age = 35;
            double weight = 40.50;

            System.out.println(sourceStr + Concatinations2 + (age + weight));
        }
    }
