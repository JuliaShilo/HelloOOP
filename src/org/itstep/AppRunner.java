package org.itstep;

public class AppRunner {
    public static void main(String[] args) {
        User me = new User ();
        me.name = "Julia";
        me.password = "12345";

        User you = new User ();
        you.name = "your name";
        you.password = "your pass";

        System.out.println("User ME has name " + me.name);
        System.out.println("User YOU has name " + you.name);
    }
}
