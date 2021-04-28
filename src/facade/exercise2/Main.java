package facade.exercise2;

import facade.exercise2.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@yuki.com", "welcome.html");
        PageMaker.makeLinkPage("linkPage.html");
    }
}
