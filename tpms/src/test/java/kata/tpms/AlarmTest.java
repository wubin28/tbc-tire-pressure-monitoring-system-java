package kata.tpms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-6-10.
 */
public class AlarmTest {
    @Test
    public void a_trivial_test() {
        assertEquals(5, 2 +3 );
    }

    // TODO-acceptance-test: a normal pressure value should not raise the alarm
    // TODO-acceptance-test: a pressure value outside the range should raise the alarm
    // TODO-acceptance-test: a normal pressure value after a value outside the range should not stop the alarm
    // TODO-new-feature: the alarm will be turned off before each checking of pressure
}
