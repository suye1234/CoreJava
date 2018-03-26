package org.suye.corejava.algorithm;

/**
 * Created by suye on 2017/3/20.
 */
public class BubbleSort {

    /**
     * 由于在排序过程中总是小数往前放，大数往后放，相当于气泡往上升，所以称作冒泡排序。
     * 时间复杂度为O（n^2）
     * 稳定排序方式
     *
     * @param arr 待排序数组
     * @return 输出有序数组
     */
    public static void sort(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }
}
