package com.yfm.leetcode.taskscheduler;
/*
 * @lc app=leetcode.cn id=621 lang=java 1. 对任务进行分组 conut 1 2 3 4 , 123 ,1 ,1 1 -> 1 2 -> [621] 任务调度器
 */

// @lc code=start
public class Solution {
     public int leastInterval(char[] tasks, int n) {
        if (tasks.length < 1) {
            return 0;
        }
        if (n < 1) {
            return tasks.length;
        }
        int[] times = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            times[tasks[i] - 65]++;
        }
        int maxTimes = 0;
        int replica = 0;
        for (int i = 0; i < 26; i++) {
            if (times[i] > maxTimes) {
                maxTimes = times[i];
                replica = 1;
            } else if (times[i] == maxTimes) {
                replica++;
            }
        }
        return ((maxTimes - 1) * (n + 1)  + replica) > tasks.length ? ((maxTimes - 1) * (n + 1)  + replica) : tasks.length;

    }
}
// @lc code=end

