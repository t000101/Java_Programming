package lesson_09_02;

public class ExternalLoginPage extends LoginPage{
    @Override
    protected String usernameLocator() {
        return "ExternalLoginPage | usernameLocator";
    }

    @Override
    protected String passwordLocator() {
        return "ExternalLoginPage | passwordLocator";
    }

    @Override
    protected String loginBtnLocator() {
        return "ExternalLoginPage | loginBtnLocator";
    }
}
