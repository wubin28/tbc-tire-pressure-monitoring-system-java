package kata.tpms;

/**
 * Created by benwu on 14-6-10.
 */
public class Alarm {
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;

    // TODO: Violate the Dependency Inversion Principle and Open-Closed Principle
    private Sensor sensor = new Sensor();

    private boolean alarmOn = false;

    public void check()
    {
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue)
        {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn()
    {
        return alarmOn;
    }
}
