package kata.tpms;

/**
 * Created by benwu on 14-6-10.
 */
public class Alarm {
    public static final double LOW_PRESSURE_THRESHOLD = 17;
    public static final double HIGH_PRESSURE_THRESHOLD = 21;

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
        alarmOn = false;
        double psiPressureValue = transducer.popNextPressurePsiValue();

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
