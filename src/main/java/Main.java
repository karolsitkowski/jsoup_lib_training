import com.sun.org.apache.xpath.internal.SourceTree;
import org.jsoup.nodes.Element;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by sit0 on 12.08.17.
 */
public class Main {
    public static void main(String[] args) throws MalformedURLException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter web page to check");
        String input = scanner.next();

        int numberOfScripts = 0;
        Connection connection = new Connection("http://" + input);
        Scripts scripts = new Scripts();
        System.out.print("Writing scripts for ");

        for (Element script : connection.getScripts()) {
            numberOfScripts++;
            scripts.writeToFile(script.toString(),input + " script " + numberOfScripts + " ");
        }
        System.out.println("\nWritten scripts: " + numberOfScripts);
    }
}
