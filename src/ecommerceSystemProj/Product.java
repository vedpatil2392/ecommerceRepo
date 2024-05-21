package ecommerceSystemProj;

class Product {
    private String productId;
    private String productName;
    private double price;
    private int quantity;
    private String category;

    public Product(String productId, String productName, double price, int quantity, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void getProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price + ", Quantity: " + quantity + ", Category: " + category);
    }

    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }
}











