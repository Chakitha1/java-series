package day8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Product {
    private String name;
    private int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String toString() {
        return name + " ($" + price + ")";
    }
    public static Comparator<Product> NameComparator = new Comparator<Product>() {
        public int compare(Product product1, Product product2) {
            return product1.getName().compareTo(product2.getName());
        }
    };
    public static Comparator<Product> PriceComparator = new Comparator<Product>() {
        public int compare(Product product1, Product product2) {
            return Double.compare(product1.getPrice(), product2.getPrice());
        }
    };
}
public class SortProd {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999));
        products.add(new Product("Phone", 699));
        products.add(new Product("Tablet", 299));
        System.out.println("Sorted by name:");
        Collections.sort(products, Product.NameComparator);
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("\nSorted by price:");
        Collections.sort(products, Product.PriceComparator);
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
