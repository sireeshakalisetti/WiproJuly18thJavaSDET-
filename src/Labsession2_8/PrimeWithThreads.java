package Labsession2_8;

public class PrimeWithThreads {
	  public static void main(String[] args) {
	      int range = 100;
	      int parts = 4;  // number of threads
	      int gap = range / parts;

	      // Create and start threads
	      for (int i = 0; i < parts; i++) {
	          int start = i * gap + 1;
	          int end = (i == parts - 1) ? range : (start + gap - 1);
	          Thread t = new PrimeThread(start, end);
	          t.start();
	      }
	  }
	}
