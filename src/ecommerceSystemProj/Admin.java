package ecommerceSystemProj;

class Admin extends User 
{

    public Admin(String userId, String username, String password, String email) 
    {
        super(userId, username, password, email);
    }

   

	public void addProduct(Product product) {
        System.out.println("Product " + product.getProductName() + " added.");
    }

    public void removeProduct(Product product) {
        System.out.println("Product " + product.getProductName() + " removed.");
    }

    public void updateProduct(Product product) {
        System.out.println("Product " + product.getProductName() + " updated.");
    }

    @Override
    public void viewProfile() {
        System.out.println("Admin Profile: " + getUsername() + ", Email: " + getEmail());
    }

    @Override
    public void updateProfile(String email) {
        setEmail(email);
        System.out.println("Admin email updated to " + email);
    }

	private void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateProfile() {
		// TODO Auto-generated method stub
		
	}
}


