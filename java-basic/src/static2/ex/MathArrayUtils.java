package static2.ex;

public class MathArrayUtils {

    public static int sum(int[] values)
    {
        int sum = 0;
        for(int value : values)
        {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values)
    {
        int length = values.length;
        return (double) sum(values) / length;
    }
    public static int min(int[] values)
    {
        int min = Integer.MAX_VALUE;
        for(int value : values)
        {
            min = Math.min(min, value);
        }
        return min;
    }
    public static int max(int[] values)
    {
        int max = Integer.MIN_VALUE;
        for(int value : values)
        {
            max = Math.max(max, value);
        }
        return max;
    }
}
