package Labsession31;

public class OneTo100WithoutLoops {

	public static void main(String[] args) {
        printNumbers(1);  
    }

    // Recursive method
    public static void printNumbers(int num) {
        if (num > 100) {
            return;
        }

        System.out.print(num+" ");
        printNumbers(num + 1);  // Recursive call
    }
}
