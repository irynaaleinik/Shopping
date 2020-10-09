package productService;

public class ProductFactory {

    public static Product createProduct(ProductsType type, String name, int cost){
        ProductBuilder productBuilder = new ProductBuilder();
        Product product = new Product();
        product =  productBuilder
                .setName(name)
                .setType(type)
                .setCost(cost)
                .buildProduct();

        return product;

    }
}
