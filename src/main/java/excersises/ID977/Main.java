package excersises.ID977;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howMany = scanner.nextInt();
        List<Integer> list=new ArrayList<>();
        int iterator=0;
        for (int i = 0; i < howMany; i++) {


            while(scanner.hasNextInt()){
            if(iterator==0) {
                list.add(scanner.nextInt());
            }
            else {
                list.add(scanner.nextInt());
            }
            iterator++;
        }
        List<String>stringList = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            if(j==0) {
                stringList.add(list.get(j).toString());
            }else {
                stringList.add(" "+list.get(j).toString());
            }
        }
        stringList.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
    }}
}
