package org.ual.hmis.jsm406;

// Generated by Selenium IDE

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CheckItemDoneTestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.gecko.driver",  "drivers/geckodriver.exe");

    FirefoxOptions firefoxOptions = new FirefoxOptions();
    firefoxOptions.setHeadless(true);
    driver = new FirefoxDriver(firefoxOptions);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void checkItemDoneTest() {
    driver.get("http://34.105.197.61:8080/");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.manage().window().setSize(new Dimension(1293, 1166));
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div/div/form/div/input")).sendKeys("prueba");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.xpath("//button[contains(.,\'Añadir\')]")).click();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    
    assertThat(driver.findElement(By.xpath("//div/div[2]")).getText(), is("prueba"));
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div/div/div/div/div/button/i")).click();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div/div/form/div/input")).sendKeys("prueba2");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.xpath("//button[contains(.,\'Añadir\')]")).click();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    assertThat(driver.findElement(By.xpath("//div[@id=\'root\']/div/div/div/div[2]/div/div[2]")).getText(), is("prueba2"));
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div/div/div/div/div[3]/button/i")).click();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.xpath("//div[@id=\'root\']/div/div/div/div/div/div[3]/button/i")).click();
    

  }
}