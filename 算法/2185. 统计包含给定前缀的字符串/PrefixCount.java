import java.util.Arrays;


public class PrefixCount {

    class Solution {
        public int prefixCount(String[] words, String pref) {
            return (int) Arrays.stream(words).filter(o -> o.startsWith(pref)).count();
        }
    }

}
