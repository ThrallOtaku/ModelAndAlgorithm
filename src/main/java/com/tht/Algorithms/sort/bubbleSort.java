package com.tht.Algorithms.sort;

/**
 * Created by thrall on 2018/11/28.
 * 冒泡排序
 *  int[] arr={6,3,8,2,9,1};
 * N长度的数组需要n-1次的交换
 * 需要N-1 趟排序    I
 */
public class bubbleSort {
    /**
     * 优化，可以在内循环加一个flg，如果遍历一遍都没有要换位的，那么就表示已经是顺序的了
     * @param a
     */
    public void bubbleSort(int[] a){
       for(int i=0;i<a.length-1;i++){
           System.out.println("_______________");
           System.out.println("外循环第"+i+"次循环");
           for(int j=0;j<a.length-1;j++){
               System.out.println("内循环第"+j+"次");
               System.out.println("j="+a[j]+",j+1="+a[j+1]);
               if(a[j]>a[j+1]){
                    swap(a,j,j+1);
               }
           }
       }
    }

    void swap(int[]a ,int x,int y){
         int tmp=a[x];
         a[x]=a[y];
         a[y]=tmp;
    }

    public static void main(String[] args) {
        int[] arr={6,3,8,2,9,1};
        System.out.println("排序前数组为：");
        new bubbleSort().bubbleSort(arr);
        System.out.println("排序后的数组为：");
        for(int num:arr){
        System.out.print(num+" ");
        }
    }

}
