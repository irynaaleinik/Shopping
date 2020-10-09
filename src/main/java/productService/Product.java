package productService;

public class Product {

    private String name;
    private ProductsType type;
    private int cost;

    void setName(String name) {
        this.name = name;
    }

    void setType(ProductsType type) {
        this.type = type;
    }

    void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public ProductsType getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product " + name + ", type " + type + " for " + cost + " EUR is ready for you!";
    }
}
