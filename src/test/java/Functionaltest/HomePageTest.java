package Functionaltest;

import Pageobjects.HomePage;
import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pageobjects.HomePage;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class HomePageTest extends BaseTest {

        @Test
        public void shouldBeAbleToClickCareersBtn(){
            //Arrange
            HomePage home = new HomePage(driver);

            //Act
            home.clickCareers();

            //Assert
            String expectedTitle = "https://www.hcsc.com/careers";
            String actualTitle = driver.getCurrentUrl();
            Assert.assertEquals(actualTitle,expectedTitle);
        }

    }



