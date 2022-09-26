package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		
		Product product = new Product(1, "Laptop", "ASUS", 5000, 3, "Yeşil");
		
//		Product product = new Product();
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("ASUS");
//		product.setPrice(5000);
//		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		
		
		productManager.Add(product);

		System.out.println("Ürünün kodu : "+product.getKod());
	}

}
