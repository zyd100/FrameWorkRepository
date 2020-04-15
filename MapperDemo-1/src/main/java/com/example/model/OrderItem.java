package com.example.model;

import javax.persistence.*;

@Table(name = "order_item")
public class OrderItem {
    /**
     * 序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 订单编号
     */
    @Column(name = "order_num")
    private String orderNum;

    /**
     * 购买人
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 产品序号
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 产品名
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 单价
     */
    private Float price;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 获取序号
     *
     * @return id - 序号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置序号
     *
     * @param id 序号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单编号
     *
     * @return order_num - 订单编号
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * 设置订单编号
     *
     * @param orderNum 订单编号
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取购买人
     *
     * @return user_name - 购买人
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置购买人
     *
     * @param userName 购买人
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取产品序号
     *
     * @return product_id - 产品序号
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置产品序号
     *
     * @param productId 产品序号
     */
    public void setProductId(Long productId) {
        this.productId = productId;
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
     * 获取单价
     *
     * @return price - 单价
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置单价
     *
     * @param price 单价
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", userName=").append(userName);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append("]");
        return sb.toString();
    }
}