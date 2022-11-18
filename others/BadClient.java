package others;

public class BadClient implements Observer {
    @Override
    public void EventOccured(String problem) {
        System.out.println("You are a waste wake up "+problem);
    }
}
