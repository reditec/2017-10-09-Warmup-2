import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> gesamteListe = new ArrayList();
        gesamteListe = insertMultiples(3, 1000, gesamteListe);
        gesamteListe = insertMultiples(5, 1000, gesamteListe);
        gesamteListe.sort(Comparator.naturalOrder());
        Integer counter = 0;
        for (Integer i: gesamteListe)
        {
            counter += i;
        }

        System.out.println(counter);
    }

    public static List insertMultiples(Integer base, Integer max, List myList)
    {
        if(myList == null)
        {
            myList =  new ArrayList();
        }

        for(Integer myBase = base; myBase < max; myBase += base)
        {
            if(!myList.contains(myBase))
            {
                myList.add(myBase);
            }

        }

        return myList;
    }
}
