package kata.tpms;

/**
 * Created by benwu on 14-6-12.
 */
public class FakeSensor implements Detector {
    private double nextPressurePsiValue;

    public void fakeNextPressurePsiValue(double nextPressurePsiValue) {
        this.nextPressurePsiValue = nextPressurePsiValue;
    }

    @Override
    public double popNextPressurePsiValue() {
        return this.nextPressurePsiValue;
    }
}
