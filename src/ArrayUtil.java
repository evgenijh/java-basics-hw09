import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < array1.length; i++) {
            for (int a = 0; a < array2.length; a++) {
                if (array1[i].equals(array2[a]) && !list.contains(array1[i])) {
                    list.add(array1[i]);
                }
            }
        }
        String[] commonWords = new String[list.size()];
        for (int i = 0; i < commonWords.length; i++) {
            commonWords[i] = (String) list.get(i);
        }
        return commonWords;
    }
}
