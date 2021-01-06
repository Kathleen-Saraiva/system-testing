package pages;

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

    public boolean existeTexto(String message) {
        return driver.getTextAllPage(message);
    }

}

