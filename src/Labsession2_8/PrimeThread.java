package Labsession2_8;

//sum prime numbers using multiple threads

class PrimeThread extends Thread {
  private int start, end;

  public PrimeThread(int start, int end) {
      this.start = start;
      this.end = end;
  }

  // Check if a number is prime
 public boolean isPrime(int num) {
      if (num < 2) return false;
      for (int i = 2; i <= Math.sqrt(num); i++) {
          if (num % i == 0) return false;
      }
      return true;
  }

  public void run() {
      for (int i = start; i <= end; i++) {
          if (isPrime(i)) {
              System.out.println("Prime: " + i + " (Thread: " + Thread.currentThread().getName() + ")");
          }
      }
  }
}
