package br.com.chronosAcademy.page;

import br.com.chronosAcademy.maps.PrincipalMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {

    private WebDriver driver;
    private PrincipalMap principalMap;



    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
        principalMap = new PrincipalMap();
        PageFactory.initElements(driver, principalMap);
    }

    public String getTitulo() {
        return principalMap.txtTitulo.getText();
    }

    public void clickBotao() {
        principalMap.btnTitulo.click();
    }
}
