package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    public void selectMenu(String menu) {
        clickOnElement(By.linkText(menu));
    }

    By computerMenuLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");

    // 1.1 Click on Computer Menu.
    public void clickOnComputerMenu() {
        clickOnElement(computerMenuLink);
    }

    By desktopLink = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");

    //1.2 Click on Desktop
    public void clickOnDesktopFromComputerMenuTab() {
        clickOnElement(desktopLink);
    }
By electronicsTabLink =By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhonesLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    public void mouseHoverOnElectronicsTab(){
        //1.1 Mouse Hover on “Electronics” Tab
        //1.2 Mouse Hover on “Cell phones” and click
               actionsMethodForMouseHover(electronicsTabLink,cellPhonesLink);
    }

    By logOutLink = By.xpath("//a[normalize-space()='Log out']");
    //2.43 Click on “Logout” link
    public void clickOnLogoutLink(){

        clickOnElement(logOutLink);
    }


}
