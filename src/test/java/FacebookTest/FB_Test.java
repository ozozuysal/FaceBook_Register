package FacebookTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FB_Test {


    public WebDriver driver;
    FB_Page page=new FB_Page();


    @Before
    public void before() {
    }

    @Test
    public void Facebook() throws InterruptedException {

        page.openChromeBrowser();
        page.gotoFacebookPage();
        page.Name();
        page.Surname();
        page.eMail();
        page.eMailConfirm();
        page.newPassword();
        page.birthDay();
        page.birthMonth();
        page.birthYear();
        page.Gender();
        page.Submit();
        page.Captcha();
        page.Register();


    }

    @After
    public void After() throws InterruptedException  {

        driver.close();
    }
}
