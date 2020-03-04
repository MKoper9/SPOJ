package excersises.ID499;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int koncowki[][] = {
                {0, 0, 0, 0},
                {1, 1, 1, 1},
                {6, 2, 4, 8},
                {1, 3, 9, 7},
                {6, 4, 6, 4},
                {5, 5, 5, 5},
                {6, 6, 6, 6},
                {1, 7, 9, 3},
                {6, 8, 4, 2},
                {1, 9, 1, 9}
        };

        Scanner scanner = new Scanner(System.in);
        int przypadki = scanner.nextInt();

        for (int i = 0; i <przypadki ; i++) {
            int podstawa = scanner.nextInt();
            int wykladnik = scanner.nextInt();

            System.out.println(koncowki[podstawa % 10][wykladnik % 4]);
        }
    }


}

