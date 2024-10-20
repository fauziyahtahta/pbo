public class Item {
    //atribut milik dari object Item.
    private double itemPrice;
    private String itemName;
    private String itemCode;
    private int itemStock;
    private int quantity;

    //Default constructor

    public Item(String name, String code, double price, int quantity){
        this.itemName = name;
        this.itemCode = code;
        this.itemPrice = price;
        this.quantity = quantity;
    }

    public void setStock(int stock) {
        this.itemStock = stock;
    }

    public int updateStock(int stockUpdate){
        this.itemStock += stockUpdate;
        return itemStock;
    }

    public double getPrice() {
        return itemPrice;
    }

    public String getCode(){
        return itemCode;
    }

    public String getName(){
        return itemName;
    }

    public int getStock(){
        return itemStock;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getsubTotal(){
        return itemPrice * quantity;
    }

}
