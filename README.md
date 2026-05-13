# Alaya大学选课系统 - 第XX组

## 项目简介
基于 Spring Boot 的在线选课系统，支持学生选课退课、教师管理课程和成绩。

## 小组成员

| 学号 | 姓名 | GitHub 用户名 | 角色 |
|------|------|--------------|------|
|20252091340204|wuxinhui | ww911-max| 组长 |
|20252091340215 | xuyifei| x1875| 组员 |
| 20252091340214|guobingxin | Eisherz| 组员 |


## 技术栈
- Java 17, Spring Boot 3.2+, Gradle
- H2 文件数据库, Spring Data JPA, Thymeleaf
- Spring Security

## 快速启动
```bash
./gradlew bootRun
``` {data-source-line="277"}
启动后访问 `http://localhost:8080`

## H2 数据库控制台
- 地址：`http://localhost:8080/h2-console`
- JDBC URL：`jdbc:h2:file:./data/coursedb`
- 用户名：`sa`，密码留空

## 项目文档
- [迭代0：项目初始化与需求理解](docs/iteration-0/)
- [团队AI协作规则](docs/team/ai-rules.md)