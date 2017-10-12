import java.util.*;

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
