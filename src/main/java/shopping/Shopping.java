package shopping;

import productService.ProductFactory;

import static productService.ProductsType.MEAT;

public class Shopping {

    public static void main(String[] args){
        ProductFactory productFactory = new ProductFactory();
        System.out.println(productFactory.createProduct(MEAT, "Chicken", 10));
    }
}
