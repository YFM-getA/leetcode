package com.yfm.leetcode.splitarrayintofibonaccisequence;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=842 lang=java
 *
 * [842] 将数组拆分成斐波那契序列
 */

// @lc code=start
public class Solution {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> index = new ArrayList<>();
        List<Integer> make = make(S, 0, index);
        if (make == null) {
            return Collections.emptyList();
        }
        return make;
    }

    private List<Integer> make(String s, int index, List<Integer> list) {
        System.out.println("index: " + index + " list:" + list);
        if (index == s.length()) {
            return list;
        }
        if (list.size() < 2) {
            for (int i = index + 1; i < s.length() - 2 + list.size(); i++) {
                String x = s.substring(index, i);
                if (x.startsWith("0") && x.length() > 1) {
                    continue;
                }
                if (i - index >= 12) {
                    continue;
                }
                long item = Long.valueOf(s.substring(index, i));
                if (item > 1<<31 - 1) {
                    continue;
                }
                List<Integer> tempList = new ArrayList<>(list);
                tempList.add(Long.valueOf(item).intValue());
                List<Integer> res = make(s, i, tempList);
                if (res.size() > 0) {
                    return res;
                }
            }
        } else {
            for (int i =  index + 1; i <= s.length(); i++) {
                String x = s.substring(index, i);
                if (x.startsWith("0") && x.length() > 1) {
                    continue;
                }
                if (i - index > 12) {
                    continue;
                }
                long item = Long.valueOf(s.substring(index, i));
                if (item >= 1<<31) {
                    continue;
                }
                if (item == list.get(list.size() - 1) + list.get(list.size() - 2)) {
                    List<Integer> tempList = new ArrayList<>(list);
                    tempList.add(Long.valueOf(item).intValue());
                    List<Integer> res = make(s, i, tempList);
                    if (res.size() > 0) {
                        return res;
                    }
                }
            }
        }
        return Collections.emptyList();
    }
}
// @lc code=end

