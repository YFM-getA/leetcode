package com.yfm.leetcode.countprimes;

/**
 * 统计所有小于非负整数 n 的质数的数量。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：n = 10 输出：4 解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * 
 * 示例 2：
 * 
 * 输入：n = 0 输出：0
 * 
 * 示例 3：
 * 
 * 输入：n = 1 输出：0
 * 
 * 
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/count-primes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] flags = new boolean[n + 1];
        if (2 < n) {
            count++;
        }
        for (int i = 3; i < n; i += 2) {
            if (!flags[i]) {
                for (int j = 3; i * j < n; j += 2) {
                    flags[i * j] = true;
                }
                count++;
            }
        }
        return count;
    }
}
