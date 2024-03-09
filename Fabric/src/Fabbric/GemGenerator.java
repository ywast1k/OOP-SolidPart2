package Fabbric;

import Interface.iGameItem;
import Product.Gem;

public class GemGenerator extends ItemGeneration {

    @Override
    public iGameItem createItem() {
        return new Gem();
    }

    
}
