import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sit0 on 18.08.17.
 */
public class Scripts {

    SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

    public void writeToFile(String content, String fileName){
        try(FileWriter fw = new FileWriter(fileName + new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(new Date()));
        BufferedWriter bw = new BufferedWriter(fw);) {

            bw.write(content);

            System.out.print(".");

        } catch (IOException e) {

            e.printStackTrace();
    }
}

}
