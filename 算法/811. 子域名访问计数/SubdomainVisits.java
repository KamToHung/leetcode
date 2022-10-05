import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SubdomainVisits {

    class Solution {

        public List<String> subdomainVisits(String[] cpdomains) {
            Map<String, Integer> memo = new HashMap<>();
            for (String cpdomain : cpdomains) {
                String[] split = cpdomain.split(" ");
                // 次数
                int count = Integer.parseInt(split[0]);
                // 域名
                String domain = split[1];
                memo.put(domain, memo.getOrDefault(domain, 0) + count);
                String[] domainStrs = domain.split("\\.");
                for (int i = 0; i < domainStrs.length; i++) {
                    int index = domain.indexOf(".");
                    if (index == -1) {
                        break;
                    }
                    if (index > 0) {
                        domain = domain.substring(index + 1);
                        memo.put(domain, memo.getOrDefault(domain, 0) + count);
                    }
                }
            }
            return memo.entrySet().stream().map(entry -> entry.getValue() + " " + entry.getKey()).collect(Collectors.toList());
        }

    }

}
