import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabbric.GemGenerator;
import Fabbric.GoldGenerator;
import Fabbric.ItemGeneration;

public class App {
    public static void main(String[] args) throws Exception {
       ItemGeneration f1 = new GoldGenerator();
       f1.openReward();
       ItemGeneration f2 = new GemGenerator();
       f2.openReward();

       List<ItemGeneration> generatorList = new ArrayList<>();
       generatorList.add(f1);
       generatorList.add(f2);

       // для увеличения щансов выпадения
       generatorList.add(new GoldGenerator());
       generatorList.add(new GoldGenerator());
       generatorList.add(new GoldGenerator());

       Random rnd = ThreadLocalRandom.current();


        for(int i = 0; i<10;i++){
            int index = rnd.nextInt(2);
            generatorList.get(index).openReward();
        }

    }
}
