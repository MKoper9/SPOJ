package excersises.ID506;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();

        for (int i = 0; i < c; i++) {

            String text = scanner.nextLine();
            char[] textChar = text.toCharArray();
            List<Character>result = new ArrayList<>();
            int many = 1, j = 0;

            while (j < text.length()) {
                many = 1;
                char actuall = textChar[j];
                j++;
                for (; j < text.length() && textChar[j] == actuall; j++) {
                    many++;
                }
                if(many==1){
                    result.add(actuall);
                }
                else if(many==2){
                    result.add(actuall);
                    result.add(actuall);
                }else {
                    result.add(actuall);
                    String d = Integer.toString(many);
                    String manyString = Integer.toString(many);
                    char[]manyChar = manyString.toCharArray();
                    for (int k = 0; k < manyChar.length; k++) {
                        result.add(manyChar[k]);
                    }
                }
            }

            for (int k = 0; k < result.size(); k++) {
                System.out.print(result.get(k));
            }

        }


    }
}
