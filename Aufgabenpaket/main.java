package Aufgabe34;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Boolean result = evaluateBs(true, false, false);

        System.out.println(result);
    }

    public static Boolean evaluateBs(Boolean x1, Boolean x2, Boolean x3) {
        if ( (x1 != x2) && (x2 == x3)) {
            return true;
        } else if (x1 == x2) {
            return false;
        } else if (x1 == x2 == x3) {
            return false;
        } else {
            return x1;
        }
    }
}