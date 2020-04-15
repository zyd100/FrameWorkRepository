package com.example.model;

import javax.persistence.*;

@Table(name = "product_image")
public class ProductImage {
    /**
     * 序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 产品序号
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 图片名字
     */
    private String image;

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
     * 获取图片名字
     *
     * @return image - 图片名字
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置图片名字
     *
     * @param image 图片名字
     */
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", image=").append(image);
        sb.append("]");
        return sb.toString();
    }
}