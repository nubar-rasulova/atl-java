package tapsiriqlar;

import java.time.LocalDate;
import java.time.Period;

public class Task2 { // Iki zaman arasindaki ferqi tap
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 3, 12);
        LocalDate endDate = LocalDate.of(2024, 7, 4);

        Period period = Period.between(startDate, endDate);

        System.out.println("bu qeder zaman kecib " + period.getYears() + " il, "
                + period.getMonths() + " ay, ve "
                + period.getDays() + " gun.");



    }
}
