package Section_12.sortedCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if(item != null && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }else if (item == null) {
            System.out.println(item + " does not exist.");
        }else {
            System.out.println("No stock left of item");
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity) {
        if((item != null) && (quantity > 0)) {
            // check if we already have the item in the basket
            int inBasket = list.getOrDefault(item, 0);
            int newQuantity = inBasket - quantity;

            if(newQuantity > 0) {
                list.put(item, newQuantity);
                return quantity;
            } else if(newQuantity == 0) {
                list.remove(item);
                return quantity;
            }
        }
        return 0;
    }


    public void checkOut(Basket basketName) {
        if(basketName != null) {
            for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
                int transfer = item.getKey().getReserved();
                item.getKey().adjustStock(-transfer);
                item.getKey().setReserved(-transfer);
            }
        }
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + " items\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }

    public void clearBasket() {
        this.list.clear();
    }
}
