
package pl.mibdbz.diabetes.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="kcal")
    private int kcal;
    
    @Column(name="carbohydrates")
    private float carbohydrates;
    
    @Column(name="protein")
    private float protein;
    
    @Column(name="fat")
    private float fat;
    
    @OneToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="product_type_id")
    private ProductType productType;
    
    
    
    
    public Product() {
        
    }

    public Product(String name, int kcal, float carbohydrates, float protein, float fat) {
        this.name = name;
        this.kcal = kcal;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
        this.fat = fat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public float getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", kcal=" + kcal + ", carbohydrates=" + carbohydrates + ", protein=" + protein + ", fat=" + fat + ", productType=" + productType + '}';
    }
    
}
