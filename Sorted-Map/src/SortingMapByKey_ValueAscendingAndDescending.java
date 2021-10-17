import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class SortingMapByKey_ValueAscendingAndDescending {
    public static void main(String[] args) {


        //Map<Integer,Integer>
        Map<Integer, Integer> map1 = new HashMap<>();

        // sorted by asc keys / сортирани по възходящи ключове
        map1
                .entrySet()
                .stream()
                .sorted(comparingByKey())
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                HashMap::new));

        // sorted by desc keys / сортирани по низходящи ключове
        map1
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(comparingByKey()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                HashMap::new));

        //sort аsc order of value/сортиране Възходящ ред на стойността
        map1
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        // sort desc order of value / сортиране по ред на стойност сортиране Низходящ ред на стойността
        map1
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));


    }
}
