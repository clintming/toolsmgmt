package com.wujie.toolsmgmt.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenDepositAccount {

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "idNo")
    private WebElement idCardNo;

    @FindBy(id = "exAcctNo")
    private WebElement bankNo;

    @FindBy(id = "getCode")
    private WebElement getCodeButton;

    @FindBy(id = "code")
    private WebElement code;

    @FindBy(id = "kb1")
    private WebElement password;

    @FindBy(id = "kb2")
    private WebElement confirmPassword;

    @FindBy(id = "readProtocol")
    private WebElement readProtocol;

//    @FindBy(name = "name")
//    private WebElement name;
//
//    @FindBy(name = "idNo")
//    private WebElement idCardNo;
//
//    @FindBy(name = "exAcctNo")
//    private WebElement bankNo;
//
//    @FindBy(id = "getCode")
//    private WebElement getCodeButton;
//
//    @FindBy(name = "code")
//    private WebElement code;
//
//    @FindBy(id = "password")
//    private WebElement password;
//
//    @FindBy(id = "password_reset")
//    private WebElement confirmPassword;
//
//    @FindBy(id = "readProtocol")
//    private WebElement readProtocol;

    public OpenDepositAccount(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void setName(String userName){
        name.sendKeys(userName);
    }

    public void setIdCardNo(String idNo) {
        idCardNo.sendKeys(idNo);
    }
    public void setBankNo(String bankCard){
        bankNo.sendKeys(bankCard);
    }
    public void setCode(String newCode){
        code.sendKeys(newCode);
    }
    public void setPassword(String newPassword) throws InterruptedException {
        password.click();
        password.click();
        password.sendKeys("123456");
        Thread.sleep(2000);
        confirmPassword.click();
        confirmPassword.sendKeys(Keys.chord("1"));
        //confirmPassword.sendKeys(Keys.chord("1"));
    }

    public void setReadProtocol(){
        readProtocol.click();
    }
}
