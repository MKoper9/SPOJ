package excersises.ID522;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int smaller = scanner.nextInt();
            int bigger = scanner.nextInt();

            if(smaller>bigger)
            {
                int tmp = smaller;
                smaller=bigger;
                bigger=tmp;
            }

            int result = bigger;
            while (result%bigger!=0||result%smaller!=0){
                result+=bigger;
            }
            System.out.println(result);


        }





    }}
