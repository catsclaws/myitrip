package cn.itrip.service;

import cn.itrip.beans.pojo.User;
import cn.itrip.common.Page;

/**
 * 用户的业务逻辑服务接口
 */
public interface UserService {

    /**
     * 分页查询用户
     * @param pageIndex
     * @param userName
     * @return
     */
    Page<User> getPagedUsers(int pageIndex,String userName);

}
