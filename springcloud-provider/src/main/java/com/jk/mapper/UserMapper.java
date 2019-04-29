package com.jk.mapper;

import com.jk.model.TreeBean;
import com.jk.model.UserBean;
import com.jk.model.Video;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 贾志涛
 * @CreateDate: 2019/4/13$ 8:49$
 * @UpdateUser: 贾志涛
 * @UpdateDate: 2019/4/13$ 8:49$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface UserMapper {
     @Select("select * from t_tree where pid=#{pid}")
    List<TreeBean> ListTree(@Param("pid") Integer pid);


    @Select("select count(1) from t_user")
    int queryVideoCount(UserBean user);
    List<UserBean> queryVideo(@Param("start") int start,@Param("rows") Integer rows,@Param("user") UserBean user);
   @Insert(" insert into t_user(username,usertypeid,user_date) values(#{username},#{usertypeid},#{createtime})")
    void saveVideo(@RequestBody UserBean video);

    @Update(" update t_user set username=#{username},usertypeid=#{usertypeid},user_date=#{createtime} where userid =#{userid}")
    void updateVideo(@RequestBody  UserBean video);

    void deleteVideo(Integer[] ids);
   @Select("select userid,username,user_date as createtime,usertypeid from t_user where userid=#{id}")
    UserBean queryVideoById(@Param("id") Integer userid);
}
