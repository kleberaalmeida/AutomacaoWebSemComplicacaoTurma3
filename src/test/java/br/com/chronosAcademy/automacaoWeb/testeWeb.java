package br.com.chronosAcademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.Assert.assertEquals;

public class testeWeb {

    WebDriver driver;

    @Before
    public void inicializaTeste(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
    }

    @Test
    public void primeiroTeste() {
        String xpathTitulo = "/html/body/div/div/div/section[2]/div[3]/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.", titulo);
    }

    @Test
    public void segundoTeste() {
        String xpathTitulo = "/html/body/div/div/div/section[2]/div[3]/div/div/div[2]/div/div/a/span/span[2]";
        driver.findElement(By.xpath(xpathTitulo)).click();
        String xpathSegundoTitulo = "//*[@id=\"block-214\"]/div/div/div/div[1]/div/div";
        WebElement txtSegundoTitulo = driver.findElement(By.xpath(xpathSegundoTitulo));
        String titulo = txtSegundoTitulo.getText();
        assertEquals("Conheça todos os nossos cursos.", titulo);
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }
}


