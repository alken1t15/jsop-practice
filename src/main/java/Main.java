import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try {
//            Document page = Jsoup.connect("https://www.mechta.kz/section/noutbuki/").get();
//         //   System.out.println(page);
//            var titles = page.select("#q-app > div > div.q-page-container > main > div > div > div.row.justify-center.q-px-md.q-px-md-none > div > div > div > div.row.q-col-gutter-lg > div.col-9 > div:nth-child(4) > div:nth-child(1) > div.row.q-gutter-md.q-mb-md > div:nth-child(4) > div > a");
//           System.out.println(titles.attr("href"));
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        Document doc = null;
        try {
            doc = Jsoup.connect("https://en.wikipedia.org/").get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //log(doc.title());
        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
            System.out.println( headline.attr("title"));
            System.out.println(headline.absUrl("href"));
        }
    }
}