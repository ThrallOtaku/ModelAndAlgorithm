package com.tht.swordOffer;

public class binarySearch {

    /**
     * [3, 4, 5, 1, 2] 查找数组中最小的元素
     * 递增数组的查找一般用二分法查找
     * 二分查找：如果中间的数小于等于右边，那么查找左半边
     * 否则查找右半边
     * 二分查找的时间复杂度是  logN
     *
     * @param nums
     * @return
     */

    public int minNumberInRotateArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            System.out.println("middle=" + middle);
            if (nums[middle] <= nums[right])
                right = middle;
            else
                left = middle + 1;
        }
        return nums[left];
    }


    /**
     * 输入一个整数，输出该数二进制表示1 的个数
     *
     * @param
     */
    public int NumberOf1(int n) {
        return Integer.bitCount(n);
    }


    /**
     * 整数的指数次幂
     *
     * @param base
     * @param exponent
     * @return
     */
    public double Power(double base, int exponent) {
        //0次幂是1
        if (exponent == 0 && base != 0)
            return 1;
        //1次幂是base
        if (exponent == 1)
            return base;
        //base是0，负数幂是exception
        if (base == 0 && exponent <= 0) {
            throw new RuntimeException();
        }
        //base是0，幂是正数那么是0
        if (base == 0 && exponent > 0) {
            return 0;
        }

        int n = exponent;
        if (exponent < 0) {
            n = -exponent;
        }
        //
        double result = Power(base, n >> 1);
        result *= result;
        if ((n & 1) == 1)
            result *= base;
        if (exponent < 0)
            result = 1 / result;
        return result;
    }


    //二分快速幂求幂运算pow
    long bigpow(int x, int y) {
        long ret = 1;
        long tmp = x;
        while (y > 0) {
            if ((y & 1)==1)
                ret *= tmp;
            y >>= 1;
            tmp *= tmp;
        }
        return ret;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        System.out.println(new binarySearch().minNumberInRotateArray(nums));

        Math.pow(5,10);
    }
}
