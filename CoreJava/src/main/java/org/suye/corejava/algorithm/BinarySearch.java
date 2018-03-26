package org.suye.corejava.algorithm;

/**
 * Created by suye on 2017/3/20.
 */
public class BinarySearch {
    /**
     * searches for a value in sorted array
     *
     * @param array
     *            array to search in
     * @param value
     *            searched value
     * @param left
     *            index of left boundary
     * @param right
     *            index of right boundary
     * @return position of searched value, if it presents in the array or -1, if
     *         it is absent
     */
    public static int binarySearch(int[] array, int value, int left, int right) {
        if (left > right)
            return -1;
        int middle = (left + right) / 2;
        if (array[middle] == value)
            return middle;
        else if (array[middle] > value)
            return binarySearch(array, value, left, middle - 1);
        else
            return binarySearch(array, value, middle + 1, right);
    }


    //二分查找的实现
    public static void main(String[] args) {

        int[] nums = {2, 5, 11, 3, 22, 6, 91, 13, 35, 4};
        //对数组进行排序
        QuickSort.quickSort(nums, 0, nums.length - 1);

        int find = BinarySearch.binarySearch(nums, 5,0, 9);

        if (find != -1) {
            System.out.println("找到数值于索引" + find);
        } else {
            System.out.println("找不到数值");
        }
    }
}
