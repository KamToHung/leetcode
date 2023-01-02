class AreNumbersAscending {

    class Solution {

        public boolean areNumbersAscending(String s) {
            // 遍历字符串，遇到数字就记录下来，遇到空格就判断数字是否递增，记录当前数字，用于下一个数字做比较
            if (s == null || s.length() == 0) {
                return false;
            }
            // 前一个数字 题目条件是小于100的正整数，所以设置-1即可
            int preNum = -1;
            // 当前位置
            int pos = 0;
            while (pos < s.length()) {
                // 如果是数字
                if (isNumber(s.charAt(pos))) {
                    int curNum = 0;
                    // 连续数字作为一个整数
                    while (pos < s.length() && isNumber(s.charAt(pos))) {
                        // 计算当前数字, s.charAt(pos) - '0' 得到的是数字的ASCII码，减去0的ASCII码得到数字
                        curNum = curNum * 10 + (s.charAt(pos) - '0');
                        pos++;
                    }
                    if (curNum <= preNum) {
                        return false;
                    }
                    preNum = curNum;
                } else  {
                    // 非数字则位置+1
                    pos++;
                }
            }
            return true;
        }

        private boolean isNumber(char ch) {
            return ch >= '0' && ch <= '9';
        }


    }


}