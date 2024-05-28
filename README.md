**# 码缘伙伴匹配系统
## 一、功能介绍
- 功能介绍：基于Spring Boot后端的单体项目，包括用户注册、登陆、更新个人信息、按标签搜索用户、建房组队、推荐相似用户等功能。

1. 用户登陆
 
![login.png](doc%2Flogin.png)


2. 主页

![zhuyi.png](doc%2Fzhuyi.png)

3. 根据标签搜索用户

![searchBytags.png](doc%2FsearchBytags.png)

4. 组队

![make_team.png](doc%2Fmake_team.png)


5. 创建队伍

![make_team.png](doc%2Fmake_team.png)



## 二、后端技术栈

- Java SpringBoot 2.7.x 框架
- MySQL 数据库
- MyBatis-Plus
- MyBatis X 自动生成
- Redis 缓存（Spring Data Redis 等多种实现方式）
- Redisson 分布式锁
- Easy Excel 数据导入
- Spring Scheduler 定时任务
- Swagger + Knife4j 接口文档
- Gson：JSON 序列化库
- 相似度匹配算法


## 三、基于Swagger + Knife4j 接口文档调试
1. 接口文档主页
![Interface_documentation.png](doc%2FInterface_documentation.png)


2. 通过标签搜索用户
![searchUsersBytags.png](doc%2FsearchUsersBytags.png)


3. 根据相似度匹配用户
![matchUser.png](doc%2FmatchUser.png)


4. 列举所有队伍
![listteams.png](doc%2Flistteams.png)


5. 加入队伍
![jointeam.png](doc%2Fjointeam.png)



## 四、说明
1. 本项目来自程序员鱼皮的知识星球项目分享，前端项目代码来自于鱼皮，若有同学感兴趣，可通过下面二维码进行关注
