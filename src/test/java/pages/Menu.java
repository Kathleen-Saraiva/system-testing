package pages;

import support.DriverQA;

public class Menu {
    private DriverQA driver;

    public Menu(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void clicarMenu(String vMenu) {
        driver.click(vMenu);
    }
}
