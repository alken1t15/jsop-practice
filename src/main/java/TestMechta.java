import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestMechta {
    public static void main(String[] args) {
        parsingFromShopMechta("Мечта","Ноутбуки","https://www.mechta.kz/section/noutbuki/?setcity=s1");
    }
    public static void parsingFromShopMechta(String store, String category, String linkPage){
        System.setProperty("webdriver.chrome.driver","E:\\DriverSpring\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(linkPage);

        List<WebElement> numberPage = driver.findElements(By.className("block"));
        int countPage = Integer.parseInt(numberPage.get(numberPage.size() - 2).getText());
        for (int j = 1; j < countPage; j++) {
            if (j != 1) {
                driver.get(linkPage + "&page=" + j);
            }

            List<WebElement> prices =  driver.findElements(By.className("text-bold"));
            List<WebElement> nameProducts = driver.findElements(By.className("q-pt-md"));
            List<WebElement> linkProducts2 = driver.findElements(By.cssSelector("[style*='text-decoration: none;']"));
            List<String> linkProducts = new ArrayList<>();
            for (WebElement link : linkProducts2){
                if(link.getAttribute("href") != null){
                    if(link.getAttribute("href").contains("/product/noutbuk")){ //name
                        linkProducts.add(link.getAttribute("href"));
                    }
                }
            }
            for (int i = 0; i < prices.size(); i++) {
                String priceString = prices.get(i).getText().replace(" ","");
                int price = Integer.parseInt(priceString.substring(0,priceString.length()-1));
                String name = nameProducts.get(i).getText();
                String link = linkProducts.get(i);
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