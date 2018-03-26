package org.suye.corejava.thread.algorithm;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;
import org.suye.corejava.algorithm.*;

import java.util.Arrays;

/**
 * Created by suye on 2017/3/20.
 */
public class SortTest {

    @Test
    public void testMergeSort() {
        int[] nums = {2, 7, 8, 3, 1, 6, 9, 0, 5, 4};

        MergeSort.sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }

    @Test
    public void testQuickSort() {
        int[] nums = {2, 7, 3, 8, 1, 5};

        QuickSort.quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void testBubbleSort() {
        int[] nums = {1, 5, 2, 4, 3};

        BubbleSort.sort(nums);
        System.out.println(Arrays.toString(nums));

    }

    @Test
    public void testInsertSort() {
        int[] nums = {2, 7, 8, 3, 1, 6, 9, 0, 5, 4};

        InsertionSort.insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    @Test
    public void testBinarySearch() {
        int[] nums = {1, 2, 3, 4, 5, 6, 8, 9};

        int result = BinarySearch.binarySearch(nums, 6,0,7);

        System.out.println(result);
    }

    @Test
    public void testSortingPerformance() {
        int[] nums = new int[10000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = RandomUtils.nextInt(0, 10000);
        }
        StopWatch watch = new StopWatch();
        watch.start();
        BubbleSort.sort(nums);
        watch.stop();
        System.out.println("Bubble sort cost " + watch.getTime() + " ms");
        watch.reset();


        nums = new int[10000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = RandomUtils.nextInt(0, 10000);
        }
        watch.start();
        SelectionSort.selectionSort(nums);
        watch.stop();
        System.out.println("Selection sort cost " + watch.getTime() + " ms");
        watch.reset();

        nums = new int[10000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = RandomUtils.nextInt(0, 10000);
        }
        watch.start();
        InsertionSort.insertionSort(nums);
        watch.stop();
        System.out.println("Insertion sort cost " + watch.getTime() + " ms");
        watch.reset();

        nums = new int[10000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = RandomUtils.nextInt(0, 10000);
        }
        watch.start();
        QuickSort.quickSort(nums, 0, nums.length - 1);
        watch.stop();
        System.out.println("Quick sort cost " + watch.getTime() + " ms");
        watch.reset();

        watch.start();
        int num = 1;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                index = i;
                break;
            }
        }
        watch.stop();
        System.out.println("Search cost " + watch.getTime() + " ms");
        watch.reset();

        nums = new int[10000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = RandomUtils.nextInt(0, 10000);
        }
        watch.start();
        QuickSort.quickSort(nums, 0, nums.length - 1);
        index = BinarySearch.binarySearch(nums, 1, 0, nums.length - 1);
        watch.stop();
        System.out.println("Binary cost " + watch.getTime() + " ms");
        watch.reset();
    }



}
