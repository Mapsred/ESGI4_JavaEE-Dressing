package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "clothe", schema = "java-ee-dressing")
public class ClotheEntity {
    private int id;
    private String sellerCode;
    private double price;
    private String size;
    private String description;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "seller_code", nullable = false, length = -1)
    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    @Basic
    @Column(name = "price", nullable = false)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "size", nullable = false)
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ClotheEntity that = (ClotheEntity) obj;

        return id == that.id &&
                sellerCode.equals(that.sellerCode) &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(size, that.size) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sellerCode, price, size, description);
    }
}
