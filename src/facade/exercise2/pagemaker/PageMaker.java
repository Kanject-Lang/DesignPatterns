package facade.exercise2.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {

    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("src\\facade\\exercise2\\maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "欢迎来到 " + username + " 的主页。");
            writer.paragraph(" 等着你的邮件哦！ ");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is create for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String filename) {
        try {
            Properties mailprop = Database.getProperties("src\\facade\\exercise2\\maildata");
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link page");
            for (Object mail : mailprop.keySet()) {
                writer.link((String) mail, mailprop.getProperty((String) mail));
            }
            writer.close();
            System.out.println(filename + "linkPage.html is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
