package Section_12.sortedCollection;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 2000.01, 3);
        stockList.addStock(temp);

        temp = new StockItem("handbag", 40.0, 10);
        stockList.addStock(temp);
        temp = new StockItem("handbag",  23.0, 12);
        stockList.addStock(temp);

        temp = new StockItem("shoes", 12.30, 20);
        stockList.addStock(temp);

        temp = new StockItem("shirt", 44.23, 12);
        stockList.addStock(temp);

        temp = new StockItem("jeans", 33.20, 10);
        stockList.addStock(temp);

        temp = new StockItem("leather shoes", 90.0, 20);
        stockList.addStock(temp);

        temp = new StockItem("sunglasses", 100.50, 3);
        stockList.addStock(temp);

        System.out.println(stockList);

        System.out.println("\n\n============================================================\n\n");

        Basket chrissiesBasket = new Basket("Chrissie");
        sellItem(chrissiesBasket, "car", 3);
        System.out.println(chrissiesBasket);
        sellItem(chrissiesBasket, "car", 1);
        System.out.println(chrissiesBasket);
        sellItem(chrissiesBasket, "shoes", 1);
        System.out.println(chrissiesBasket);
        sellItem(chrissiesBasket, "apricots", 5);
        System.out.println(chrissiesBasket);

        Basket basket = new Basket("customer");
        sellItem(basket, "cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);
        System.out.println(basket);

        removeItem(chrissiesBasket, "car", 1);
        removeItem(chrissiesBasket, "cup", 9);
        removeItem(chrissiesBasket, "car", 1);
        System.out.println("cars removed: " + removeItem(chrissiesBasket, "car", 1));  // should not remove any

        System.out.println(chrissiesBasket);

        removeItem(chrissiesBasket, "bread", 1);
        removeItem(chrissiesBasket, "cup", 3);
        removeItem(chrissiesBasket, "juice", 4);
        removeItem(chrissiesBasket, "cup", 3);
        System.out.println(chrissiesBasket);

        chrissiesBasket.checkOut(chrissiesBasket);

        System.out.println("\n\n" + stockList);



    }



    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("\nWe dont sell " + item);
            return 0;
        }
        if(stockItem.quantityInStock() == 0){
            System.out.println("Nothing added to basket. \nWe are out of stock of " + item + "(s).");
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0) {
                basket.addToBasket(stockItem, quantity);
                return quantity;
            }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }


}
