import org.testng.annotations.Test;

public class OblastVidimosti {

    double age = 10.0;

    @Test
    public void doit(){
        System.out.println(age);
    }
    @Test
    public void doitTo(){
        System.out.println(age);
        age = 20.5;
        System.out.println(age);
    }
}
