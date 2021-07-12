package gui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Browser;

public class GuiSetting {

    public WebDriver setBrowser(Browser browser){
        String PATH = System.getProperty("user.dir");
        System.out.println(PATH+ browser.getPath());
        System.setProperty(browser.getBrowserKey(), PATH + browser.getPath());
        //@Done apply strategy or fabric pattern
        return new ChromeDriver();

    }


}
