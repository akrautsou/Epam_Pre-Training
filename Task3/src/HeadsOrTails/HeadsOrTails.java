package HeadsOrTails;

import java.util.Random;

public class HeadsOrTails {
    public int countHeads(int attempt){
        int headsWas = 0;
        for (int i = 0; i <= attempt; i++) {
            if (new Random().nextBoolean()) {
                headsWas++;
            }
        }
        return headsWas;
    }
}
