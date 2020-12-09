// @lc code=start
import java.math.BigInteger;

/*
 * @lc app=leetcode.cn id=62 lang=java 1 - 1 -> 1 2 - 1 -> 1 3 - 1 -> 1 2 - 2 -> 2 3 - 2 -> 3 3 - 3
 * -> 6 3 - 4 -> 10 4 - 4 -> a + 1 - b -> a -b + (a - 1) - b .. 1 (m - 1 ) n (m -2) n 1 *n
 * 
 * / a * b [62] 不同路径
 */

class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        long y = 1;
        for (int i = 1; i <= Math.min(m - 1, n - 1); i++) {
            y = y * (m + n - 1 - i) / i;
        }
        return (int) y;
    }
}
// @lc code=end

