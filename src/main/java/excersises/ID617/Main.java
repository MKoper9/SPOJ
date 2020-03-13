package excersises.ID617;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int howMany = scanner.nextInt();

        for (int i = 0; i < howMany; i++) {
            String a = scanner.next();
            String b = scanner.next();
            System.out.println(string_merge(a,b));

        }

    }

    static String string_merge(String a, String b){
        int length =0;
        if(a.length()>b.length())
        {
            length=b.length();
        }else if(b.length()>a.length()){
            length=a.length();
        }else {
            length=a.length();
        }
        char[]newWord = new char[2*length];
        int aIterator =0;
        int bIterator=0;
        for (int i = 0; i < 2*length; i++) {
            if(i%2==0||i==0){
                newWord[i]=a.charAt(aIterator);
                aIterator++;
            }else {
                newWord[i]=b.charAt(bIterator);
                bIterator++;
            }
        }
        String newString =String.valueOf(newWord);


        return newString;



    }
}
