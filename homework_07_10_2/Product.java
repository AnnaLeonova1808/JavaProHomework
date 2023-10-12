package javaPro.homework_07_10_2;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Product {
    private int productId;
    private String productName;
    private String productCategory;
    private double productPrice;
    private double productStock;
    private String productReviews;

    public Product(int productId, String productName, String productCategory, double productPrice, double productStock, String productReviews) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productReviews = productReviews;
    }
    @Override
    public String toString() {
        return "Product_2{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productPrice=" + productPrice +
                ", productStock=" + productStock +
                ", productReviews='" + productReviews + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product2)) return false;
        return productId == product2.productId && Objects.equals(productName, product2.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName);
    }

    public double getProductPrice() {

        return productPrice;
    }
    public String getProductName() {

        return productName;
    }
}
