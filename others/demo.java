package others;

import java.util.stream.Stream;


public class demo {
    public static void main(String[] args) {
        System.out.println("demo starts");

        Messenger m = new Messenger();
        GoodClient g1 = new GoodClient();
        GoodClient g2 = new GoodClient();
        BadClient b1 = new BadClient();

        m.addClient(g1);
        m.addClient(g2);
        m.addClient(b1);

        m.problem();






    }
}
