package ecommerceSystemProj;

import java.util.ArrayList;
import java.util.List;

class Customer extends User {
    private List<Product> cart;

    public Customer(String userId, String username, String password, String email) {
        super(userId, username, password, email);
        this.cart = new ArrayList<>();
    }

    public void addToCart(Product product) {
        cart.add(product);
        System.out.println(product.getProductName() + " added to cart.");
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
        System.out.println(product.getProductName() + " removed from cart.");
    }

    public void checkout() {
        System.out.println("Checking out...");
        // Implementation of checkout process
    }

    @Override
    public void viewProfile() {
        System.out.println("Customer Profile: " + getUsername() + ", Email: " + getEmail());
    }

    @Override
    public void updateProfile(String email) {
        setEmail(email);
        System.out.println("Customer email updated to " + email);
    }

	private void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProfile() {
		// TODO Auto-generated method stub
		
	}
}




