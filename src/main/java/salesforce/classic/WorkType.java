package salesforce.classic;

import gui.InteractEnum;
import org.openqa.selenium.By;

public enum WorkType implements InteractEnum {
    NAME_OF_WORK_SPACE(By.id("Name_ilecell"), true, "");

    private By value;
    private boolean isWaiting;
    private String write;

    WorkType(By value, boolean isWaiting, String write) {
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
