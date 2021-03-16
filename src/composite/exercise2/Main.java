package composite.exercise2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory binddir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(binddir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            binddir.add(new File("vi", 10000));
            binddir.add(new File("latex", 20000));
            rootdir.printList("");

            System.out.println("");
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            File html = new File("diary.html", 100);
            File java = new File("Composite.java", 200);
            File tex = new File("memo.tex", 300);
            File doc = new File("game.doc", 400);
            File mail = new File("junk.mail", 500);

            yuki.add(html);
            yuki.add(java);
            hanako.add(tex);
            tomura.add(doc);
            tomura.add(mail);
            rootdir.printList("");

            System.out.println("===== fullname =====");
            System.out.println(yuki.getFullName());
            System.out.println(hanako.getFullName());
            System.out.println(tomura.getFullName());
            System.out.println(html.getFullName());
            System.out.println(java.getFullName());
            System.out.println(tex.getFullName());
            System.out.println(doc.getFullName());
            System.out.println(mail.getFullName());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
