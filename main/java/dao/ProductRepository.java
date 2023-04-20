package dao;


import java.util.ArrayList;

import dto.Product;


public class ProductRepository {
	
	
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
		
	}
	
	public ProductRepository() {
		
		Product bag = new Product("B1234", "백팩", 1000);
		
		bag.setDescription("백팩");
		bag.setCategory("smart bag");
		bag.setManufacturer("가죽전문회사");
		bag.setUnitsInStock(1000);
		bag.setCondition("New");
		bag.setFilename("bag.jpg");
		
		
		Product bag02 = new Product("C0001", "luxury bag", 5000);
		bag02.setDescription("luxury bag");
		bag02.setCategory("smart bag");
		bag02.setManufacturer("가죽전문회사");
		bag02.setUnitsInStock(5000);
		bag02.setCondition("New");
		bag02.setFilename("bag2.jpg");
		
		
		listOfProducts.add(bag);
		listOfProducts.add(bag02);
		
	}
	
	
	
	
	
	public ArrayList<Product> getAllProducts() {
			return listOfProducts;
		
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		
		for(int i =0; i <listOfProducts.size(); i ++) {
			Product product = listOfProducts.get(i);
			if(product !=null && product.getProductId() !=null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	
	
	
	
	

}
