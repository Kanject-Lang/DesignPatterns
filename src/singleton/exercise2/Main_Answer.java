package singleton.exercise2;

/**
 * @description: TODO
 * @author: Kanject
 */
public class Main_Answer {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i=0; i<9; i++) {
            Triple_Answer triple_answer = Triple_Answer.getInstance(i % 3);
            System.out.println(i + ":" + triple_answer.toString());
        }
        System.out.println("End.");
    }
}
