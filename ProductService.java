import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ProductService {
	List<Product> products = new ArrayList<>();
	public void addProduct(Product p) {
		products.add(p);
	}
	//For getting all the products
	public List<Product> getAllProducts(){
		return products;
	}
	public Product getProduct(String name) {
		for(Product p : products) {
			if(p.getName().equals(name)) 
				return p;
			}
		return null;
	}
	
	
	
	//Product with text
	public List<Product> getProductWithText(String text){
		//String str = text.toLowerCase();
		//List<Product> prods = new ArrayList<>();
		//for(Product p : products) {
		//	String name = p.getName().toLowerCase();
		//	String type = p.getType().toLowerCase();
		//	String place = p.getPlace().toLowerCase();
		//	if(name.contains(str) || type.contains(str) || place.contains(str)) {
		//		prods.add(p);
		//	}
	//	}
		//return prods;
		
		//USING STREAM API
		return products.stream().filter(p->p.getPlace().toLowerCase().contains(text.toLowerCase())||p.getType().toLowerCase().contains(text.toLowerCase())||p.getName().toLowerCase().contains(text.toLowerCase())).collect(Collectors.toList());
		
	}
	
	
	//Product by Place
	public List<Product> getProductByPlace(String placeName){
		///String str1 = placeName.toLowerCase();
	//	List<Product> prods1 = new ArrayList<>();
		//for(Product p : products) {
			//String place = p.getPlace().toLowerCase();
		//	if(place.equals(str1)) {
		//		prods1.add(p);
		//	}
		//}
		//return prods1;
		
		//USING STREAM API
		return  products.stream().filter(p->p.getPlace().toLowerCase().equals(placeName.toLowerCase())).collect(Collectors.toList());

	}
	
	//Products which are out of warranty
	public List<Product> outOfWarranty(){
		//List<Product> outProd = new ArrayList();
		//for(Product p : products) {
			//if(p.getWarranty()<2023) {
			//	outProd.add(p);
		//	}
		//}
		//return outProd;
		
		//USING STREAM API
		return  products.stream().filter(p->p.getWarranty()<2023).collect(Collectors.toList());
	}
	

}
