
## 📢 项目简介

基于 JDK 21、 Boot 4、Spring Security、JWT、Redis、MyBatis-Plus、Vue 3、Element Plus 构建的前后端分离权限管理系统。


**核心特性**

- **🚀 技术栈**：Spring Boot 4 + Vue 3 + Element Plus，持续跟进最新版本

- **🔐 安全认证**：Spring Security + JWT 无状态认证 + Redis 会话管理，支持令牌自动续期和多端互斥

- **🔑 权限控制**：RBAC 模型，接口级 + 按钮级细粒度权限

- **🛠️ 功能模块**：用户、角色、菜单、部门、字典管理等基础模块



## 📚 项目文档

| 文档 | 地址 |
|------|------|
| 在线接口文档 | [Apifox](https://www.apifox.cn/apidoc/shared-195e783f-4d85-4235-a038-eec696de4ea5) |
| 功能详解 | [https://www.youlai.tech/docs/admin/backend/java/](https://www.youlai.tech/docs/admin/backend/java/) |
| 开发规范 | [https://www.youlai.tech/docs/admin/backend/java/dev-standards.html](https://www.youlai.tech/docs/admin/backend/java/dev-standards.html) |

## 📁 项目目录

```
youlai-boot
├── docker/                              # Docker 部署
├── sql/                                 # 数据库脚本
│   └── mysql/                           # MySQL 初始化脚本
├── src/main/java/com/youlai/boot/
│   ├── auth/                            # 认证模块
│   ├── common/                          # 公共模块
│   │   ├── annotation/                  # 自定义注解
│   │   ├── base/                        # 基础类
│   │   ├── constant/                    # 常量定义
│   │   ├── enums/                       # 枚举类型
│   │   ├── model/                       # 公共模型
│   │   └── util/                        # 工具类
│   ├── config/                          # 配置模块
│   │   └── property/                    # 配置属性
│   ├── core/                            # 核心模块
│   │   ├── aspect/                      # AOP 切面（日志、防重）
│   │   ├── exception/                   # 全局异常处理
│   │   ├── filter/                      # 过滤器（日志、限流）
│   │   ├── validator/                   # 参数校验
│   │   └── web/                         # 响应封装
│   ├── file/                            # 文件服务
│   ├── plugin/                          # 插件扩展
│   │   ├── knife4j/                     # 接口文档增强
│   │   └── mybatis/                     # MyBatis 扩展
│   ├── security/                        # 安全模块
│   │   ├── exception/                   # 安全异常
│   │   ├── filter/                      # 安全过滤器
│   │   ├── handler/                     # 安全处理器
│   │   ├── model/                       # 安全模型
│   │   ├── provider/                    # 认证提供者
│   │   ├── service/                     # 安全服务
│   │   ├── token/                       # Token 管理
│   │   └── util/                        # 安全工具
│   ├── support/                         # 支撑服务
│   │   ├── mail/                        # 邮件服务
│   │   ├── sms/                         # 短信服务
│   │   └── websocket/                   # WebSocket 服务
│   ├── system/                          # 系统模块
│   │   ├── controller/                  # 控制器
│   │   ├── converter/                   # 对象转换器
│   │   ├── enums/                       # 枚举定义
│   │   ├── handler/                     # 业务处理器
│   │   ├── listener/                    # 事件监听器
│   │   ├── mapper/                      # 数据访问层
│   │   ├── model/                       # 数据模型
│   │   │   ├── bo/                      # 业务对象
│   │   │   ├── dto/                     # 传输对象
│   │   │   ├── entity/                  # 实体对象
│   │   │   ├── form/                    # 表单对象
│   │   │   ├── query/                   # 查询对象
│   │   │   └── vo/                      # 视图对象
│   │   └── service/                     # 业务逻辑层
│   ├── tool/                            # 工具模块
│   │   └── codegen/                     # 代码生成器
│   └── BbfwApplication.java       # 启动类
└── pom.xml                              # Maven 配置
```

## 🚀 快速开始

**详细文档**：[项目启动指南](https://youlai.blog.csdn.net/article/details/145177011)

### 1. 克隆项目

```bash
git clone https://gitee.com/youlaiorg/youlai-boot.git
```

### 2. 初始化数据库

执行 [youlai_admin.sql](sql/mysql/youlai_admin.sql) 创建数据库、表结构和基础数据。

### 3. 修改配置

本地开发需修改 [application-dev.yml](src/main/resources/application-dev.yml) 中的 MySQL 和 Redis 连接信息。

> 默认连接线上环境（仅读权限），仅供体验使用。

### 4. 启动项目

运行 [BbfwApplication.java](src/main/java/com/bbfw/BbfwApplication.java)，访问 [http://localhost:8000/doc.html](http://localhost:8000/doc.html) 验证。

## 🐳 Docker 部署

**详细文档**：[部署指南](https://www.youlai.tech/docs/admin/backend/java/deploy.html)

```bash
cd docker
docker-compose up -d
```

## ✅ 项目统计

![](https://repobeats.axiom.co/api/embed/544c5c0b5b3611a6c4d5ef0faa243a9066b89659.svg)

## 🤝 贡献者

[![](https://contrib.rocks/image?repo=haoxianrui/youlai-boot)](https://github.com/haoxianrui/youlai-boot/graphs/contributors)







