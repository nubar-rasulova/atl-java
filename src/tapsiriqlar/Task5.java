package tapsiriqlar;

import java.time.LocalDate;

public class Task5 { //Baslangic tarixe gun elave et
    public static void main(String[] args) {

        LocalDate baslangicTarix = LocalDate.of(2024, 3, 12);
        int elaveEdilenGun = 33;
        LocalDate yeniTarix = baslangicTarix.plusDays(elaveEdilenGun);


        System.out.println("Daxil edilen tarix : " + baslangicTarix);
        System.out.println("Gun elave edildikden sonraki yeni tarix " + elaveEdilenGun + " gun:" + yeniTarix
        );


    }
}
