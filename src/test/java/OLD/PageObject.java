//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class PageObject<HomePage, LoginPage> {
//        By usernameLocator = By.id("username");
//        By passwordLocator = By.id("passwd");
//        By loginButtonLocator = By.id("login");
//
//        private WebDriver driver;
//
//    public PageObject(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public void LoginPage(WebDriver driver) {
//            this.driver = driver;
//
//            if (!"Login".equals(driver.getTitle())) {
//                throw new IllegalStateException("This is not the login page");
//            }
//        }
//
//        public LoginPage typeUsername(String username) {
//            driver.findElement(usernameLocator).sendKeys(username);
//            return (LoginPage) this;
//        }
//
//        public LoginPage typePassword(String password) {
//            driver.findElement(passwordLocator).sendKeys(password);
//            return (LoginPage) this;
//        }
//
//        public HomePage submitLogin() {
//            driver.findElement(loginButtonLocator).submit();
//            return new HomePage(driver);
//        }
//
//        public LoginPage submitLoginExpectingFailure() {
//            driver.findElement(loginButtonLocator).submit();
//            return new LoginPage(driver);
//        }
//
//        public HomePage loginAs(String username, String password) {
//            typeUsername(username);
//            typePassword(password);
//            return submitLogin();
//        }
//}
