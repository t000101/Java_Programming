package lesson_09_02;

// Strongly FORCE IS_A_relationship
public abstract class LoginPage {

    protected  void login(){
        System.out.println(usernameLocator());
        System.out.println(passwordLocator());
        System.out.println(loginBtnLocator());
    }

    protected abstract String usernameLocator();
    protected abstract String passwordLocator();
    protected abstract String loginBtnLocator();
}
