package org.koushik.javabrains.business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.koushik.javabrains.model.Product;
import org.koushik.javabrains.model.ProductJPAOperations;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();
	
	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("Joyland");
		bookList.add("The Game of Thrones");
		
		musicList.add("Random Access Memories");
		musicList.add("Night Visions");
		musicList.add("Unorthodox Jukebox");
		
		movieList.add("Oz the Great and Powerful");
		movieList.add("Despicable Me");
		movieList.add("Star Trek Into Darkness");
		
	}
	
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
		
	}
	
	public List<String> getProducts(String category){
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
				}
		
		return null;
		
	}
	
	
	public boolean addProduct(String category, String product){
		
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
				}
		
		return true;
		
	}
	
	public List<Product> getProductsv2(String category){
		ProductJPAOperations  pjpa = new ProductJPAOperations();
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("New book", "1234", 5.99));
		productList.add(new Product("Other book", "ABC", 15.99));
//		for (Iterator iterator = productList.iterator(); iterator.hasNext();) {
//			pjpa.save((Product) iterator.next());
//			
//		}
		pjpa.save(new Product("New book", "1234", 5.99));
		return productList;
		
	}
}
