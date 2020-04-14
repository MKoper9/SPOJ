package excersises.ID804;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            while (a!=b){
                if(a>b){
                    a=a-b;
                }else {
                    b=b-a;
                }
            }

            System.out.println(a+b);

        }
    }
}
