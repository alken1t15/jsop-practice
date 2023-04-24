import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        try {
//            Document page = Jsoup.connect("https://shop.kz/noutbuki/filter/almaty-is-v_nalichii-or-ojidaem-or-dostavim/apply/").get();
//         //   System.out.println(page);
//            var titles = page.select("#q-app > div > div.q-page-container > main > div > div > div.row.justify-center.q-px-md.q-px-md-none > div > div > div > div.row.q-col-gutter-lg > div.col-9 > div:nth-child(4) > div:nth-child(1) > div.row.q-gutter-md.q-mb-md > div:nth-child(4) > div > a");
//           System.out.println(titles.attr("href"));
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            // Загрузка HTML-страницы
//            Document document = Jsoup.connect("https://shop.kz/noutbuki/filter/almaty-is-v_nalichii-or-ojidaem-or-dostavim/apply/").get();
//
//            // Получение заголовка страницы (тег <title>)
////            String title = document.title();
////            System.out.println("Title: " + title);
//
//            // Извлечение всех ссылок (теги <a>)
////            Elements links = document.select("a[href]");
////
////            // Вывод найденных ссылок
////            System.out.println("\nLinks:");
////            for (Element link : links) {
////                System.out.println(link.attr("href"));
////            }
//
//            // Извлечение всех элементов с определенным классом
////            Connection.Response response = Jsoup.connect("https://shop.kz/noutbuki/filter/almaty-is-v_nalichii-or-ojidaem-or-dostavim/apply/").followRedirects(true).execute();
////            int statusCode = response.statusCode();
////            System.out.println("Status code: " + statusCode);
//            Elements elementsWithClass = document.getElementsByClass("bx_price");
//            Elements elementsWithClass2 = document.getElementsByClass("bx_catalog_item_title_text");
//            Elements elementsWithClass3 = document.getElementsByClass("bx_catalog_item_title").select("a[href]");
//
//
//            // Вывод найденных элементов с определенным классом
//            System.out.println("\nElements with class 'some-class':");
//            for(int i = 0; i<elementsWithClass.size();i++){
//                Element element = elementsWithClass.get(i);
//                Element element2 = elementsWithClass2.get(i);
//                Element element3 = elementsWithClass3.get(i);
//                System.out.println(element2.text());
//                System.out.println(element3.attr("href"));
//                System.out.println(element.text());
//
//            }
////            for (Element element : elementsWithClass) {
////                System.out.println(element.text());
////                System.out.println(element.);
////            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Document doc = null;
//        try {
//            doc = Jsoup.connect("https://en.wikipedia.org/").get();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        //log(doc.title());
//        Elements newsHeadlines = doc.select("#mp-itn b a");
//        for (Element headline : newsHeadlines) {
//            System.out.println( headline.attr("title"));
//            System.out.println(headline.absUrl("href"));
//        }

//        try {
//            // Загрузка HTML-страницы
//            Document document = Jsoup.connect("https://shop.kz/noutbuki/filter/almaty-is-v_nalichii-or-ojidaem-or-dostavim/apply/").header("Content-Type", "text/html; charset=utf-8").get();
//            // Извлечение всех элементов с определенным классом
//            Elements prices = document.getElementsByClass("bx_price");
//            Elements names = document.getElementsByClass("bx_catalog_item_title_text");
//            Elements links = document.getElementsByClass("bx_catalog_item_title").select("a[href]");
//            // Вывод найденных элементов с определенным классом
//            for(int i = 0; i<prices.size();i++){
//                Element element = prices.get(i);
//                Element name = names.get(i);
//                Element link = links.get(i);
//                String price = element.text();
//                System.out.println(name.text());
//                System.out.println(link.attr("href"));
//                System.out.println(price.substring(element.text().indexOf("Цена в интернет-магазине")+24,price.indexOf(price.charAt(price.length()-1),element.text().indexOf("Цена в интернет-магазине")+24)));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            // Загрузка HTML-страницы
//            Document document = Jsoup.connect("https://shop.kz/noutbuki/filter/almaty-is-v_nalichii-or-ojidaem-or-dostavim/apply/").header("Content-Type", "text/html; charset=utf-8").get();
//            // Извлечение всех элементов с определенным классом
//            // Вывод найденных элементов с определенным классом
//            Elements links = document.getElementsByClass("bx-pagination-container row");
//            Integer countPage = Integer.valueOf(links.text().substring(links.text().length()-2).trim());
//            System.out.println(countPage);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Мечта
//        try {
            // Загрузка HTML-страницы
//            Thread.sleep(5000L);
//            String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36";
//            Connection connection = Jsoup.connect("https://www.dns-shop.kz/catalog/17a892f816404e77/noutbuki/").header("User-Agent", userAgent);
//            Document document = connection.get();
            //  System.out.println(document.text());
            //    Elements nameProduct = document.getElementsByClass("catalog-product__name ui-link ui-link_black");
//            Thread.sleep(5000L);
//            Elements price = document.getElementsByClass("product-buy__price");
//            System.out.println(price.text());
            //    Elements link = document.getElementsByClass("catalog-product__name ui-link ui-link_black");
            //  Elements pages = document.getElementsByClass("pagination-widget__page");

            //  System.out.println(nameProduct.text());
            //   System.out.println(price.text());
//            for (Element element : price){
//                System.out.println(element.text());
//
            //           System.out.println(link.attr("href"));
//            for (Element element : price){
//                Thread.sleep(3000L);
//                System.out.println(element.text());
//            }
//            for (Element element : pages){
//                System.out.println(element.text());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.setProperty("webdriver.chrome.driver","E:\\DriverSpring\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.dns-shop.kz/catalog/17a892f816404e77/noutbuki/");

//        https://www.dns-shop.kz/catalog/17a8a01d16404e77/smartfony/
//        https://www.dns-shop.kz/catalog/17a892f816404e77/noutbuki/
//        https://www.dns-shop.kz/catalog/17a892f816404e77/noutbuki/?p=2
//        List<WebElement> price = driver.findElements(By.className("product-buy__price"));
//        List<WebElement> nameProduct = driver.findElements(By.className("catalog-product__name"));
//        List<WebElement> linkProduct = driver.findElements(By.className("catalog-product__image-link"));
//        List<WebElement> numberPage = driver.findElements(By.className("pagination-widget__page"));
//        for (WebElement webElement : price){
//            System.out.println(webElement.getText());
//        }
//        for (WebElement webElement : nameProduct){
//            System.out.println(webElement.getText());
//        }
//        for (WebElement webElement : linkProduct){
//           System.out.println(webElement.getAttribute("href"));
//       }
//        for (WebElement webElement : numberPage){
//            System.out.println(webElement.getAttribute("data-page-number"));
//        }

    }

}