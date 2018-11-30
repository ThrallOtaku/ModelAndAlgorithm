package com.tht.swordOffer;

import java.util.*;

/**
 * Created by thrall on 2018/11/21.
 */
public class duplicateNo {

    public static void main(String[] args) {
//        int[] nums= new int[]{2, 3, 1, 0, 2, 5};
//        System.out.println(duplicate(nums,5,new int[]{}));
//
//        int[][] matrix=new int[5][5];


    }


    /**
     * Input:
     {2, 3, 1, 0, 2, 5}
     Output:
     2
     * 挑出数组中重复数据
     */
    public static Set duplicate(int[] nums, int length, int[] duplication) {
        if(nums==null||length<=0){
            return null;
        }
        Set set =new HashSet<>();
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(nums[i]==nums[j]&&i!=j){
                    set.add(nums[i]);
                    System.out.println("duplication:"+nums[i]);
                    //System.out.println(set);
                }
            }
        }

        return set;
    }

    /**
     * 位置互换
     * @param nums
     * @param i
     * @param j
     */
    private void swap(int[] nums ,int i ,int j){
        int t =nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

    /**
     * 矩阵中数据查找
     */
    public boolean Find(int target, int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return false;
        }
        int rows=matrix.length,cols=matrix[0].length;
        int r=0,c=cols-1;
        while (r<=rows-1&&c>=0){
            if(target==matrix[r][c])
                return true;
            else if(target>matrix[r][c])
                r++;
            else
                c--;
        }
        return  false;
    }


    /**
     * 替换空格
     * Input:
     "We Are Happy"
     Output:
     "We%20Are%20Happy"
     */
    public String replaceSpace(StringBuffer str){
        return str.toString().replaceAll(" ","%20");
    }

    public boolean Find11(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(target==array[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> array =new ArrayList<>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }

        while(!stack.empty()){
            array.add(stack.pop());
        }
        return array;
    }

    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        while (listNode != null) {
            ret.add(listNode.val);
            listNode = listNode.next;
        }
        /**
         * reverse
         */
        Collections.reverse(ret);
        return ret;
    }


}
