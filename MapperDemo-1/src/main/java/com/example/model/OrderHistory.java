package com.example.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "order_history")
public class OrderHistory {
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
     * 更新者
     */
    @Column(name = "update_user_name")
    private String updateUserName;

    /**
     * 状态（未付款0/已下单1/已寄送2/已寄到3/购物车4）
     */
    private Integer status;

    /**
     * 订单创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取更新者
     *
     * @return update_user_name - 更新者
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 设置更新者
     *
     * @param updateUserName 更新者
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    /**
     * 获取状态（未付款0/已下单1/已寄送2/已寄到3/购物车4）
     *
     * @return status - 状态（未付款0/已下单1/已寄送2/已寄到3/购物车4）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（未付款0/已下单1/已寄送2/已寄到3/购物车4）
     *
     * @param status 状态（未付款0/已下单1/已寄送2/已寄到3/购物车4）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取订单创建时间
     *
     * @return create_time - 订单创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单创建时间
     *
     * @param createTime 订单创建时间
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
        sb.append(", orderNum=").append(orderNum);
        sb.append(", updateUserName=").append(updateUserName);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}