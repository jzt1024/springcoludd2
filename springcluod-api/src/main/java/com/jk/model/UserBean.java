package com.jk.model;

import java.io.Serializable;

/**
 * @Description: java类作用描述
 * @Author: 贾志涛
 * @CreateDate: 2019/4/12$ 22:18$
 * @UpdateUser: 贾志涛
 * @UpdateDate: 2019/4/12$ 22:18$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class UserBean implements Serializable {

    private static final long serialVersionUID = -6670640310551713010L;
     private Integer userid;
     private String username;
     private Integer usertypeid;
     private String createtime;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUsertypeid() {
        return usertypeid;
    }

    public void setUsertypeid(Integer usertypeid) {
        this.usertypeid = usertypeid;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", usertypeid=" + usertypeid +
                ", createtime='" + createtime + '\'' +
                '}';
    }
}
