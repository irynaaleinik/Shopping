package productService;

public class ProductBuilder {
    private String name;
    private ProductsType type;
    private int cost;

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setType(ProductsType type) {
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
