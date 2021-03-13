package exercise;

public class TicketMarker {
    private int ticket = 1000;
    private static TicketMarker ticketMarker = new TicketMarker();

    private TicketMarker() {
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

    public static TicketMarker getInstance() {
        return ticketMarker;
    }
}
