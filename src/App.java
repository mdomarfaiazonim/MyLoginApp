public class App {
    public static void main(String[] args) {
        LoginInfo loginInfo = new LoginInfo();
        LoginPage loginPage = new LoginPage(loginInfo.getLoginInfo());
    }
}
