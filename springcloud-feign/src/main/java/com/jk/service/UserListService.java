package com.jk.service;
import com.jk.util.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Description: java类作用描述
 * @Author: 贾志涛
 * @CreateDate: 2019/4/12$ 22:59$
 * @UpdateUser: 贾志涛
 * @UpdateDate: 2019/4/12$ 22:59$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@FeignClient(value = "SERVICE-USER",fallback = SchedualServiceHiHystric.class)
public interface UserListService extends UserService {
}
