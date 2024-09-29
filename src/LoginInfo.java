import java.util.HashMap;

public class LoginInfo {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginInfo() {
        logininfo.put("Onim", "12345");
        logininfo.put("Tanim", "asdfgh");
        logininfo.put("Farhan", "qwerty");
        logininfo.put("Miskat", "zxcvbn");
    }

    public HashMap getLoginInfo() {
        return logininfo;
    }
}
