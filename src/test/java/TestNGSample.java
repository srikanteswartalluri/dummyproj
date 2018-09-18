import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGSample {

    @Test
    public void test1() {
        System.out.println("test1");

    }

    @Test
    public void test2() {
        System.out.println("test2");
        Assert.fail();
    }
    
    @Test
    public void test3() {
       System.out.println("test3");
    }
}
