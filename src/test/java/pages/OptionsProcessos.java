package pages;

import org.openqa.selenium.By;
import support.DriverQA;

public class OptionsProcessos {
    private DriverQA driver;

    public OptionsProcessos(DriverQA driverQA) {
        driver = driverQA;
    }

    public void clickNovoProcesso() {
        driver.click("btn-novo");
    }
    public void clickMostrar(String code){
        driver.click("btn-show_"+code);
    }
    public void clickEditar(String code){
        driver.click("btn-edit_"+code);
    }
    public void clickDeletar(String code){
        driver.click("btn-delete_"+code);
    }
    public void confirmaDelecao(){
        driver.ChooseOkOnNextConfirmation();
    }
    public boolean existeBotaoApagar(String code){
        boolean respose = true;
        try{
            respose = driver.getDriver().findElement(By.id("btn-delete_"+code)).isDisplayed();

        }catch (Exception e){
            respose = false;
        }

        return respose;
    }

}

