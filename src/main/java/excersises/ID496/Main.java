package excersises.ID496;

import java.util.Scanner;
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int a,d,j;
        Scanner wczyt = new Scanner(System.in);
        a=wczyt.nextInt();
        int liczba[]=new int[a];
        for(int i=0;i<a;i++){
            liczba[i]=wczyt.nextInt();
        }

        for(int x:liczba){
            switch(x){
                case 0:
                case 1:
                    d=0;j=1;
                    break;
                case 2:
                    d=0;j=2;
                    break;
                case 3:
                    d=0;j=6;
                    break;
                case 4:
                    d=2;j=4;
                    break;
                case 5:
                    d=2;j=0;
                    break;
                case 6:
                    d=2;j=0;
                    break;
                case 7:
                    d=4;j=0;
                    break;
                case 8:
                    d=2;j=0;
                    break;
                case 9:
                    d=8;j=0;
                    break;
                default:
                    d=j=0;
            }
            System.out.println(d+" "+j);
        }
    }
}
