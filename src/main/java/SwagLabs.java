import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SwagLabs {
    public static void main(String[] args){
        //instanciar el navegador
        WebDriver driver = new FirefoxDriver();

        //abrir el navegador
        driver.get("https://www.saucedemo.com/");
        //maximizar la ventana
        driver.manage().window().maximize();

        //Localizadores
        WebElement txtUsername = driver.findElement(By.id("user-name"));
        txtUsername.sendKeys("standard_user");

        WebElement txtPassw = driver.findElement(By.id("password"));
        txtPassw.sendKeys("secret_sauce");

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click();
        //fin de login

        //compra de articulo
        WebElement btnAddCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        btnAddCart.click();

        WebElement cart = driver.findElement(By.className("shopping_cart_badge"));
        cart.click();

        WebElement btnCheckOut = driver.findElement(By.id("checkout"));
        btnCheckOut.click();

        WebElement txtName = driver.findElement(By.id("first-name"));
        txtName.sendKeys("Andres");

        WebElement txtLastName = driver.findElement(By.id("last-name"));
        txtLastName.sendKeys("ParcoQa");

        WebElement txtPostal = driver.findElement(By.id("postal-code"));
        txtPostal.sendKeys("050006");

        WebElement btnContinue = driver.findElement(By.id("continue"));
        btnContinue.click();

        WebElement btnFinish = driver.findElement(By.id("finish"));
        btnFinish.click();

        //comparar texto esperado
        String textValidate = "Thank you for your order!";
        assertTrue(textValidate.contains("Thank you for your order!"));



        driver.quit();
    }

}
