package Section_12.sortedCollection;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private int reserved;
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if(item != null) {
            StockItem inStock = list.getOrDefault(item.getName(), item);
            if(inStock != item) {
                item.adjustStock(inStock.quantityInStock());
            }
            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);
        if((inStock != null) && ((inStock.quantityInStock() - inStock.getReserved()) >= quantity) && (quantity > 0)){
            if((inStock.quantityInStock() >= quantity) &&
                    (inStock.quantityInStock() - inStock.getReserved() >= quantity)) {
            inStock.setReserved(quantity);
            }
            //inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    StockItem get(String key){
        return list.get(key);
    }

    public int unreserveStock(String item, int quantity) {
        if(quantity <= reserved) {
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for(Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();
            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();
            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock.Value of items : ";
            s = s + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }
            return s + "Total stock value " + totalCost;
    }
}
