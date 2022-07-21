import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindWords {

    static class Solution {

        static Map<Character, Integer> maps;

        static {
            maps = new HashMap<>(26);
            maps.put('q', 1);
            maps.put('w', 1);
            maps.put('e', 1);
            maps.put('r', 1);
            maps.put('t', 1);
            maps.put('y', 1);
            maps.put('u', 1);
            maps.put('i', 1);
            maps.put('o', 1);
            maps.put('p', 1);
            maps.put('a', 2);
            maps.put('s', 2);
            maps.put('d', 2);
            maps.put('f', 2);
            maps.put('g', 2);
            maps.put('h', 2);
            maps.put('j', 2);
            maps.put('k', 2);
            maps.put('l', 2);
            maps.put('z', 3);
            maps.put('x', 3);
            maps.put('c', 3);
            maps.put('v', 3);
            maps.put('b', 3);
            maps.put('n', 3);
            maps.put('m', 3);
        }

        public String[] findWords(String[] words) {
            List<String> result = new ArrayList<>();
            for (String word : words) {
                char[] chs = word.toCharArray();
                if (chs.length == 0) {
                    continue;
                }
                if (chs.length == 1) {
                    result.add(word);
                }
                Integer state = maps.get(chs[0]);
                int num = state == null ? maps.get((char) (chs[0] + 32)) : state;
                if (num == 0) {
                    continue;
                }
                boolean flag = false;
                for (int i = 1; i < chs.length; i++) {
                    if ((maps.get(chs[i]) != null && num != maps.get(chs[i])) || (maps.get((char) (chs[i] + 32)) != null && num != maps.get((char) (chs[i] + 32)))) {
                        break;
                    }
                    if (i == chs.length - 1) {
                        flag = true;
                    }
                }
                if (flag) {
                    result.add(word);
                    flag = false;
                }
            }
            return result.toArray(new String[result.size()]);
        }
    }

}
