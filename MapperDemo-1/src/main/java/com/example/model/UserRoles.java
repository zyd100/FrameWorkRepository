package com.example.model;

import javax.persistence.*;

@Table(name = "user_roles")
public class UserRoles {
    /**
     * 序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 权限名
     */
    private String role;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

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
     * 获取权限名
     *
     * @return role - 权限名
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置权限名
     *
     * @param role 权限名
     */
    public void setRole(String role) {
        this.role = role;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", role=").append(role);
        sb.append(", userName=").append(userName);
        sb.append("]");
        return sb.toString();
    }
}