package excersises.ID438;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Input

n - liczba testów n<100000, w kolejnych liniach n liczb z przedziału [1..10000]
Output

Dla każdej liczby słowo TAK, jeśli liczba ta jest pierwsza, słowo: NIE, w przeciwnym wypadku.
Example

Input:
3
11
1
4

Output:
TAK
NIE
NIE

 */

/**
 * @author Michał Koperski
 * @apiNote ready!
 */

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[]table = new int[a];
        for (int i = 0; i < a; i++) {
            table[i]=scanner.nextInt();
        }
        for (int i=0; i<a; i++){
            isPrimary(table[i]);
        }


    }

    public static void isPrimary(int number) {
        List<Integer> list = new ArrayList<Integer>();
        if (number > 1) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    list.add(i);
                }
            }
            if (list.size() == 1) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }

        } else {
            System.out.println("NIE");
        }
    }
}


