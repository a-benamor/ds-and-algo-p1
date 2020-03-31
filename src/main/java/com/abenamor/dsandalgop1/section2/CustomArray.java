package com.abenamor.dsandalgop1.section2;

import java.util.*;

/**
 * @author abenamor on 31/03/2020
 */
public class CustomArray {
    private int[] items;
    private int endPostion;
    public CustomArray(int length) {
        items = new int[length];
        endPostion = -1;
    }

    public void insert(int item) {
        if (endPostion == items.length-1) {
            int[] newItems = Arrays.copyOf(items, items.length +1);
            this.items = newItems;
        }
        items[endPostion +1] = item;
        endPostion++;
    }
    public void print() {
        System.out.println(Arrays.toString(items));
    }

    // shift to the left
    public void removeAt(int index) {
        if (index < 0 || index >= items.length) {
            throw new IllegalArgumentException("index must be less than the array size");
        }
        // shift to the left
        for(int i=index; i< endPostion; i++) {
            items[i] = items[i+1];
        }
        items[endPostion] = 0;
        endPostion--;
    }

    // search : lineair search
    public int indexOf(int num) {
        for (int i=0 ; i< items.length; i++) {
            if (num == items[i]) {
                return i;
            }
        }
        return -1;
    }

    public int getMax() {
        int maxItem = items[0];
        for (int curItem: items) {
            if (curItem > maxItem) {
                maxItem = curItem;
            }
        }
        return maxItem;
    }

    public Integer[] intersect(int[] input) {
        Integer[] result = new Integer[items.length];
        int index = 0;
        for (int curItem: items) {
            for (int curInput: input) {
                if (curItem == curInput) {
                    result[index] = curItem;
                    index++;
                    break;
                }
            }
        }

        return result;
    }

    // space complexity: O(n) : time complexity = O(n)
    public int[] reverseV1() {
        int[] result = new int[items.length];
        for(int i =0; i < items.length; i++) {
            result[i] = items[items.length - 1 - i];
        }
        items = result;
        return items;
    }

    // space complexity = O(1) : time complexity = O(log(n))
    public int[] reverseV2() {
        int temp;
        int beginIndex = 0;
        int endIndex = items.length - 1;

        do {
            temp = items[beginIndex];
            items[beginIndex] = items[endIndex];
            items[endIndex] = temp;
            beginIndex ++;
            endIndex --;
        } while (beginIndex < endIndex);

        return items;
    }

    public void insertAt(int item, int index) {
        if(index < 0 || index > items.length) {
            throw new IllegalArgumentException("Invailable index");
        }
        int temp;
        // shift to right
        for (int i = items.length - 1 ; i > index ; i--) {
            items[i +1] =  items[i];
        }
        items[index] = item;
        endPostion ++;
    }

}
