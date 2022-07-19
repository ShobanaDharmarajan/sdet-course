package Pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {



        WebDriver driver;
        By careers = By.cssSelector("#language > li:nth-child(1) > a");
        By search = By.id("search-header");
        By searchbtn = By.id("search-bar-btn");
        //All objects belong to the Home page

        //Constructor

        public HomePage(WebDriver driver){
            this.driver = driver;
        }

        public void clickCareers(){
            driver.findElement(careers).click();
        }

    }


