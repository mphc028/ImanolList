package CinemaJava;
public class ArraysUtils {
    private ArraysUtils() {}
    
    public static String toString(Object[] array)
    {
        if (array == null || array.length==0) return "";
        String text = array[0].getClass().getSimpleName() + ":\n";
        for (int i = 0; i < array.length; i++)
            text += "   " + Integer.toString(i) +": "+ String.valueOf(array[i]) + "\n";
        return text;
    }
}
