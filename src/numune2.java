import java.util.Scanner;

public class numune2 {
    public static void main(String[] args) {
        //Bir avtomabilin  km-de ne qeder benzin yandirdigin,ve nece kilometr yol qet etdiyi bilgilerin alin, ve surucunun
        // ne qeder odemeli oldugunu hesablayin
        Scanner sc = new Scanner(System.in);
        System.out.println("Yandirilan benzinin tutari");
        double yandirilanbenzin = sc.nextDouble();
        System.out.println("Gedilen yol");
        int gedilen = sc.nextInt();
        System.out.println("Toplam odenilecek mebleg" + (yandirilanbenzin * gedilen) + "manatdir");


    }
}

