import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=1338 lang=java
 *
 * [1338] 数组大小减半
 */

// @lc code=start
class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : arr) {
            if (countMap.containsKey(i)) {
                countMap.put(i, countMap.get(i) + 1);  
            } else {
                countMap.put(i, 1);
            }
        }
        int c = 0;
        List<Integer> cc = countMap.values().stream().sorted().collect(Collectors.toList());
        System.out.println(cc);
        for (int i  = cc.size() - 1; i >=0; i--) {
            c += cc.get(i);   
            if (c >= arr.length / 2) {
                return i + 1;     
            }
        }
        return 0;
    }
}
// @lc code=end

