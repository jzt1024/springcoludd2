package com.jk.model;

import sun.reflect.generics.tree.Tree;

import java.beans.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 贾志涛
 * @CreateDate: 2019/4/12$ 22:21$
 * @UpdateUser: 贾志涛
 * @UpdateDate: 2019/4/12$ 22:21$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class TreeBean implements Serializable {

    private static final long serialVersionUID = -6670640310551713010L;
private Integer id;
private String text;
private String href;
private Integer pid;
    private List<TreeBean> nodes;
    private Boolean selectable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<TreeBean> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeBean> nodes) {
        this.nodes = nodes;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    @Override
    public String toString() {
        return "TreeBean{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", href='" + href + '\'' +
                ", pid=" + pid +
                ", nodes=" + nodes +
                ", selectable=" + selectable +
                '}';
    }
}
