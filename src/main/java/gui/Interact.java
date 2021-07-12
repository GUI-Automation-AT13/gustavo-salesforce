package gui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Browser;

import java.util.concurrent.TimeUnit;

public class Interact {
    WebDriver driver;
    WebDriverWait wait;
    GuiSetting guiSetting =new GuiSetting();

    public Interact(Browser browser){
        driver = guiSetting.setBrowser(browser);
    }

    public void setPath(String Url){
        driver.get(Url);
        wait = new WebDriverWait(driver, 30);
    }

    public void click(InteractEnum interactEnum){
        waitElement(interactEnum);
        driver.findElement(interactEnum.getValue()).click();
    }

    public void writeText(InteractEnum interactEnum,String sendElement){
        waitElement(interactEnum);
        driver.findElement(interactEnum.getValue()).sendKeys(sendElement);
    }

    public String getText(InteractEnum interactEnum){
        waitElement(interactEnum);
        return driver.findElement(interactEnum.getValue()).getText();
    }

    public void windowsSize(int width, int height){
        driver.manage().window().setSize(new Dimension(width, height));
    }

    public void closeWindow(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    private void waitElement(InteractEnum interactEnum){
        if (interactEnum.isWaiting()){
            wait.until(ExpectedConditions.visibilityOfElementLocated(interactEnum.getValue()));
            return;
        }
    }

    public void setTimeToWait(int secondToWait){

    }

    public void waitSeconds(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public void QuitDriver(){
        driver.quit();
    }

    public void CloseWindow(){
        driver.close();
    }


}
