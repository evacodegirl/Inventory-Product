public class TestInventory {
    public static void main(String[] args){

        Inventory inventory = new Inventory("Gostivar","Alisa");
        Product product = new Product("alis",10,155,"water","nocalories");


        inventory.addProduct("asi",11,160,"juice","zerosugar");
        inventory.addProduct(product);
        inventory.printALlProduct();

    }
}
