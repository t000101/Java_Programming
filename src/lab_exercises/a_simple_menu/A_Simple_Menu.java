package lab_exercises.a_simple_menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class A_Simple_Menu {
    String desMenu = null;

    public A_Simple_Menu(String desMenu) {
        this.desMenu = desMenu;
    }

    @Override
    public String toString() {
        return "{" + desMenu + "}";
    }
}
