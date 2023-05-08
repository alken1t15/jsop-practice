import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.util.List;

public class TestDns {
    public static void main(String[] args) {
        parsingFromShopDNS("DNS","Ноутбуки","https://www.dns-shop.kz/catalog/17a892f816404e77/noutbuki/");
    }


    public static void parsingFromShopDNS(String store, String category, String linkPage) {
        System.setProperty("webdriver.chrome.driver", "E:\\DriverSpring\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(linkPage);

        List<WebElement> numberPage = driver.findElements(By.className("pagination-widget__page"));
        int countPage = Integer.parseInt(numberPage.get(numberPage.size() - 1).getAttribute("data-page-number"));
        for (int j = 1; j <= countPage; j++) {
            if (j != 1) {
                driver.get(linkPage + "?p=" + j);
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            List<WebElement> prices = driver.findElements(By.className("product-buy__price"));
            List<WebElement> nameProducts = driver.findElements(By.className("catalog-product__name"));
            List<WebElement> linkProducts = driver.findElements(By.className("catalog-product__image-link"));
            for (int i = 0; i < prices.size(); i++) {
                String priceString = prices.get(i).getText().replace(" ","");
                int price = Integer.parseInt(priceString.substring(0,priceString.length()-1));
                String name = nameProducts.get(i).getText();
                String link = linkProducts.get(i).getAttribute("href");
                //   Product product = productRepository.findByLinkProduct(link);
                //   if (product == null) {
                System.out.println("Store: " + store + " category: " + category + " name: " + name + " link: " + link + " price: " + price);
                //      productRepository.save(new Product(store, category, name, link, price, LocalDate.now()));
                //  } else if (product.getPrice() != price) {
                //      productRepository.save(new Product(store, category, name, link, price, LocalDate.now()));
                //  }
            }
        }
    }
}