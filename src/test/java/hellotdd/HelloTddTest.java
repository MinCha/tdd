package hellotdd;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HelloTddTest {
    private HelloTdd sut = new HelloTdd();

    @Test
    public void mustSayHelloTdd() {
        Assert.assertTrue(sut.say().equals("Hello Tdd"));
        Assert.assertEquals(sut.say(), "Hello Tdd");
    }

    @Test
    public void mustSayHelloTddUsingHamcrest() {
        assertThat(sut.say(), is("Hello Tdd"));
    }
}
