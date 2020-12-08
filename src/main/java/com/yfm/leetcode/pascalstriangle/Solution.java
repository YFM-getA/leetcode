package com.yfm.leetcode.pascalstriangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>(1);
        row1.add(1);
        result.add(row1);
        if (numRows == 1) {
            return result;
        }
        List<Integer> row2 = new ArrayList<>(1);
        row2.add(1);
        row2.add(1);
        result.add(row2);
        if (numRows == 2) {
            return result;
        }
        for (int i = 3; i<= numRows; i++) {
            List<Integer> last = result.get(result.size() - 1);
            List<Integer> row = new ArrayList<>(i);
            row.add(1);
            for (int j = 1; j < i - 1; j++) {
                row.add(last.get(j - 1) + last.get(j));
            }
            row.add(1);
            result.add(row);
        }

        return result;
    }
}
// @lc code=end

