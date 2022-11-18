package others;

public class GoodClient implements Observer {

    @Override
    public void EventOccured(String problem) {
        System.out.println("You are a good client i have to inform you about "+problem);
    }
}
