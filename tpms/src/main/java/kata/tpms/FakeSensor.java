package kata.tpms;

/**
 * Created by benwu on 14-6-12.
 */
public class FakeSensor implements Detector {
    private double[] nextThreeValues;
    private int i = 0;

    public void fakeNextPressurePsiValue(double nextPressurePsiValue) {
        this.nextThreeValues = new double[] {nextPressurePsiValue};
    }

    @Override
    public double popNextPressurePsiValue() {
        return nextThreeValues[i++];
    }

    public void fakeNextThreePressurePsiValues(double[] nextThreeValues) {
        this.nextThreeValues = nextThreeValues;
    }
}
