import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

public class LInkedListDemo {

    public static void main(String[] args) {

        Set<String> cars = new HashSet<String>();

        cars.add("bmw");
        cars.add("audi");
        cars.add("yarsi");
        cars.add("benze");
        cars.add("benze");


        System.out.println(cars);

      /*  for (String item : cars) {
             System.out.println(item);
        }*/

        List<String> list = new ArrayList<String>();

        list.add("bmw");
        list.add("audi");
        list.add("yarsi");
        list.add("benze");
        list.add("benze");
        System.out.println(list);

      /* // for (String car : list) {
            //   System.out.println(car);
       // }
*/
        Set<String> lHSet = new LinkedHashSet<String>();
        lHSet.add("bmw");
        lHSet.add("suv");
        lHSet.add("audi");
        lHSet.add("yarsi");
        lHSet.add("benze");
        for (String var : lHSet) {
            System.out.println(var);
        }
        System.out.println("-----------------------------");
        Set<String> lista = new TreeSet<String>();
        lista.add("bmw");
        lista.add("audi");
        lista.add("yarsi");
        lista.add("benze");

        for (String var1 : lista) {
            System.out.println(var1);
        }


    }


}
