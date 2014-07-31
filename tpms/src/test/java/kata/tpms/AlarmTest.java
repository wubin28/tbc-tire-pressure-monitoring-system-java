package kata.tpms;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by benwu on 14-6-10.
 */
public class AlarmTest {

    @Test
    public void a_normal_pressure_value_should_not_raise_the_alarm() {
        // Arrange
        StubSensor stubSensor = new StubSensor();
        stubSensor.arrangeNextPressurePsiValue(Alarm.LOW_PRESSURE_THRESHOLD);
        Alarm alarm = new Alarm(stubSensor);

        // Act
        alarm.check();

        // Assert
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    public void a_pressure_value_outside_the_range_should_raise_the_alarm() {
        // Arrange
        StubSensor stubSensor = new StubSensor();
        stubSensor.arrangeNextPressurePsiValue(Alarm.HIGH_PRESSURE_THRESHOLD + 1);
        Alarm alarm = new Alarm(stubSensor);

        // Act
        alarm.check();

        // Assert
        assertTrue(alarm.isAlarmOn());
    }

    @Test
    public void a_normal_pressure_value_after_a_value_outside_the_range_should_stop_the_alarm() {
        // Arrange
        StubSensor stubSensor = new StubSensor();
        Alarm alarm = new Alarm(stubSensor);

        // Act
        stubSensor.arrangeNextPressurePsiValue(Alarm.LOW_PRESSURE_THRESHOLD - 1);
        alarm.check();

        stubSensor.arrangeNextPressurePsiValue(Alarm.LOW_PRESSURE_THRESHOLD);
        alarm.check();

        // Assert
        assertFalse(alarm.isAlarmOn());
    }
}
