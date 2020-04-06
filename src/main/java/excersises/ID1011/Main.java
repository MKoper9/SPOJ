package excersises.ID1011;

        import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] tab = new String[num];

        for (int i = 0; i < num; i++) {
            tab[i] = scanner.next();
        }
        for (int i = 0; i < num; i++) {
            int size = 0;
            size = tab[i].length();
            StringBuilder stringBuilder = new StringBuilder();

            for (int j = 0; j < size / 2; j++) {
                stringBuilder.append(tab[i].charAt(j));
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
