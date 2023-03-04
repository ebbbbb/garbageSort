package cn.lxsir.uniapp.service.impl;

import cn.lxsir.uniapp.entity.User;
import cn.lxsir.uniapp.mapper.UserMapper;
import cn.lxsir.uniapp.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
