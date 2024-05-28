package com.zerboink.mayuan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zerboink.mayuan.model.domain.Team;
import com.zerboink.mayuan.model.domain.User;
import com.zerboink.mayuan.model.dto.TeamQuery;
import com.zerboink.mayuan.model.request.TeamJoinRequest;
import com.zerboink.mayuan.model.request.TeamQuitRequest;
import com.zerboink.mayuan.model.request.TeamUpdateRequest;
import com.zerboink.mayuan.model.vo.TeamUserVO;

import java.util.List;

/**
 * 队伍服务
 */
public interface TeamService extends IService<Team> {

    /**
     * 创建队伍
     *
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

    /**
     * 搜索队伍
     *
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 更新队伍
     *
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 加入队伍
     *
     * @param teamJoinRequest
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     *
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    // [加入学习圈](https://t.zsxq.com/0emozsIJh) 从 0 到 1 项目实战，经验拉满！10+ 原创项目手把手教程、1000+ 项目经验笔记、7 日项目提升训练营、60+ 编程经验分享直播

    /**
     * 删除（解散）队伍
     *
     * @param id
     * @param loginUser
     * @return
     */
    boolean deleteTeam(long id, User loginUser);
}
