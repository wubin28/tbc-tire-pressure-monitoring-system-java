package kata.tpms;

/**
 * Created by benwu on 14-6-10.
 */
public class Alarm {
    public static final double LOW_PRESSURE_THRESHOLD = 17;
    private final double HighPressureThreshold = 21;

    private Transducer transducer = null;

    private boolean alarmOn = false;

    public Alarm() {
        this.transducer = new Sensor();
    }

    public Alarm(Transducer transducer) {
        this.transducer = transducer;
    }

    public void check()
    {
        double psiPressureValue = transducer.popNextPressurePsiValue();

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
