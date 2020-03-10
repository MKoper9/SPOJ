package excersises.ID1261;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int declarate = scanner.nextInt();
        for (int i = 0; i < declarate; i++) {

            String pesel = scanner.next();

            char[] chars = pesel.toCharArray();

            int[] charToInt = new int[pesel.length()];
            if (pesel.length() != 11) {
                System.out.println("N");
            } else {
                for (int j = 0; j < pesel.length(); j++) {
                    charToInt[j] = Integer.parseInt(String.valueOf(chars[j]));

                    switch (j) {
                        case 0:
                        case 4:
                        case 8:
                        case 10:
                            charToInt[j] *= 1;
                            break;
                        case 1:
                        case 5:
                        case 9:
                            charToInt[j] *= 3;
                            break;
                        case 2:
                        case 6:
                            charToInt[j] *= 7;
                        default:
                            charToInt[j] *= 9;
                    }
                }
                int sum = Arrays.stream(charToInt).sum();
                if (sum % 10 == 0) {
                    System.out.println("D");

                }else if(sum<0){
                    System.out.println("N");
                } else
                    {
                    System.out.println("N");
                }
            }
        }

    }
}
