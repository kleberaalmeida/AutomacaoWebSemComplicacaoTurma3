package br.com.chronosAcademy.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursoPage {
    WebDriver driver;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitulo2() throws InterruptedException {
        String cssTitulo = "div.text-center > div.large-h1";
        Thread. sleep(1000);
        WebElement txtTitulo = driver.findElement(By.cssSelector(cssTitulo));
        return txtTitulo.getText();
    }
}
