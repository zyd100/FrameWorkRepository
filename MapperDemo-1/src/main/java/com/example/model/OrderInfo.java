package com.example.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "order_info")
public class OrderInfo {
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
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 合计金额
     */
    private Float price;

    /**
     * 状态（未付款0/已下单1/已寄送2/已寄到3/购物车4/收藏夹5）
     */
    private Integer status;

    /**
     * 联系人
     */
    @Column(name = "contact_name")
    private String contactName;

    /**
     * 联系电话
     */
    @Column(name = "contact_mobile")
    private String contactMobile;

    /**
     * 寄送地址
     */
    @Column(name = "contact_address")
    private String contactAddress;

    /**
     * 备注
     */
    private String message;

    /**
     * 创建时间
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
     * 获取合计金额
     *
     * @return price - 合计金额
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置合计金额
     *
     * @param price 合计金额
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 获取状态（未付款0/已下单1/已寄送2/已寄到3/购物车4/收藏夹5）
     *
     * @return status - 状态（未付款0/已下单1/已寄送2/已寄到3/购物车4/收藏夹5）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（未付款0/已下单1/已寄送2/已寄到3/购物车4/收藏夹5）
     *
     * @param status 状态（未付款0/已下单1/已寄送2/已寄到3/购物车4/收藏夹5）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取联系人
     *
     * @return contact_name - 联系人
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人
     *
     * @param contactName 联系人
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * 获取联系电话
     *
     * @return contact_mobile - 联系电话
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * 设置联系电话
     *
     * @param contactMobile 联系电话
     */
    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    /**
     * 获取寄送地址
     *
     * @return contact_address - 寄送地址
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * 设置寄送地址
     *
     * @param contactAddress 寄送地址
     */
    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    /**
     * 获取备注
     *
     * @return message - 备注
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置备注
     *
     * @param message 备注
     */
    public void setMessage(String message) {
        this.message = message;
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
        sb.append(", orderNum=").append(orderNum);
        sb.append(", userName=").append(userName);
        sb.append(", price=").append(price);
        sb.append(", status=").append(status);
        sb.append(", contactName=").append(contactName);
        sb.append(", contactMobile=").append(contactMobile);
        sb.append(", contactAddress=").append(contactAddress);
        sb.append(", message=").append(message);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}