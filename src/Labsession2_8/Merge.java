package Labsession2_8;

import java.util.Arrays;

//3.sort an integer array using multiple threads.

class Merge extends Thread {
int[] arr;
int start, end;

public Merge(int[] arr, int start, int end) {
   this.arr = arr;
   this.start = start;
   this.end = end;
}

public void run() {
   Arrays.sort(arr, start, end);
}
}