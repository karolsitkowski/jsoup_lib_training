import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

/**
 * Created by sit0 on 18.08.17.
 */
public class Connection  {

    private Document document;

    public Connection(String url){
        try{
            document = Jsoup.connect(url).get();

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    Elements getImages(){
        return document.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
    }

    Elements getScripts(){
        return document.getElementsByTag("script");
    }


}
