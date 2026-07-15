/*
LeetCode 3658 - 奇数和与偶数和的最大公因数
链接：https://leetcode.cn/problems/gcd-of-odd-even-sums/
题意：求前n个奇数总和、前n个偶数总和的最大公约数
推导公式：奇数和 = n²，偶数和 = n(n+1)，两者最大公约数为n
时间复杂度 O(1)
*/
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n * n;
        int sumEven = n * (n + 1);
        return n;
    }
}