package ders1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Date bugun=new Date();
        System.out.println("bugun:"+bugun);
        DateFormat f =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("bugun"+f.format(bugun));



        }
    }
