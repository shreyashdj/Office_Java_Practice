import java.util.*;

//2. Create a method that takes a Map<String, String>
//     and return the values as a separate array.
//     Return the keys sorted alphabetically, and their corresponding values in the same order.
//        Examples getValues({ "a": "1", "b": "2", "c": "3" } )
//        ➞ ["1", "2", "3"]
//
//        getValues({ "a": "Apple", "b": "Microsoft", "c": "Google" })
//        ➞ ["Apple", "Microsoft", "Google"]
public class Main {
        public static void getSortedValues(Map<String, String> map) {
        String [] valueArr = new String[map.size()];
        Object[] keyArr = map.keySet().toArray();
        Object[] sortedKeys = Arrays.stream(keyArr).sorted().toArray();
        for (int i = 0; i < sortedKeys.length; i++) {
            valueArr[i] = map.get((String) sortedKeys[i]);
        }
        System.out.println(Arrays.toString(valueArr));
    }
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("c", "3");
        map.put("b", "2");
        map.put("Jayant", "5");
        map.put("Abhishek", "1");
        map.put("Anushka", "3");
        map.put("Amit", "2");
        map.put("Danish", "4");
        getSortedValues(map);

        Map<String, String> map1 = new TreeMap<>(map);
        System.out.println(map1);
        /*
            Output :
                Printing Array of values after sorting keys alphabetically :  [1, 2, 3, 4, 5, 1, 2, 3]
                Printing map key value pairs after sorting keys using TreeMap : {Abhishek=1, Amit=2, Anushka=3, Danish=4, Jayant=5, a=1, b=2, c=3}
         */
    }
}