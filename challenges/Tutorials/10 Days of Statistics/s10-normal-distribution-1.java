class Solution {
    final static Double E = 2.71828;

    public static void main(String[] args) {
        Double x = 20.0;
        Double s = 2.0;

        Double n = 19.5;
        Double m1 = 20.0;
        Double m2 = 22.0;

        System.out.format("%.3f\n", cumulativeNormalDist(n, x, s));
        System.out.format("%.3f", cumulativeNormalDist(m2, x, s) - cumulativeNormalDist(m1, x, s));
    }

    static Double phi(Double d) {
        return Math.pow(E, d * d * (-0.5)) / (Math.sqrt(2.0 * Math.PI));
    }

    static Double normalDist(Double x, Double mean, Double sdev) {
        return (1.0 / sdev) * phi((mean - x) / sdev);
    }

    static Double cumulativeNormalDist(Double x, Double mean, Double sdev) {
        return 0.5 * (1.0 + erf((x - mean) / (sdev * Math.sqrt(2.0))));
    }

    static Double erf(Double z) {
        Double t = 1.0 / (1.0 + 0.5 * Math.abs(z));

        // use Horner's method
        Double ans = 1 - t * Math.exp(-z * z - 1.26551223 +
                t * (1.00002368 +
                        t * (0.37409196 +
                                t * (0.09678418 +
                                        t * (-0.18628806 +
                                                t * (0.27886807 +
                                                        t * (-1.13520398 +
                                                                t * (1.48851587 +
                                                                        t * (-0.82215223 +
                                                                                t * (0.17087277))))))))));
        if (z >= 0)
            return ans;
        else
            return -ans;
    }
}
