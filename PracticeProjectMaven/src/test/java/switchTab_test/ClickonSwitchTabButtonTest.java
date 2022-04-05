package switchTab_test;

import login_test.BaseLoginTest;
import org.junit.Assert;
import org.junit.Test;
import page_object.switch_window.SwitchWindow;

public class ClickonSwitchTabButtonTest extends BaseLoginTest {



    @Test
    public void ClickonSwitchTabButtonTest(){
        SwitchWindow sw =new SwitchWindow(driver);
        sw.WindowHandles();
        Assert.assertTrue("Click on the open new tab button failed",sw.clickonOpenTabButton() );
    }

}
