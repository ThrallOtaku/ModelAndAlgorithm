package com.tht.swordOffer;

import java.util.Stack;

/**
 * 用两个栈实现先进先出的队列
 */
public class stackToList {
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();

    public void push(int node) {
        in.push(node);
    }

    public int pop() {
        //out空的时候一次性把in的数据push进out，取的时候直接用out.pop就行了
        if(out.isEmpty()){
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.pop();
    }


    /**
     * 斐波那契数列
     * 大家都知道斐波那契数列，现在要求输入一个整数n，
     * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
     * 0  1  1 2 3 5 8 13
     * 0  1  2 3 4 5 6 7
     * 利用递归就可以轻松实现
     * n<=39
     * @param n
     * @return
     */
    public int Fibonacci(int n){
        if(n<=1){
            return n;
        }
        return (Fibonacci(n-1)+Fibonacci(n-2));
    }


    /**
     * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。
     * 求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
     * 同样是斐波那契问题
     * 1 2 3 4
     * 1 2 3 5
     * @param args
     */
    public int JumpFloor(int target) {
        if(target<=3){
            return target;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }

    /**
     * 变态跳台阶问题
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * 分析见链接
     * 三阶的情况下，f(3)=f(1)+f(2)
     * 四阶的情况下 f(4)=f(3)+f(1)
     * https://www.nowcoder.com/questionTerminal/22243d016f6b47f2a6928b4313c85387
     * @param args
     */
    public int JumpFloorII(int target){
        if (target <= 0) {
            return -1;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(target - 1);
        }
    }

    /**
     * 矩形的覆盖问题
     *我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
     *请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
     * //TODO 这道题是研究生考试相关的题目,再整理
     * @param target
     * @return
     */
    public int RectCover(int target) {
        if(target <= 2) return target;
        else{
            return RectCover(target-1) + RectCover(target-2);
        }
    }

    public static void main(String[] args) {

        System.out.println(new stackToList().Fibonacci(10));
    }
}
