package com.simon.quick.facade.entity;

import java.io.Serializable;

public class User  implements Serializable {
    /**  
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;

	private Integer uid;

    private String userName;

    private String email;

    private String mobile;

    private String telephone;

    private String realName;

    private String password;

    private Byte userStatus;

    private String avatarFile;

    private Byte sex;

    private Integer birthday;

    private Integer regTime;

    private String regIp;

    private Integer userType;

    private Integer lastLogin;

    private String lastIp;

    private Integer onlineTime;

    private Integer lastActive;

    private Integer notificationUnread;

    private Integer noticeUnread;

    private Short groupId;

    private Byte forbidden;

    private Boolean adminApply;

    private String salt;

    private Integer stFlag;

    private Byte background;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public String getAvatarFile() {
        return avatarFile;
    }

    public void setAvatarFile(String avatarFile) {
        this.avatarFile = avatarFile == null ? null : avatarFile.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public Integer getRegTime() {
        return regTime;
    }

    public void setRegTime(Integer regTime) {
        this.regTime = regTime;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Integer lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public Integer getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Integer onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Integer getLastActive() {
        return lastActive;
    }

    public void setLastActive(Integer lastActive) {
        this.lastActive = lastActive;
    }

    public Integer getNotificationUnread() {
        return notificationUnread;
    }

    public void setNotificationUnread(Integer notificationUnread) {
        this.notificationUnread = notificationUnread;
    }

    public Integer getNoticeUnread() {
        return noticeUnread;
    }

    public void setNoticeUnread(Integer noticeUnread) {
        this.noticeUnread = noticeUnread;
    }

    public Short getGroupId() {
        return groupId;
    }

    public void setGroupId(Short groupId) {
        this.groupId = groupId;
    }

    public Byte getForbidden() {
        return forbidden;
    }

    public void setForbidden(Byte forbidden) {
        this.forbidden = forbidden;
    }

    public Boolean getAdminApply() {
        return adminApply;
    }

    public void setAdminApply(Boolean adminApply) {
        this.adminApply = adminApply;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getStFlag() {
        return stFlag;
    }

    public void setStFlag(Integer stFlag) {
        this.stFlag = stFlag;
    }

    public Byte getBackground() {
        return background;
    }

    public void setBackground(Byte background) {
        this.background = background;
    }
}