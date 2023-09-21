package day5;
class Product {
    protected String name;
    protected double basePrice;
    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }
    public void print() {
        System.out.println("Product Name: " + name);
        System.out.println("Base Price: $" + basePrice);
    }
    public double getNetPrice() {
        return basePrice;
    }
    public void setPrice(double price) {
        this.basePrice = price;
    }
}
class ImportedProduct extends Product {
    protected double importDuty;
    public ImportedProduct(String name, double basePrice, double importDuty) {
        super(name, basePrice);
        this.importDuty = importDuty;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Import Duty: $" + importDuty);
    }
    @Override
    public double getNetPrice() {
        return super.getNetPrice() + importDuty;
    }
    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }
}
class DiscountedProduct extends Product {
    protected double discountRate;
    public DiscountedProduct(String name, double basePrice, double discountRate) {
        super(name, basePrice);
        this.discountRate = discountRate;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Discount Rate: " + discountRate + "%");
    }
    @Override
    public double getNetPrice() {
        return super.getNetPrice() * (1 - discountRate / 100);
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
public class Main {
    public static void main(String[] args) {
        Product importedProduct = new ImportedProduct("Imported Laptop", 1000.0, 50.0);
        Product discountedProduct = new DiscountedProduct("Discounted Phone", 500.0, 10.0);
        // Upcasting
        Product upcastedImportedProduct = (Product) importedProduct;
        Product upcastedDiscountedProduct = (Product) discountedProduct;
        // Downcasting
        ImportedProduct downcastedImportedProduct = (ImportedProduct) upcastedImportedProduct;
        DiscountedProduct downcastedDiscountedProduct = (DiscountedProduct) upcastedDiscountedProduct;
        importedProduct.print();
        System.out.println("Net Price: $" + importedProduct.getNetPrice());
        discountedProduct.print();
        System.out.println("Net Price: $" + discountedProduct.getNetPrice());
    }
}