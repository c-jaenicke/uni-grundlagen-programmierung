package Aufgabe53;

public class main {
    public static void main(String[] args) {
        Double[] test1 = { 6.0, 5.0, 4.0, 3.0, 2.0, 1.0 };
        Double[] test2 = { 7.0, 4.5, 3.5, 2.5, 1.5 };
        merge(test1, test2);

    }

    public static double[] merge(double[] arrayX, double[] arrayY) {
        // get length of arrays combined
        int lengthRes = (arrayX.length + arrayY.length);
        // initialize new array
        double[] resultArray = new double[lengthRes];

        // merge both arrays
        for (int i = 0; i < arrayX.length; i++) {
            resultArray[i] = arrayX[i];
        }

        for (int i = 0; i < arrayY.length; i++) {
            resultArray[i + arrayX.length] = arrayY[i];
        }

        // sort combined array
        for (int i = 0; i < lengthRes; i++) {
            for (int j = i + 1; j < lengthRes; j++) {
                double pos = 0;
                if (resultArray[j] > resultArray[i]) {
                    pos = resultArray[i];
                    resultArray[i] = resultArray[j];
                    resultArray[j] = pos;
                }
            }
        }
        return resultArray;
    }

}
