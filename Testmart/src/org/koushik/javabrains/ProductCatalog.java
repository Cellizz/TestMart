package org.koushik.javabrains;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.koushik.javabrains.business.ProductServiceImpl;
import org.koushik.javabrains.model.Product;

@WebService(endpointInterface="org.koushik.javabrains.ProductCatalogInterface", portName="TestMartCatalogPort", serviceName="TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productService = new ProductServiceImpl();
	
	@Override
	@WebMethod
	public List<String> getProductCategories(){
		return productService.getProductCategories();
		
	}
	
	@Override
	@WebMethod
	public List<String> getProducts(String category){
		return productService.getProducts(category);
		
	}
	
	@Override
	@WebMethod
	public boolean addProduct(String category, String product){
		return productService.addProduct(category,product);
		
	}
	
	@Override
	@WebMethod
	public List<Product> getProductsv2(String category){
		return productService.getProductsv2(category);
		
	}
}
