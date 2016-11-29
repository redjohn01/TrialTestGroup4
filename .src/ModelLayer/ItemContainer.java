package ModelLayer;

import java.util.ArrayList;

/**
 * Created by RedJohn on 23-Nov-16.
 */
public class ItemContainer {

    private  ArrayList<Item> items;
    public ItemContainer () {
        items = new ArrayList<>();
    }


    public void addEItem(Item item) {
        items.add(item);
    }

    public Item getItem(int index) {
        return items.get(index);
    }

    public int getItemsSize() {
        return items.size();
    }

    public void removeItem(int index) {
        items.remove(index);
    }

}
