package com.zerboink.mayuan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zerboink.mayuan.service.UserTeamService;
import com.zerboink.mayuan.model.domain.UserTeam;
import com.zerboink.mayuan.mapper.UserTeamMapper;
import org.springframework.stereotype.Service;

/**
 * 用户队伍服务实现类
 */
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
        implements UserTeamService {

}




