public class array{
        
    /**
	 * Addiert alle Elemente des Arrays auf und gibt die Summe zurück.
	 * 
	 * @param inputArray Der Eingabearray mit double Werten, die aufaddiert werden sollen.
	 * @return Die Summe (double) aller Werte des Eingabearrays
	 */
    public static void main(String[] args){
	     double[] testArray = {10.0, 5, 12, 20.0};
	     addUp(testArray);
	 }
	 
    public static double addUp(double[] inputArray){
        double sumArray = 0;
        for (int i = 0; i < inputArray.length ;i++){
            System.out.println(inputArray[i]);
            sumArray = sumArray + inputArray[i];
            
        }
        return sumArray;
    }
}