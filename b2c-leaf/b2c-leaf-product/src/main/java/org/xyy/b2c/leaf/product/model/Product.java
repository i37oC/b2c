package org.xyy.b2c.leaf.product.model;

public class Product {
    private String id;

    private String name;

    private String intro;

    private String productNum;

    private String models;

    private String brand;

    private Integer cateId1;

    private Integer cateId2;

    private Integer cateId3;

    private Long priceMin;

    private Long priceMax;

    private String cover;

    private Boolean status;

    private Long created;

    private Long updated;

    private Boolean deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum == null ? null : productNum.trim();
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models == null ? null : models.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Integer getCateId1() {
        return cateId1;
    }

    public void setCateId1(Integer cateId1) {
        this.cateId1 = cateId1;
    }

    public Integer getCateId2() {
        return cateId2;
    }

    public void setCateId2(Integer cateId2) {
        this.cateId2 = cateId2;
    }

    public Integer getCateId3() {
        return cateId3;
    }

    public void setCateId3(Integer cateId3) {
        this.cateId3 = cateId3;
    }

    public Long getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(Long priceMin) {
        this.priceMin = priceMin;
    }

    public Long getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(Long priceMax) {
        this.priceMax = priceMax;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}