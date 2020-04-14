package excersises.ID1032;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int div = scanner.nextInt();
            int undiv = scanner.nextInt();

            for (int j = 1; j < a; j++) {
                if((j%div==0) && (j%undiv!=0)){
                    System.out.print(j+" ");
                }
            }
        }
    }
}
