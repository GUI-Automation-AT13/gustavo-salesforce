package salesforce;

import gui.Interact;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import salesforce.classic.WorkTypeForm;
import salesforce.classic.WorkTypes;
import salesforce.classic.WorkType;
import utilities.Browser;

import static org.junit.Assert.assertEquals;

public class WorkTypesClassic {
    Interact interact = new Interact(Browser.CHROME);

    @Before
    public void testLogin() {
        interact.setPath(Urls.PATH.getValue());
        interact.windowsSize(1281, 881);
        interact.click(LoginPage.LOGIN_BUTTON_MAIN);
        interact.writeText(LoginPage.USER_TEXT_BOX, UserDate.USERNAME.getValue());
        interact.writeText(LoginPage.PASSWORD_TEXT_BOX, UserDate.PASSWORD.getValue());
        interact.click(LoginPage.LOGIN_BUTTON);
    }

    @Test
    public void workTypeCreateClassic() {
        interact.setPath(Urls.WORK_TYPE_CLASSIC.getValue());
        interact.click(WorkTypes.CLOSE_ANNOUNCEMENT);
        interact.click(WorkTypes.BUTTON_NEW);
        interact.writeText(WorkTypeForm.WORK_TYPE_NAME_TEXT_BOX, "WorkCreate-Classic");
        interact.writeText(WorkTypeForm.ESTIMATED_DURATION_TEXT_BOX, "9");
        interact.click(WorkTypeForm.SAVE_BUTTON);
        assertEquals("WorkCreate-Classic", interact.getText(WorkType.NAME_OF_WORK_SPACE));

    }

    @After
    public void DeleteWork2Type() {
        interact.QuitDriver();
    }
}
