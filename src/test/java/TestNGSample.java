import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGSample {
//adding a comment
    @Test
    public void test1() {
        System.out.println("test1");

    }

//adding a comment for test4
    @Test
    public void test4() {
        System.out.println("test4");

    }
//one comment
    @Test
    public void test2() {
        System.out.println("test2");
        Assert.fail();
    }
    //one more comment
    @Test
    public void test3() {
       System.out.println("test3");
    }
}
