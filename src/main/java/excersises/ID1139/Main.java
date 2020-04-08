package excersises.ID1139;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();

        for (int i = 0; i < integer; i++) {
            int side = scanner.nextInt();
            System.out.println((int)Math.pow(side,2));
        }

    }
}
