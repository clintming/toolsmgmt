package com.wujie.toolsmgmt.service;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AccountService {
    private static String pathSeparator = System.getProperty("file.separator");
    private static String phantomaJsDriverPath = System.getProperty("user.dir") + pathSeparator+"src"+pathSeparator+"main"+pathSeparator+"java"+pathSeparator+"com"+pathSeparator+"wujie"+pathSeparator+"toolsmgmt"+pathSeparator+"drivers"+pathSeparator+"phantomjs.exe";
    private static String geckoDriverPath = System.getProperty("user.dir") +pathSeparator+"src"+pathSeparator+"main"+pathSeparator+"java"+pathSeparator+"com"+pathSeparator+"wujie"+pathSeparator+"toolsmgmt"+pathSeparator+"drivers"+pathSeparator+"geckodriver.exe";
    public static String openDepositAccount(){
        WebDriver driver = null;
        try {
            String phantomjsPath = phantomaJsDriverPath;
           System.setProperty("webdriver.gecko.driver", geckoDriverPath);
            //driver = new ChromeDriver();
           driver = new FirefoxDriver();
            //System.setProperty("phantomjs.binary.path",phantomjsPath);
            //driver = new PhantomJSDriver();

            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

            driver.get("https://testecas.srbank.cn/ecpg/open?orderid=35201804280000000031&srul=www.touzhijia.com&furl=www.touzhijia.com");
            //driver.findElement(By.xpath("//*[@id=\"layui-layer2\"]/div[3]/a[2]")).click();
            //driver.findElement(By.name("name")).click();
            System.out.println(driver.getPageSource());
            driver.findElement(By.name("name")).sendKeys("123abc");
            driver.findElement(By.name("idNo")).sendKeys("510311198607123913");
            driver.findElement(By.name("exAcctNo")).sendKeys("6228480128555111111");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //driver.findElement(By.name("exAcctPhone")).sendKeys("13823351999");
            driver.findElement(By.id("getCode")).click();
            driver.findElement(By.name("code")).sendKeys("123456");


            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.id("password")).click();
            driver.findElement(By.id("password")).click();
            driver.findElement(By.id("password")).sendKeys(Keys.chord("123456"));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.id("password_reset")).click();
            driver.findElement(By.id("password_reset")).click();
            driver.findElement(By.id("password_reset")).sendKeys("123456");
            driver.findElement(By.id("readProtocol")).click();

           // driver.findElement(By.xpath("/html/body/div[2]/div/form/div")).click();////html/body/div[2]/div/form/div[12]/div/div/div/i
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].value=\"123456\"",  driver.findElement(By.id("password")));
            //driver.findElement(By.id("password")).sendKeys("1");
//            driver.findElement(By.name("password_reset")).sendKeys("123456");
//            driver.findElement(By.xpath("/html/body/div[2]/div/form/div[12]/div/div/div/i")).click();
//            driver.findElement(By.xpath("/html/body/div[2]/div/form/div[13]/div/button[1]")).click();


//            driver.get("https://www.baidu.com");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            driver.findElement(By.id("kw")).sendKeys(Keys.chord("123"));
//            driver.findElement(By.id("su")).click();
           // JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("arguments[0].value=\"123456\"",  driver.findElement(By.id("password")));
            //driver.findElement(By.xpath("//*[@id=\"su\"]")).click();
            //driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a")).click();
            return null;
        }finally {
            //driver.quit();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //openDepositAccount();
//        String phantomjsPath = phantomaJsDriverPath;
//        //System.setProperty("webdriver.gecko.driver", geckoDriverPath);
//        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
//        //String chromeDriverLocation = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe";
//        //System.out.println("Chrome Driver: " + chromeDriverLocation );
//        //System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
//      //ChromeOptions options = new ChromeOptions();
//        //options.addArguments("--user-data-dir=C:\\Users\\mingcl\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
//        //options.addArguments("--user-agent=iPhone 6");
//     /*     options.addArguments("--user-agent=Mozilla/5.0 (Linux; Android 4.4.2; Nexus 4 Build/KOT49H) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.114 Mobile Safari/537.36");
//        options.addArguments("--start-maximized");
//
//
//        Map<String, String> mobileEmulation = new HashMap<>();
//        mobileEmulation.put("deviceName", "iPhone 6");
//        options.setExperimentalOption("mobileEmulation", mobileEmulation); */
///*
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        Map<String, String> mobileEmulation = new HashMap<String, String>();
//        mobileEmulation.put("deviceName", "iPhone 6");
//        Map<String, Object> chromeOptions = new HashMap<String, Object>();
//        chromeOptions.put("mobileEmulation", mobileEmulation);
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//        //options.setCapability(ChromeOptions.CAPABILITY, chromeOptions);*/
//        //WebDriver driver = new ChromeDriver(options);
//        driver.get("https://testecas.srbank.cn/ecpg/open?orderid=35201804290000000012&srul=www.touzhijia.com&furl=www.touzhijia.com");
//        Thread.sleep(3000);
//        driver.findElement(By.id("password")).click();
//        driver.findElement(By.id("password")).sendKeys(Keys.chord("123456"));

//        OpenDepositAccount depositAccount = new OpenDepositAccount(driver);
//        depositAccount.setName("abc123");
//        depositAccount.setIdCardNo("510311198607123913");
//        depositAccount.setBankNo("6228480128555111111");
//        depositAccount.setCode("123456");
//        depositAccount.setPassword("123456");
//        depositAccount.setReadProtocol();
    }
}
