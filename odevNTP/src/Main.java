import org.w3c.dom.UserDataHandler;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hoşgeldiniz.");
        System.out.println("----------------------------------");
        while (2>1){
            Scanner kullaniciAdiniAl = new Scanner(System.in);
            String sonuc1 = kullaniciAdiniAl.next();
            Scanner sifreniAl = new Scanner(System.in);
            String sonuc2 = sifreniAl.next();
            girisYap girisyap = new girisYap(sonuc1,sonuc2);

            System.out.println(girisyap.yoneticiMi);

            isciKaydet iscikaydet = new isciKaydet("das","dsa","dasdas","dsadas","adas");


        }


    }










}

