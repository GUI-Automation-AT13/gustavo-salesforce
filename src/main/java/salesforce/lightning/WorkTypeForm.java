package salesforce.lightning;

import gui.InteractEnum;
import org.openqa.selenium.By;

public enum WorkTypeForm implements InteractEnum {
    WORK_TYPE_NAME_TEXT_BOX(By.xpath("//input[@aria-required='true'][not(contains(@class,'input uiInputSmartNumber'))]"),
            true, "WorkSpace-Create-Lightning"),
    ESTIMATED_DURATION_TEXT_BOX(By.xpath("//input[@aria-required='true'][contains(@class,'input uiInputSmartNumber')]"),
            false,"44"),
    SAVE_BUTTON(By.xpath("//button[@data-aura-class='uiButton forceActionButton'][3]"),false,"");

    private By value;
    private boolean isWaiting;
    private String write;

    WorkTypeForm(By value, boolean isWaiting, String write) {
        this.value = value;
        this.isWaiting = isWaiting;
        this.write = write;
    }

    public By getValue() {
        return value;
    }

    public void setValue(By by) {
        this.value = value;
    }

    public boolean isWaiting() {
        return isWaiting;
    }

    public void setWaiting(boolean waiting) {
        isWaiting = waiting;
    }

    public String getWrite() {
        return write;
    }

    public void setWrite(String write) {
        this.write = write;
    }
}
