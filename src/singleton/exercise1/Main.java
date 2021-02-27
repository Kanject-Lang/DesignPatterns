package singleton.exercise1;

import singleton.example.Singleton;

/**
 * @description: TODO
 * @author: Kanject
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        TicketMaker ticketMaker2 = TicketMaker.getInstance();
        if (ticketMaker1 == ticketMaker2) {
            System.out.println("ticketMaker1与ticketMaker2是相同实例");
        } else {
            System.out.println("ticketMaker1与ticketMaker2不是相同实例");
        }
        System.out.println("ticketMaker1 getNextTicketNumber ===> " + ticketMaker1.getNextTicketNumber());
        System.out.println("ticketMaker1 getNextTicketNumber ===> " + ticketMaker1.getNextTicketNumber());
        System.out.println("ticketMaker1 getNextTicketNumber ===> " + ticketMaker1.getNextTicketNumber());

        System.out.println("ticketMaker2 getNextTicketNumber ===> " + ticketMaker2.getNextTicketNumber());
        System.out.println("ticketMaker2 getNextTicketNumber ===> " + ticketMaker2.getNextTicketNumber());
        System.out.println("ticketMaker2 getNextTicketNumber ===> " + ticketMaker2.getNextTicketNumber());
        System.out.println("End.");
    }
}
