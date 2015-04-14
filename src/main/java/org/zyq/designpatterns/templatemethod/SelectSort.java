package org.zyq.designpatterns.templatemethod;

public class SelectSort extends AbstractSort {

    @Override
    protected void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            selectMin(arr, i);
        }
    }

    private void selectMin(int[] arr, int startIdx) {
        int minIdx = startIdx;

        for (int j = startIdx + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }

        int tmp = arr[startIdx];
        arr[startIdx] = arr[minIdx];
        arr[minIdx] = tmp;
    }
}
