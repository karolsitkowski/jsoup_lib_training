import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by sit0 on 12.08.17.
 */
public class Main {
    public static void main(String[] args) {

        try{
            Document document = Jsoup.connect("https://www.google.pl/").get();
            Elements links = document.select("a[href]");
            for (Element link : links){
                System.out.println(link.toString());
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
