package com.example.model;

import java.util.Date;
import javax.persistence.*;

public class Product {
    /**
     * 序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 产品名
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 产品概述
     */
    private String explain;

    /**
     * 类别序号
     */
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 店内价格
     */
    @Column(name = "shop_price")
    private Float shopPrice;

    /**
     * 市场价格
     */
    private Float price;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 图片
     */
    private String image;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建者用户名
     */
    @Column(name = "create_user_name")
    private String createUserName;

    /**
     * 更新者用户名
     */
    @Column(name = "update_user_name")
    private String updateUserName;

    /**
     * 获取序号
     *
     * @return id - 序号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置序号
     *
     * @param id 序号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取产品名
     *
     * @return product_name - 产品名
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名
     *
     * @param productName 产品名
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取产品概述
     *
     * @return explain - 产品概述
     */
    public String getExplain() {
        return explain;
    }

    /**
     * 设置产品概述
     *
     * @param explain 产品概述
     */
    public void setExplain(String explain) {
        this.explain = explain;
    }

    /**
     * 获取类别序号
     *
     * @return category_id - 类别序号
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置类别序号
     *
     * @param categoryId 类别序号
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取店内价格
     *
     * @return shop_price - 店内价格
     */
    public Float getShopPrice() {
        return shopPrice;
    }

    /**
     * 设置店内价格
     *
     * @param shopPrice 店内价格
     */
    public void setShopPrice(Float shopPrice) {
        this.shopPrice = shopPrice;
    }

    /**
     * 获取市场价格
     *
     * @return price - 市场价格
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置市场价格
     *
     * @param price 市场价格
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 获取数量
     *
     * @return quantity - 数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置数量
     *
     * @param quantity 数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取图片
     *
     * @return image - 图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置图片
     *
     * @param image 图片
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建者用户名
     *
     * @return create_user_name - 创建者用户名
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 设置创建者用户名
     *
     * @param createUserName 创建者用户名
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    /**
     * 获取更新者用户名
     *
     * @return update_user_name - 更新者用户名
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 设置更新者用户名
     *
     * @param updateUserName 更新者用户名
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productName=").append(productName);
        sb.append(", explain=").append(explain);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", shopPrice=").append(shopPrice);
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append(", image=").append(image);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUserName=").append(createUserName);
        sb.append(", updateUserName=").append(updateUserName);
        sb.append("]");
        return sb.toString();
    }
}