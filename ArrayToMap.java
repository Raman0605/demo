import java.util.*;
public class ArrayToMap {
    public static void main(String[] args) {
        List<String> KEY_LIST = Arrays.asList("Number One", "Number Two", "Number Three", "Number Four", "Number Five");
        List<Integer> VALUE_LIST = Arrays.asList(1, 2, 3, 4, 5);
        Map<String, Integer> result = new HashMap<>();
        if (KEY_LIST.size() == VALUE_LIST.size()) {
            for (int i = 0; i < KEY_LIST.size(); i++)
                result.put(KEY_LIST.get(i), VALUE_LIST.get(i));
        }
        System.out.println(result);
    }
}


