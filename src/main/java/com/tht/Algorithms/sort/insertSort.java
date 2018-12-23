package com.tht.Algorithms.sort;

/**
 * Created by thrall on 2018/12/22.
 * 插入排序
 * 参阅 http://www.cnblogs.com/liuling/p/2013-7-24-01.html
 * 每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的
 * 字序列的合适位置（从后向前找到合适位置后），直到全部插入排序完为止
 */
public class insertSort {
    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
        //---------------------print--------------------------------
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        //----------------------------------------------------------
        //直接插入排序
        for (int i = 1; i < a.length; i++) {
            System.out.println("ai=" + a[i]);
            //待插入元素
            int temp = a[i];
            int j;
            //从后向前寻找合适的位置
            for (j = i - 1; j >= 0; j--) {
                System.out.println("aj=" + a[j]);
                //将大于temp的往后移动一位
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            System.out.println("aj+1=" + a[j + 1]);
            System.out.println("");
            //在j+1的位置插入当前值
            a[j + 1] = temp;
        }
        //---------------------print---------------------------
        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        //--------------------------------------------------

        int[] b = {1, 3, 4, 2};
        new insertSort().insertSort1(b);
        System.out.println("");
        System.out.println("b排序之后：");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    //int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
    //int[] b = {1,3,4,2}; 步骤3开始第一次循环｛1，3，4，2｝，第二次循环｛1，3，4，2｝，
    // 第三次循环,内循环需要整体后移动移动到一定的位置以后，把最后一个值插入到j+1,｛1，3，4，4｝，{1,3,3,4},｛1，2，3，4｝
    //直接插入排序的时间复杂度是O(n2)
    private void insertSort1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //当前值存在tmp
            int tmp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    //j+1=j
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
    }

    //二分插入排序
    //O(n2)
    private static void binarySort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int left = 0;
            int right = i - 1;
            int mid = 0;
            while (left <= right) {
                mid = (left + right) / 2;
                if (temp < a[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            for (int j = i - 1; j >= left; j--) {
                a[j + 1] = a[j];
            }
            if (left != i) {
                a[left] = temp;
            }
        }
    }

    /**
     * 因此，希尔排序在效率上较直接插人排序有较大的改进。希尔排序的平均时间复杂度为O(nlogn)
     * @param arr
     */
    public static void xierSort(int[] arr) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        //希尔排序
        int d = a.length;
        while (true) {
            d = d / 2;
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < a.length; i = i + d) {
                    int temp = a[i];
                    int j;
                    for (j = i - d; j >= 0 && a[j] > temp; j = j - d) {
                        a[j + d] = a[j];
                    }
                    a[j + d] = temp;
                }
            }
            if (d == 1) {
                break;
            }
        }
        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
