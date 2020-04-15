package com.example.model;

import java.util.Date;
import javax.persistence.*;

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 产品序号
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 好评度（1-5星）
     */
    private Integer star;

    /**
     * 审核状态
     */
    private Integer audit;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
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
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取好评度（1-5星）
     *
     * @return star - 好评度（1-5星）
     */
    public Integer getStar() {
        return star;
    }

    /**
     * 设置好评度（1-5星）
     *
     * @param star 好评度（1-5星）
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    /**
     * 获取审核状态
     *
     * @return audit - 审核状态
     */
    public Integer getAudit() {
        return audit;
    }

    /**
     * 设置审核状态
     *
     * @param audit 审核状态
     */
    public void setAudit(Integer audit) {
        this.audit = audit;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", productId=").append(productId);
        sb.append(", content=").append(content);
        sb.append(", star=").append(star);
        sb.append(", audit=").append(audit);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}