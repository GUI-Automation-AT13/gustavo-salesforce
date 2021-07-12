package salesforce;

import gui.Interact;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import salesforce.lightning.WorkType;
import salesforce.lightning.WorkTypeForm;
import utilities.Browser;
import salesforce.lightning.WorkTypes;
import static org.junit.Assert.assertEquals;

public class WorkTypesLightning {
    Interact interact=new Interact(Browser.CHROME);

    @Before
    public void testLogin() {
        interact.setPath(Urls.PATH.getValue());
        interact.windowsSize(1281, 881);
        interact.click(LoginPage.LOGIN_BUTTON_MAIN);
        interact.writeText(LoginPage.USER_TEXT_BOX,UserDate.USERNAME.getValue());
        interact.writeText(LoginPage.PASSWORD_TEXT_BOX,UserDate.PASSWORD.getValue());
        interact.click(LoginPage.LOGIN_BUTTON);
    }

    @Test
    public void workTypeCreate() {
        interact.setPath(Urls.WORK_TYPE_LIGHTNING.getValue());
        interact.click(WorkTypes.BUTTON_NEW);
        interact.writeText(WorkTypeForm.WORK_TYPE_NAME_TEXT_BOX,"ppp");
        interact.writeText(WorkTypeForm.ESTIMATED_DURATION_TEXT_BOX,"5");
        interact.click(WorkTypeForm.SAVE_BUTTON);
        interact.waitSeconds(10);
       // assertEquals("ppp",interact.getText(WorkType.NAME_OF_WORK_SPACE));
    }

    @After
    public void DeleteWork2Type() {
        interact.QuitDriver();
        interact.CloseWindow();
    }
}
