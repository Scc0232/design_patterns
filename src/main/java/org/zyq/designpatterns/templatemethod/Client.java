package org.zyq.designpatterns.templatemethod;

public class Client {
    public static void main(String[] args) {
        int[] arr = { 10, 32, 1, 9, 5, 7, 12, 0, 4, 3 };

        AbstractSort sort = new SelectSort();
        sort.sortAndDisplay(arr);
    }
}
