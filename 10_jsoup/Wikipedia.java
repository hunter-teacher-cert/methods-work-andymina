import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * A simple example, used on the jsoup website.
 */
public class Wikipedia {
    public static void main(String[] args) throws IOException {
      // download the HTML of the webpage
      Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
      System.out.println(doc.title());

      // get all elements that match the selector
      Elements newsHeadlines = doc.select("#mp-itn b a");
      // loop through all elements that matched
      for (Element headline : newsHeadlines) {
        // get the title attribute
        System.out.print(headline.attr("title") + "\n\t");
        // get the href attribute
        System.out.println(headline.absUrl("href"));
      }
    }
}