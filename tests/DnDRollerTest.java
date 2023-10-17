import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DnDRollerTest {
    @Test
    public void canMakeADnDRoller() {
        DnDRoller r2d6 = new DnDRoller(2, 6);
        RNG myRNG = new FakeRNG(3, 6);
        r2d6.setRng(myRNG);
        int result = r2d6.roll();
        assertThat(result, equalTo(9));
    }
}