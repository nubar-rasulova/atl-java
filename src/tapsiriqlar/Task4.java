package tapsiriqlar;

import java.time.LocalDate;

public class Task4 {// Zamandan 10 gun cix

    public static void main(String[] args) {
        LocalDate baslangicTarix = LocalDate.of(2024, 3, 12);
        int cixilanGun = 10;
        LocalDate yeniTarix = baslangicTarix.minusDays(cixilanGun);


        System.out.println("Daxil edilen tarix : " + baslangicTarix);
        System.out.println("Gun cixildiqdan sonraki yeni tarix " + cixilanGun + " gun:" + yeniTarix
        );

    }
}
