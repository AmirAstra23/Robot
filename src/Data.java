import java.util.*;
import java.util.stream.Collectors;

public class Data {

    public static final Map<Integer, Integer> sizeToFreq = new TreeMap<>();
    public static final Map<Integer, Integer> reverseMap = new TreeMap<>();

    public static String generateRoute(String letters, int length) {
        Random random = new Random();
        StringBuilder route = new StringBuilder();
        for (int i = 0; i < length; i++) {
            route.append(letters.charAt(random.nextInt(letters.length())));
        }
        return route.toString();
    }

    public static void addIntoMap(Integer k) {
        int one = 1;
        synchronized (Data.class) {
            if (sizeToFreq.isEmpty() || !sizeToFreq.containsKey(k)) {
                sizeToFreq.put(k, one);
            } else if (sizeToFreq.containsKey(k)) {
                int value = sizeToFreq.get(k) + 1;
                sizeToFreq.put(k, value);
            }
        }
    }

    public static void printMap() {

        for (Map.Entry<Integer, Integer> item : sizeToFreq.entrySet()) {
            reverseMap.put(item.getValue(), item.getKey());
        }
        for (Map.Entry<Integer, Integer> item : reverseMap.entrySet()) {
            System.out.println(item.getKey() + " раз " + " встречается " + item.getValue());
        }


    }
}
