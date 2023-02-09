import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
class AuthenticationManager {
    int live;
    HashMap<String, Integer> hm;

    public AuthenticationManager(int timeToLive) {
        live = timeToLive;
        hm = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        hm.put(tokenId, currentTime);
    }

    public void renew(String tokenId, int currentTime) {
        int time = hm.getOrDefault(tokenId, -live);
        if (currentTime - time >= live)
            return;
        hm.put(tokenId, currentTime);
    }

    public int countUnexpiredTokens(int currentTime) {
        int res = 0;
        Set<String> keys = hm.keySet();
        ArrayList<String> removeList = new ArrayList<>();
        for (String key : keys) {
            if (currentTime - hm.getOrDefault(key, -live) < live)
                res++;
            else removeList.add(key);
        }
        for (String rm : removeList)
            hm.remove(rm);
        return res;
    }
}

