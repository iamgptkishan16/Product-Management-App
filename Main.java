import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductService service = new ProductService();
		
		//Product p = new Product("Xiaomi Notebook Pro", "Laptop", "Laptop Bag", 2023);
		//service.addProduct(p);
		//Instead of creating a reference and then a object as in above lines, we can simply create an object
		// and pass it in service.addProduct();
		service.addProduct(new Product("Xiaomi Notebook Pro", "Laptop", "Laptop Bag", 2023));
		service.addProduct(new Product("VIVO20", "Mobile", "Table2", 2024));
		service.addProduct(new Product("logitech Mouse", "Mouse", "Kittu's Room Drawer", 2022));
		service.addProduct(new Product("Samsung M16", "Mobile", "Microwave", 2028));
		service.addProduct(new Product("MI TV", "TV2", "Master Bed Room", 2025));
		service.addProduct(new Product("LG TV", "TV1", "Hall", 2024));
		service.addProduct(new Product("SRS-XB23", "Bluetooth Speaker", "Hall TV Cabinet", 2029));
		service.addProduct(new Product("Camera", "Kid's Camera", "Office Cabinet", 2022));
		service.addProduct(new Product("Dell", "Laptop", "Drawer", 2021));
		service.addProduct(new Product("Juice Maker", "Mixer", "Kitchen", 2026));
		service.addProduct(new Product("Samsung Microwave", "Microwave", "Kitchen", 2027));
		service.addProduct(new Product("Samsung Refrigrator", "Refrigrator", "Kitchen", 2027));
		service.addProduct(new Product("Canon", "Camera", "Drawer Main", 2028));
		
		//For getting all Products
		/* List<Product> products = service.getAllProducts();
		for(Product p : products) {
			System.out.println(p);
		} */
		
		
		//For getting a Particular Product
		/*System.out.println("==================================");
		System.out.println("A Particular Product");
		Product p = service.getProduct("Camera");
		System.out.println(p);*/
		
		
		//For getting Product with text
		System.out.println("=================================");
		List<Product> prods = service.getProductWithText("Room");
		for(Product product : prods) {
			System.out.println(product);
		}
		
		//For getting Product by Place
		System.out.println("=========================");
		List<Product> prod1 = service.getProductByPlace("laptop bag");
		for(Product pro : prod1) {
			System.out.println(pro);
		}
		
		
		//Product which are out of warranty
		System.out.println("============================");
		List<Product> prod2 = service.outOfWarranty();
		for(Product pro1 : prod2) {
			System.out.println(pro1);
		}

	}
	

}
