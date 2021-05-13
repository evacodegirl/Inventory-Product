import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products = new ArrayList<>();
    private String location;
    private String name;

    public Inventory(String location, String name) {
        this.location = location;
        this.name = name;
    }

    public void addProduct(String name, int id, int price, String type, String description) {
        Product product = new Product(name, id, price, type, description);
        products.add(product);
    }

    public void addProduct(final Product product) {

        products.add(product);
    }

    public void printALlProduct() {
        for (Product element : products) {
            System.out.println(element);
        }

    }
    public void deleteProduct(int id) {
        for(Product product : products) {
            if (product.getId() == id) {
                products.remove(product);

            }
        }

    }
    public void updateProduct(Product product){
        for(Product item : products){
            if(item.getId() == product.getId()){
                item.name = product.name;
                item.price = product.price;
                item.type = product.type;
                item.description = product.description;
            }
        }
    }
}

