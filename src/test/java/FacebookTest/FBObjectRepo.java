package FacebookTest;

import org.openqa.selenium.By;

public class FBObjectRepo {

    public static final By txtName = By.cssSelector("input[name='firstname']");
    public static final By txtSurname = By.cssSelector("input[name='lastname']");
    public static final By txtEmail = By.cssSelector("input[name='reg_email__']");
    public static final By txtEmailConfirm = By.cssSelector("input[name='reg_email_confirmation__']");
    public static final By txtNewPassword = By.cssSelector("input[name='reg_passwd__']");
    public static final By cmbDay = By.id("day");
    public static final By cmbMonth = By.id("month");
    public static final By cmbYear = By.id("year");
    public static final By radGender = By.cssSelector("input[value='1']");
    public static final By btnSubmit = By.cssSelector("button[name='websubmit']");
    public static final By captcha = By.id("code_in_cliff");
    public static final By btnRegister = By.cssSelector("button[name='confirm']");



}
