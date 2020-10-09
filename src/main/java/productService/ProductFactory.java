package productService;

public class ProductFactory {

    public Product createProduct(ProductsType type){
        ProductBuilder productBuilder = new ProductBuilder();
        Product product = new Product();

        switch (type){
            case VEGETABLE:
                product =  productBuilder
                        .setName("Tomato")
                        .setType("Vegetable")
                        .setCost(10)
                        .buildProduct();
                break;
            case MEAT:
                product = productBuilder
                        .setName("Pork")
                        .setType("Meat")
                        .setCost(30)
                        .buildProduct();
                break;
            case DAIRY:
                product = productBuilder
                        .setName("Milk")
                        .setType("Dairy")
                        .setCost(5)
                        .buildProduct();
                break;
        }
        return product;

    }
}
