package others;

import java.util.ArrayList;
import java.util.List;

public class Messenger{
    final private List<Observer> clients = new ArrayList<>();

    public void addClient(Observer observerAction){
        clients.add(observerAction);
    }


    public void problem(){
        System.out.println("There is a problem");
        for( Observer i: clients){
            i.EventOccured("Order Denied");
        }
    }


}
