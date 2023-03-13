package DTO;

public class Vegetable {
    private int vegetableId;
    private int categoryId;
    private String vegetableName;
    private String unit;
    private int amount;
    private String image;
    private float price;
    
    public Vegetable(int vegetableId, int categoryId, String vegetableName, String unit, int amount, String image, float price) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getVegetableId() {
        return vegetableId;
    }

    public void setVegetableId(int vegetableId) {
        this.vegetableId = vegetableId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vegetable{" + "vegetableId=" + vegetableId + ", categoryId=" + categoryId + ", vegetableName=" + vegetableName + ", unit=" + unit + ", amount=" + amount + ", image=" + image + ", price=" + price + '}';
    }
}
