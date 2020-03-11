package excersises.ID4843;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String openingHours = scanner.next();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        List<LocalTime>localTimeList = new ArrayList<>();

        localTimeList.add( LocalTime.parse(openingHours, dateTimeFormatter));
        int iterator = 0;

        while (scanner.hasNextLong())
        {
            iterator++;
            localTimeList.add(localTimeList.get(iterator-1).plusMinutes(45));

            iterator++;
            localTimeList.add(localTimeList.get(iterator-1).plusMinutes(scanner.nextLong()));

        }

        localTimeList.forEach(localTime -> System.out.println(localTime));



    }
}
