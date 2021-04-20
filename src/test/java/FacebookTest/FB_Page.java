package FacebookTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;
import sun.awt.SunHints;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.String.valueOf;


public class FB_Page {

    WebDriver driver;
    WebDriverWait wait;

    public void openChromeBrowser() {
        String path = System.getProperty("user.dir");
        System.out.println("Proje path : " + path);
        //System.setProperty("webdriver.chrome.driver", path + "\\lib\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", path + "\\lib\\chromedriver.exe");

        driver = new ChromeDriver();

        // tum elementler icin maksimum 15 bekleyeck
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void gotoFacebookPage() {
        driver.get("https://www.facebook.com/");
        if (driver.getCurrentUrl().contains("https://www.facebook.com/")) {
            System.out.println("Facebook page is opened");
        } else {
            throw new WebDriverException("Facebook page could not be opened");
        }
    }

    public void Name() {

        driver.findElement(FBObjectRepo.txtName).click();
        driver.findElement(FBObjectRepo.txtName).sendKeys("Ozgur");

    }

    public void Surname() {

        driver.findElement(FBObjectRepo.txtSurname).click();
        driver.findElement(FBObjectRepo.txtSurname).sendKeys("Ozuysal");
    }

    public void eMail() {

        driver.findElement(FBObjectRepo.txtEmail).click();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        driver.findElement(FBObjectRepo.txtEmail).sendKeys("username"+ randomInt +"@gmail.com");

    }

    public void eMailConfirm() {

        String CopyText = driver.findElement(FBObjectRepo.txtEmail).getAttribute("value");

        System.out.println(CopyText);

        driver.findElement(FBObjectRepo.txtEmailConfirm).clear();
        driver.findElement(FBObjectRepo.txtEmailConfirm).sendKeys(CopyText);

        System.out.println("Confirm");
    }

    public void newPassword() {

        driver.findElement(FBObjectRepo.txtNewPassword).click();
        driver.findElement(FBObjectRepo.txtNewPassword).sendKeys("1ForYou!");
    }

    public void birthDay() {

        Select select=new Select(driver.findElement(FBObjectRepo.cmbDay));
        select.selectByValue("5");

        System.out.println("Birthday Selected");

        }

    public void birthMonth() {

        Select select=new Select(driver.findElement(FBObjectRepo.cmbMonth));
        select.selectByIndex(5);

        System.out.println("Birthmonth Selected");
    }

    public void birthYear() {

        Select select=new Select(driver.findElement(FBObjectRepo.cmbYear));
        select.selectByVisibleText("1980");

        System.out.println("Birthyear Selected");
    }

    public void Gender() {

        driver.findElement(FBObjectRepo.radGender).click();

        System.out.println("Gender Selected");
    }

    public void Submit() {

        try {
            driver.findElement(FBObjectRepo.btnSubmit).click();
            WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(FBObjectRepo.btnSubmit));
            if (element.isEnabled()) {
                System.out.println("Submit button clicked");
            }
        }catch(Exception AA) {
            System.out.println("Could not found webPage");
        }
    }


        public void Captcha() {


           driver.findElement(FBObjectRepo.captcha).sendKeys("89012");

            System.out.println("User Entered Captcha");
        }

        public void Register() {

        driver.findElement(FBObjectRepo.btnRegister).click();

            System.out.println("Facebook registration completed!!");

        }

    }


