import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class girisYap {

    boolean girisYapildiMi = false;
    boolean yoneticiMi = false;

    girisYap(String kulAdi, String sifre){
        File file = new File("C:\\Users\\Seçkin\\IdeaProjects\\odevNTP\\Files\\yonetici.txt");



        try {
            Scanner reader = new Scanner(file);
            String line1 = reader.nextLine();
            String line2 = reader.nextLine();





            if(kulAdi.equals(line1) && sifre.equals(line2)){
                System.out.println("Giriş Başarılı. Hoşgeldiniz.");
                girisYapildiMi = true;
                yoneticiMi = true;
            }
            else{
                System.out.println("Giriş başarısız. Tekrar deneyin.");
                girisYapildiMi = true;
                yoneticiMi = false;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }


}
