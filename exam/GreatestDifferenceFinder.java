package exam;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] Array) {
        if (Array.length < 2) {
            return 0;
        }
        int max = Array[0];
        int min = Array[1];

        for (int i=0; i<Array.length; i++) {

            if (max < Array[i]) {
                max = Array[i];
            }
            if (min > Array[i]) {
                min = Array[i];
            }
        }
        return max - min;
    }
}
