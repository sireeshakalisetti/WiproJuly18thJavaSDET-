package Labsession22;

import java.util.Scanner;

public class RrightAngleTriangle {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of rows : ");
        int numRows = scanner.nextInt();

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
