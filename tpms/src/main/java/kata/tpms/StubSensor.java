package kata.tpms;

/**
 * Created by benwu on 14-7-31.
 */
public class StubSensor implements Transducer {
    private double nextPressurePsiValue;

    public void arrangeNextPressurePsiValue(double nextPressurePsiValue) {
        this.nextPressurePsiValue = nextPressurePsiValue;
    }

    @Override
    public double popNextPressurePsiValue() {
        return this.nextPressurePsiValue;
    }
}
