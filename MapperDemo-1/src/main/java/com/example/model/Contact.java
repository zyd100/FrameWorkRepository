package com.example.model;

import javax.persistence.*;

public class Contact {
    /**
     * 序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

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
     * 默认地址0/其他地址1
     */
    private Integer status;

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
     * 获取默认地址0/其他地址1
     *
     * @return status - 默认地址0/其他地址1
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置默认地址0/其他地址1
     *
     * @param status 默认地址0/其他地址1
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", contactName=").append(contactName);
        sb.append(", contactMobile=").append(contactMobile);
        sb.append(", contactAddress=").append(contactAddress);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}