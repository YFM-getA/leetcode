package com.yfm.leetcode.taskscheduler;
/*
 * @lc app=leetcode.cn id=621 lang=java 1. 对任务进行分组 conut 1 2 3 4 , 123 ,1 ,1 1 -> 1 2 -> [621] 任务调度器
 */

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testInteval() {
        char[] tasks = new char[] { 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int leastInterval = new Solution().leastInterval(tasks,2);
        System.out.println(leastInterval);
    }
}
