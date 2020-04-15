package excersises.ID1240;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x =scanner.nextInt();
            int y =scanner.nextInt();
            int x1 =scanner.nextInt();
            int y1 =scanner.nextInt();
            int x2 =scanner.nextInt();
            int y2 =scanner.nextInt();
            int score =0;


            score = x * y1 + x1 * y2 + y * x2 - y1 * x2 - x * y2 - y * x1;

            if(score==0){
                System.out.println("TAK");
            }else{
                System.out.println("NIE");
            }

//            if (((y[1] - y[0])) == 0 && (y[2] - y[1]) == 0) {
//                System.out.println("TAK");
//
//            } else {
//                double ab = (x[1] - x[0]) / (y[1] - y[0]);
//                double bc = (x[2] - x[1]) / (y[2] - y[1]);
//
//                if (ab == bc) {
//                    System.out.println("TAK");
//                } else {
//                    System.out.println("NIE");
//                }}
            }
        }
    }

