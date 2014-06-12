package kata.tpms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by benwu on 14-6-10.
 */
public class AlarmTest {
    @Test
    public void a_normal_pressure_value_should_not_raise_the_alarm() {
        // Arrange
        FakeSensor fakeSensor = new FakeSensor();
        fakeSensor.fakeNextPressurePsiValue(Alarm.LOW_PRESSURE_THRESHOLD);
        Alarm alarm = new Alarm(fakeSensor);

        // Act
        alarm.check();

        // Assert
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    public void a_pressure_value_outside_the_range_should_raise_the_alarm() {
        // Arrange
        FakeSensor fakeSensor = new FakeSensor();
        fakeSensor.fakeNextPressurePsiValue(Alarm.HIGH_PRESSURE_THRESHOLD + 1);
        Alarm alarm = new Alarm(fakeSensor);

        // Act
        alarm.check();

        // Assert
        assertTrue(alarm.isAlarmOn());
    }

    // TODO-acceptance-test: a normal pressure value after a value outside the range should not stop the alarm
    // TODO-new-feature: the alarm will be turned off before each checking of pressure
}
