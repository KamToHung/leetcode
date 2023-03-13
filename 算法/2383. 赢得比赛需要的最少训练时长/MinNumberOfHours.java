/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class MinNumberOfHours {

    class Solution {

        public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
            int n = energy.length, res = 0;
            for (int i = 0; i < n; i++) {
                // 如果初始化能量小于当前能量，那么需要补充能量
                if (initialEnergy <= energy[i]) {
                    // 每一个小时训练能量+1,所以需要的时间为当前能量-初始化能量+1
                    int time = energy[i] - initialEnergy + 1;
                    res += time;
                    initialEnergy += time;
                }
                // 如果初始化经验小于当前经验，那么需要补充经验
                if (initialExperience <= experience[i]) {
                    // 每一个小时训练经验+1,所以需要的时间为当前经验-初始化经验+1
                    int time = experience[i] - initialExperience + 1;
                    res += time;
                    initialExperience += time;
                }
                // 每次比赛完后，初始化能量要减去当前能量
                initialEnergy -= energy[i];
                // 每次比赛完后，初始化经验要加上当前经验
                initialExperience += experience[i];
            }
            return res;
        }

    }

}
