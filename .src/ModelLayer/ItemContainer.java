package ModelLayer;

import java.util.ArrayList;

/**
 * Created by RedJohn on 23-Nov-16.
 */
public class ItemContainer {

    public static ArrayList<Item> items = new ArrayList<>();


    public static void addEItem(Item item) {
        items.add(item);
    }

    public  static Item getItem(int index) {
        return items.get(index);
    }

    public static int getItemsSize() {
        return items.size();
    }

    public static void removeItem(int index) {
        items.remove(index);
    }

}
