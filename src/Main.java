/**
 * Warmup II
 * Main.java
 * Purpose: Finds the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author Felix Bartling
 * @version 1.02 10/12/17
 * @since 10/09/2017
 */

public class Main {

    public static void main(String[] args) {
        Integer sum = 0;

        for(Integer i=1; i < 1000; i++)
        {
            if(isDividable(i, 3) || isDividable(i, 5))
            {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    public static boolean isDividable(int number, int dividor)
    {
        return number % dividor == 0;
    }
}
