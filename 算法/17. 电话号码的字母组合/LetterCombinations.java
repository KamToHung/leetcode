import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    class Solution {

        /**
         * 列举所有数字对应的字母
         */
        Map<Character, String> codeMap = new LinkedHashMap<>(8);

        {
            codeMap.put('2', "abc");
            codeMap.put('3', "def");
            codeMap.put('4', "ghi");
            codeMap.put('5', "jkl");
            codeMap.put('6', "mno");
            codeMap.put('7', "pqrs");
            codeMap.put('8', "tuv");
            codeMap.put('9', "wxyz");
        }

        /**
         * 结果集
         */
        List<String> result = new ArrayList<>();

        public List<String> letterCombinations(String digits) {
            if (digits == null || digits.length() == 0) {
                return result;
            }
            // 思路: 遇到这种组合的题目, 一般都是使用回溯法
            // 如果digits的长度为2, 那么就是2个for循环，依次类推，如果digits的长度为n, 那么就是n个for循环
            // 所以可以使用回溯来穷举所有的组合
            dfs(digits, 0, new StringBuilder());
            return result;
        }

        private void dfs(String digits, int index, StringBuilder builder) {
            // 结束条件: builder的长度等于digits的长度
            if (builder.length() == digits.length()) {
                result.add(builder.toString());
                return;
            }
            // 获取当前数字对应的字母
            String letters = codeMap.get(digits.charAt(index));
            for (int i = 0; i < letters.length(); i++) {
                char code = letters.charAt(i);
                builder.append(code);
                dfs(digits, index + 1, builder);
                builder.deleteCharAt(builder.length() - 1);
            }
        }
    }

}
