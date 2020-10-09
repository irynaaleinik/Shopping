package productService;

public class ProductBuilder {
    private String name;
    private String type;
    private int cost;

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public ProductBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public Product buildProduct(){
        Product product = new Product();
        product.setName(name);
        product.setType(type);
        product.setCost(cost);
        return product;
    }
}
