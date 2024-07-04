package tapsiriqlar;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task7 {// tarix ve zamanlari cap et
    public static void main(String[] args) {
        // tarix ve zaman
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Indiki tarix ve zaman : " + currentDateTime);

        // zaman
        LocalTime currentTime = LocalTime.now();
        System.out.println("Indiki zaman: "+ currentTime);

    }
}
