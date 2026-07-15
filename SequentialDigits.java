import java.util.ArrayList;
import java.util.List;

/*
LeetCode 1291 - 顺次数
题目链接：https://leetcode.cn/problems/sequential-digits/
题意：找出[low,high]内所有顺次数，顺次数每位比前一位大1
思路：枚举起始数字逐位生成，筛选区间内数字后排序
时间复杂度 O(1)，顺次数总数固定很少
*/
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            int num = i;
            for (int j = i + 1; j <= 9; j++) {
                num = num * 10 + j;
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }
        ans.sort((a, b) -> a - b);
        return ans;
    }
}