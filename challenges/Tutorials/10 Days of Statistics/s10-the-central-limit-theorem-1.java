class Solution {
    final static Double E = 2.71828;

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Double max = 9800.0;
        Double boxes = 49.0;
        Double mean = 205.0;
        Double sdev = 15.0;

        Double meanPrime = mean * boxes;
        Double sdevPrime = sdev * Math.sqrt(boxes);
        System.out.format("%.4f", cumulativeNormalDist(max, meanPrime, sdevPrime));
    }

    static Double phi(Double d) {
        return Math.pow(E, d * d * (-0.5)) / (Math.sqrt(2.0 * Math.PI));
    }

    static Double normalDist(Double x, Double mean, Double sdev) {
        return (1.0 / sdev) * phi((mean - x) / sdev);
    }

    static Double cumulativeNormalDist(Double x, Double mean, Double sdev) {
        return 0.5 * (1.0 + erf2((x - mean) / (sdev * Math.sqrt(2.0))));
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

    static Double erf2(Double z) {
        Double t = 1.0 / (1.0 + 0.47047 * Math.abs(z));
        Double poly = t * (0.3480242 + t * (-0.0958798 + t * (0.7478556)));
        Double ans = 1.0 - poly * Math.exp(-z * z);
        if (z >= 0)
            return ans;
        else
            return -ans;
    }
}
