package vicinusvinum.knn;

/**
 * Created by tobias.
 */
public class ManhattanDistanceCalculator implements DistanceCalculator {
    @Override
    public Double calculate(final Double[] a, final Double[] b) {
        Double sum = 0d;

        if (a.length != b.length) {
            throw new IllegalStateException("The lengths of the a and b are not equal.");
        }

        for (int i = 0; i < a.length; i++) {
            sum += Math.abs(a[i] - b[i]);
        }
        return sum;
    }
}
