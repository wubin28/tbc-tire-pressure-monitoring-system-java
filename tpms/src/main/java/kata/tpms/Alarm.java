package kata.tpms;

/**
 * Created by benwu on 14-6-10.
 */
public class Alarm {
    public static final double LOW_PRESSURE_THRESHOLD = 17;
    private final double HighPressureThreshold = 21;

    // TODO-working-on: Depending on a concrete Sensor violates the Dependency Inversion Principle and Open-Closed Principle
    private Sensor sensor = new Sensor();

    private boolean alarmOn = false;

    // TODO: Retain the original interface for the default constructor of Alarm
    public Alarm(Transducer transducer) {

    }

    public void check()
    {
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if (psiPressureValue < LOW_PRESSURE_THRESHOLD || HighPressureThreshold < psiPressureValue)
        {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn()
    {
        return alarmOn;
    }
}
