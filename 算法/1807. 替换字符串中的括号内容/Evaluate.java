import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Evaluate {

    class Solution {
        public String evaluate(String s, List<List<String>> knowledge) {
            // 构建散列表
            Map<String, String> memo = knowledge.stream().collect(Collectors.toMap(e -> e.get(0), e -> e.get(1)));
            boolean flag = false;
            int start = 0;
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    start = i;
                    flag = true;
                } else if (c == ')') {
                    // 获取括号中的内容 左闭右开
                    String value = s.substring(start + 1, i);
                    if (memo.containsKey(value)) {
                        result.append(memo.get(value));
                    } else {
                        result.append('?');
                    }
                    flag = false;
                } else if (!flag) {
                    result.append(c);
                }
            }
            return result.toString();
        }
    }

}
