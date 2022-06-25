import org.testng.annotations.Test;

public class OtherClass {

        @Test
        public void doit(){
            TestClassForJavaDemo testClassForJavaDemo = new TestClassForJavaDemo();

            System.out.println(testClassForJavaDemo.AGE);
            System.out.println(testClassForJavaDemo.summ(5,5));
    }
}
