package singleton.exercise1;

/**
 * @description: TODO
 * @author: Kanject
 */
public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private TicketMaker() {
        System.out.println("生成了一个TicketMaker实例");
    }
    private int ticket = 1000;
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
    public static TicketMaker getInstance() {
        return ticketMaker;
    }
}
