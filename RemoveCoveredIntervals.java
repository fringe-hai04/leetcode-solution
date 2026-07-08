
/*
LeetCode 1288 删除被覆盖区间
链接：https://leetcode.cn/problems/remove-covered-intervals/
题目：给你区间数组，删除被其他区间完全覆盖的区间，返回剩余区间数量
思路：先排序，起点升序，同起点终点降序；遍历维护最大右边界，统计被覆盖数量
时间复杂度 O(n log n)
*/
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(b[1], a[1]);
        });
        int ans = n;
        int maxR = intervals[0][1];
        for (int i = 1; i < n; i++) {
            int currR = intervals[i][1];
            if (currR <= maxR) ans--;
            else maxR = currR;
        }
        return ans;
    }
}