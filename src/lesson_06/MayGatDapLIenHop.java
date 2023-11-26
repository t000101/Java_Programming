package lesson_06;

//Template | Blueprint
public class MayGatDapLIenHop {

    //What to solve

    public void gatLua(String cayLua){
        System.out.println("Dang gat " + cayLua);
    }

    public void xayLua(String hatLua){
        System.out.println("Dang xay " + hatLua);
    }

    public static void main(String[] args) {
        MayGatDapLIenHop mayGatDapLIenHop = new MayGatDapLIenHop();

        //.: dot notation
        mayGatDapLIenHop.gatLua("Cay Lua");
        mayGatDapLIenHop.xayLua("Hat Luat");
    }

}
