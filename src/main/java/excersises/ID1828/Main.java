package excersises.ID1828;

import java.util.Scanner;

public class Main {
    /*
        Wejście

        Na wejście programu podane zostaną trzy liczby całkowite (nieprzekraczające 100) rozdzielone znakiem nowej linii.
        Wyjście

        Na wyjściu ma się pojawić suma liczb, które pojawiły się na wejściu.
                Przykład

        Wejście:
                100
                -68
                12

        Wyjście:
                44
        */
    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        sum = a + b + c;

        System.out.println(sum);
    }
}
