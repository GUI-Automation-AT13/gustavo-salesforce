package gui;

import org.openqa.selenium.By;

public interface InteractEnum {

    public By getValue();

    public void setValue(By by);

    public boolean isWaiting();

    public void setWaiting(boolean waiting);

    public String getWrite();

    public void setWrite(String write);
}
