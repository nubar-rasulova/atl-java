package tapsiriqlar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task6 { //Tarixi goster
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024,12 , 5);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate = date.format(formatter);

        System.out.println("Tarix: " +formattedDate);

    }
}
