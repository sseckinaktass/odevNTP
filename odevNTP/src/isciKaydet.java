import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class isciKaydet extends isci{

    isciKaydet(String isim,String soyİsim, String iseBaslamaTarihi, String calismaAlani, String maas){
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("C:\\Users\\Seçkin\\IdeaProjects\\odevNTP\\Files\\isciler.txt",true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            writer.write(isim);
            writer.newLine();
            writer.write(soyİsim);
            writer.newLine();
            writer.write(iseBaslamaTarihi);
            writer.newLine();
            writer.write(calismaAlani);
            writer.newLine();
            writer.write(maas);
            writer.newLine();
            writer.write("----------------");
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }





}
