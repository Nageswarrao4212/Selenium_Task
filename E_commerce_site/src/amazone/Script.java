package amazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Script {

    public static void main(String[] args) {

        // Disable Chrome popups and password manager
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("safebrowsing.enabled", false);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        // Setup ChromeDriver automatically
        WebDriver driver = new ChromeDriver(options);

        // Wait configuration
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Open SauceDemo website
        driver.get("https://www.saucedemo.com/");
        
        //Maximize the window
        driver.manage().window().maximize();
        
        //Username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//Password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//Click on the login button
		driver.findElement(By.id("login-button")).click();
		
		//Click on product title link to open product details
		driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		
		// Click "Add to cart" button
		driver.findElement(By.id("add-to-cart")).click();
		
		//Navigate to shopping cart
		driver.findElement(By.className("shopping_cart_link")).click();

        //Logout process
        driver.findElement(By.id("react-burger-menu-btn")).click();
        WebElement logoutLink = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        logoutLink.click();
        System.out.println("Logged out successfully!");

        //Close browser
        driver.quit();
        System.out.println("Browser closed.");
    }
}
