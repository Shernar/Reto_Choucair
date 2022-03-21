package co.com.choucair.certificacion.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterInformation extends PageObject {

    public static final Target FIRST_NAME = Target.the("Field First Name").
            located(By.xpath("//input[@placeholder='First Name']"));
    public static final Target LAST_NAME = Target.the("Field Last Name").
            located(By.xpath("//input[@placeholder='Last Name']"));
    public static final Target ADDRESS = Target.the("Field Address")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));
    public static final Target EMAIL_ADRRESS = Target.the("Field Email Address")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//*[@id='eid']/input"));
    public static final Target PHONE = Target.the("Field Phone")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input"));
    public static final Target GENDER_MALE = Target.the("Field Gender Male")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//label[1]//input[1]"));
    public static final Target GENDER_FEMALE = Target.the("Field Gender Female")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//label[2]//input[1]"));
    public static final Target HOBBIES_CRICKET = Target.the("Field Hobbies Cricket")
            .located(net.serenitybdd.core.annotations.findby.By.id("checkbox1"));
    public static final Target HOBBIES_MOVIES = Target.the("Field Hobbies Movies")
            .located(net.serenitybdd.core.annotations.findby.By.id("checkbox2"));
    public static final Target HOBBIES_HOCKEY = Target.the("Field Hobbies Hockey")
            .located(net.serenitybdd.core.annotations.findby.By.id("checkbox3"));
    public static final Target LANGUAGES = Target.the("Field Languages")
            .located(net.serenitybdd.core.annotations.findby.By.id("msdd"));
    public static final Target LIST_LANGUAGES = Target.the("List Languages")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//section[@id='section']//li"));
    public static final Target WHITE_AREA = Target.the("White Area")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//div[@class='container center']//div[contains(@class,'row')]"));
    public static final Target SKILLS = Target.the("Field Skills")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//select[@id='Skills']"));
/*    public static final Target COUNTRY = Target.the("Field Pais")
            .located(net.serenitybdd.core.annotations.findby.By.id("countries"));*/
    public static final Target SELECT_COUNTRY_1 = Target.the("Field Select Country 1")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span"));
    public static final Target SELECT_COUNTRY_2 = Target.the("Field Select Country 2")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//input[@class='select2-search__field']"));
    public static final Target YEAR = Target.the("Field Year")
            .located(net.serenitybdd.core.annotations.findby.By.id("yearbox"));
    public static final Target MONTH = Target.the("Field Month")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//select[@placeholder='Month']"));
    public static final Target DAY = Target.the("Field Day")
            .located(net.serenitybdd.core.annotations.findby.By.id("daybox"));
    public static final Target PASSWORD = Target.the("Field Password")
            .located(net.serenitybdd.core.annotations.findby.By.id("firstpassword"));
    public static final Target CONFIRM_PASSWORD = Target.the("Field Confirm Password")
            .located(net.serenitybdd.core.annotations.findby.By.id("secondpassword"));
    public static final Target SUBMIT = Target.the("Button Submit")
            .located(net.serenitybdd.core.annotations.findby.By.id("submitbtn"));
}
