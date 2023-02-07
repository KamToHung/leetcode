import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class removeSubfolders {

    class Solution {

        public List<String> removeSubfolders(String[] folder) {
            List<String> res = new ArrayList<>();
            Arrays.sort(folder);
            res.add(folder[0]);
            String pre = folder[0] + "/";
            for (int i = 1; i < folder.length; i++) {
                if (folder[i].startsWith(pre)) {
                    continue;
                }
                res.add(folder[i]);
                pre = folder[i] + "/";
            }
            return res;
        }

    }

}
