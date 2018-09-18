import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGSample {

    @Test
    public void test1() {
        System.out.println("test1");

    }

    @Test
    public void test2() {
        Assert.fail();
    }
}