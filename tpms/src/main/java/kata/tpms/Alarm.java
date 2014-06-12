package kata.tpms;

/**
 * Created by benwu on 14-6-10.
 */
public class Alarm {
    public static final double LOW_PRESSURE_THRESHOLD = 17;
    public static final double HIGH_PRESSURE_THRESHOLD = 21;
    private Detector detector;

    private boolean alarmOn = false;

    public Alarm() {
        this.detector = new Sensor();
    }

    public Alarm(Detector detector) {
        this.detector = detector;
    }

    public void check()
    {
        alarmOn = false;
        double psiPressureValue = detector.popNextPressurePsiValue();

        if (psiPressureValue < LOW_PRESSURE_THRESHOLD || HIGH_PRESSURE_THRESHOLD < psiPressureValue)
        {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn()
    {
        return alarmOn;
    }
}
