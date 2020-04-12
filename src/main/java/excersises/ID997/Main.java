package excersises.ID997;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String operation = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            switch (operation) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                case "%":
                    System.out.println(a % b);
                    break;
                default:
                    System.out.println("Złe działanie");

            }

        }
    }

}
