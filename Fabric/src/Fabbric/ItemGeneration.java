package Fabbric;

import Interface.iGameItem;

public abstract class ItemGeneration {

    public void openReward()
    {
        iGameItem gameItem = createItem();
        gameItem.open();
    }
    
    public abstract iGameItem createItem();
    
}
