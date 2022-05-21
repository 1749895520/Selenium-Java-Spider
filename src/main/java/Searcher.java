import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Searcher {
    public static void main(String[] args) {
        //  设置webdriver路径
        System.setProperty("webdriver.edge.driver", Searcher.class.getClassLoader().getResource("EdgeWebDriver.exe").getPath());
        //  创建webdriver
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://so.lenovo.com.cn/?f=synthesis");

    }
}
