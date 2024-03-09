package Fabbric;

import Interface.iGameItem;
import Product.Gold;

public class GoldGenerator extends ItemGeneration {

    @Override
    public iGameItem createItem() {
        return new Gold();
    }
    
}
