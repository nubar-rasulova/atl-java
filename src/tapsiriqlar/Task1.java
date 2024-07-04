package tapsiriqlar;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 { //Muxtelif zaman qursaqlarinin saatini cap et
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/New_York");

        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedDateTime = zonedDateTime.format(formatter);


        System.out.println("Current time in " + zoneId + ": " + formattedDateTime);


    }
}
