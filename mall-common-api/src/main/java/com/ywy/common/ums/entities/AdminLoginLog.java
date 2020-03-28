package com.ywy.common.ums.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 后台用户登录日志表
 * </p>
 *
 * @author ywy
 * @since 2020-03-26
 */
@TableName("ums_admin_login_log")
public class AdminLoginLog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long adminId;

    private LocalDateTime createTime;

    private String ip;

    private String address;

    /**
     * 浏览器登录类型
     */
    private String userAgent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public String toString() {
        return "AdminLoginLog{" +
        "id=" + id +
        ", adminId=" + adminId +
        ", createTime=" + createTime +
        ", ip=" + ip +
        ", address=" + address +
        ", userAgent=" + userAgent +
        "}";
    }
}
