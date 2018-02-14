package HeadsOrTails;

import java.util.Random;

public class HeadsOrTails {
    public int countHeads(int attempt){
        Random random = new Random();
        int headsWas = 0;
        for (int i = 0; i <= attempt; i++) {
            if (random.nextBoolean()) {
                headsWas++;
            }
        }
        return headsWas;
    }
}
