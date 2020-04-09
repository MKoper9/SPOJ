package excersises.ID1055;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boxes = scanner.nextInt();

        for (int i = 0; i < boxes; i++) {
            int numbers = scanner.nextInt();
            int[] numbersTab = new int[numbers];
            for (int j = 0; j < numbers; j++) {
                numbersTab[j] = scanner.nextInt();
            }

            int[] newTab = new int[numbers];
            int iterator = 0;
            for (int j = 0; j < numbers; j++) {
                if (j % 2 != 0) {
                    newTab[iterator] = numbersTab[j];
                    iterator++;
                }
            }
            for (int j = 0; j < numbers; j++) {
                if (j % 2 == 0) {
                    newTab[iterator] = numbersTab[j];
                    iterator++;
                }
            }
            for (int j = 0; j < newTab.length; j++) {
                System.out.print(newTab[j]+" ");
            }
        }
    }
}
