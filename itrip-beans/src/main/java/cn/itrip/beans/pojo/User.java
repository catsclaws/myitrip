package cn.itrip.beans.pojo;

import java.io.Serializable;

/**
 * 用户
 */
public class User implements Serializable {
	//用户id
    private int id; 
	//用户名
    private String userName;
    private String userCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}
