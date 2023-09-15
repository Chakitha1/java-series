package day4;
public class ProdDeets {
    private int prod_id;
    private String prod_name;
    private int price;
    private int quan_on_hand;
    public void init(int prod_id, String prod_name, int price) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
        this.quan_on_hand = 0;
    }
    public double getNetPrice() {
        int taxRate = 12/100;
        return price + (price * taxRate);
    }
    public void purchase(int quantity) {
        if (quantity > 0) {
            quan_on_hand += quantity;
            System.out.println("Purchased " + quantity + " " + prod_name + "(s).");
        } else {
            System.out.println("Invalid quantity for purchase.");
        }
    }
    public void sell(int quantity) {
        if (quantity > 0 && quan_on_hand >= quantity) {
            quan_on_hand -= quantity;
            System.out.println("Sold " + quantity + " " + prod_name + "(s).");
        } else {
            System.out.println("Invalid quantity for sale.");
        }
    }