package productService;

class Product {

    private String name;
    private String type;
    private int cost;

    void setName(String name) {
        this.name = name;
    }

    void setType(String type) {
        this.type = type;
    }

    void setCost(int cost) {
        this.cost = cost;
    }

    String getName() {
        return name;
    }

    String getType() {
        return type;
    }

    int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product " + name + ", type " + type + " for " + cost + " EUR is ready for you!";
    }
}
