package ecommerceSystemProj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainEcommerce {
    public static void main(String[] args) {
        // Initialize products
        Product product1 = new Product("P001", "Laptop", 15008.95, 10, "Electronics");
        Product product2 = new Product("P002", "Smartphone", 17698.67, 20, "Electronics");
        Product product3 = new Product("P003", "Dell", 10570.68, 20, "Electronics");
        Product product4= new Product("P004", "Sumsung", 12507.54, 20, "Electronics");

        // Initialize users
        Admin admin = new Admin("A001", "admin", "admin123", "admin@example.com");
        Customer customer = new Customer("C001", "customer", "cust123", "customer@example.com");

        // Initialize authentication service
        
        Authentication authService = new Authentication();
        authService.register(admin);
        authService.register(customer);

        // Admin operations
        
        User loggedInAdmin = authService.login("admin", "admin123");
        if (loggedInAdmin instanceof Admin) {
            Admin adminUser = (Admin) loggedInAdmin;
            adminUser.addProduct(product1);
            adminUser.addProduct(product2);
            adminUser.addProduct(product3);
            adminUser.addProduct(product4);
            adminUser.removeProduct(product2);
            adminUser.updateProduct(product1);
        }

        authService.logout(loggedInAdmin);

        // Customer operations
        
        User loggedInCustomer = authService.login("customer", "cust123");
        if (loggedInCustomer instanceof Customer) {
            Customer customerUser = (Customer) loggedInCustomer;
            customerUser.addToCart(product1);
            customerUser.addToCart(product2);
            customerUser.checkout();
        }

        authService.logout(loggedInCustomer);

        // Order processing
        Order order = new Order("O001", "C001", new Date(), new ArrayList<>(List.of(product1, product2)));
        order.placeOrder();
        order.trackOrder();
        order.cancelOrder();
        order.trackOrder();
    }
}
