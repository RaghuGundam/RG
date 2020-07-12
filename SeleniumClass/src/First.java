import org.openqa.selenium.By;  
  
public class First extends Reusable{  
  
    public static void main(String[] args) throws InterruptedException {  

    // declaration and instantiation of objects/variables  
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishitha\\Downloads\\chromedriver_win32\\chromedriver.exe");  
    //WebDriver driver=new ChromeDriver();  
    launchbrowser();
    appurl("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
  
// Launch website  
   // driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");  
    //driver.manage().window().maximize();  
    sendText(By.id("firstName"), "Raghu");
    Thread.sleep(1000);
    sendText(By.id("lastName"),"Gundam");
    //driver.findElement(By.id("lastName")).sendKeys("Gundam");
    Thread.sleep(3000);
    //driver.findElement(By.id("username")).clear();
    Thread.sleep(4000);
    sendText(By.id("username"),"Raghu.Gundam09");
    //driver.findElement(By.id("username")).sendKeys("Raghu.Gundam09");
    Thread.sleep(1000);
    sendText(By.name("Passwd"),"welcome666");
    //driver.findElement(By.name("Passwd")).sendKeys("welcome666");
    Thread.sleep(1000);
    sendText(By.name("ConfirmPasswd"),"welcome666");
    //driver.findElement(By.name("ConfirmPasswd")).sendKeys("welcome666");
    Thread.sleep(1000);
    click(By.xpath("//*[@id='accountDetailsNext']/span/span"));
    //driver.findElement(By.xpath("//*[@id='accountDetailsNext']/span/span")).click();
  
Thread.sleep(3000);
sendText(By.id("phoneNumberId"),"9573547941");
//driver.findElement(By.id("phoneNumberId")).sendKeys("9573547941");
   // driver.close();
  
    }
}