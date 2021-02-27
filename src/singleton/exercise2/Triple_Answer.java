package singleton.exercise2;

/**
 * @description: TODO
 * @author: Kanject
 */
public class Triple_Answer {
    private static Triple_Answer[] triple_answers = new Triple_Answer[] {
            new Triple_Answer(0),
            new Triple_Answer(1),
            new Triple_Answer(2),
    };
    private int id;

    private Triple_Answer(int id) {
        System.out.println("The instance " + id + " is create.");
        this.id = id;
    }

    public static Triple_Answer getInstance(int id) {
        return triple_answers[id];
    }

    public String toString() {
        return "[Triple id=" + id + "]";
    }
}
