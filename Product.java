public class Product {
    String name;
    private int id;
    int price;
    String type;
    String description;


    public Product(String name,int id,int price,String type,String description) {
        this.name=name;
        this.id = id;
        this.price=price;
        this.type=type;
        this.description=description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }
}
