package javaPro.homework_210823.homework_20_11_2023.orderManagementSystem;

//Товар (Product)
//Поля: название, цена, количество на складе.
//Методы: проверка наличия, обновление количества на складе.
public class Product {
    private String productName;
    private double price;
    private static double productCount;

    public Product(String productName, double price, double productCount) {
        this.productName = productName;
        this.price = price;
        this.productCount = productCount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getProductCount() {
        return productCount;
    }

    public void setProductCount(double productCount) {
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", productCount=" + productCount +
                '}';
    }

    public static boolean updateStock(double quantityToReduce) {
        if (quantityToReduce > 0 && quantityToReduce <= productCount) {
            productCount -= quantityToReduce;
            return true;
        }
        return false;
    }

    public static boolean isProductAvailable(String productName, Product[] productList) {
        for (Product product : productList) {
            if (product.getProductName().equals(productName) && product.getProductCount() > 0) {
                return true;
            }
        }
        return false;
    }

}


