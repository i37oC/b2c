package cn.xiaohuodui.b2c.leaf.product.model;

public class ProductWithBLOBs extends Product {
    private String imgs;

    private String description;

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}