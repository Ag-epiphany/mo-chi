# 表结构

## 1. user

> 用户表，保存所有的用户信息。

|       字段       |          类型          | 更多说明 |
| :--------------: | :--------------------: | :------: |
|       uid        |          INT           |   主键   |
|    user_name     |      VARCHAR(20)       |          |
|     password     |      VARCHAR(20)       |          |
|       sex        | ENUM(‘male’，‘female’) |          |
|      email       |      VARCHAR(20)       |          |
| created_datetime |        DATETIME        | 注册时间 |
|      motto       |      VARCHAR(150)      | 个性签名 |
|      point       |          INT           |   积分   |

## 2. admin

> 管理员表，维护管理员基本信息。

|       字段       |   类型   |           更多说明            |
| :--------------: | :------: | :---------------------------: |
|       aid        |   INT    |             主键              |
| created_datetime | DATETIME |    被授予管理员权限的时间     |
|   valid_until    | DATETIME |       权限被收回的时间        |
|    granted_by    |   INT    |       授予权限的人的aid       |
|    revoked_by    |   INT    | 记录撤销该管理员权限的人的aid |

## 3. role

|      字段      |                             类型                             |                更多说明                |
| :------------: | :----------------------------------------------------------: | :------------------------------------: |
|      rid       |                             INT                              |                  主键                  |
|      name      | ENUM<br />(‘users’，‘posts’，‘comments’，‘notes’，’replies’，‘tags’，‘topics’，‘roles’，‘admins’) | 记录各种角色，每种角色各拥有一定权限。 |
| assigned_count |                             INT                              |                角色数量                |

## 4. post

> 帖子表，记录文章和问答帖。

|        字段        |            类型            |             更多说明             |
|:----------------:| :------------------------: | :------------------------------: |
|       pid        |            INT             |               主键               |
|      title       |        VARCHAR(50)         |               标题               |
|   content_url    |        VARCHAR(100)        |         文章内容存放路径         |
| created_datetime |          DATETIME          |             发布时间             |
| updated_datetime |          DATETIME          |             更新时间             |
|  visited_count   |            INT             |              访问量              |
|       type       | ENUM(‘article’，‘inquiry’) | 帖子类型，分为文章分享和相关提问 |

## 5. comment

> 评论表，记录对post下的所有评论。

|       字段       |     类型     | 更多说明 |
| :--------------: | :----------: | :------: |
|       cid        |     INT      |   主键   |
|   content_url    | VARCHAR(100) |          |
| created_datetime |   DATETIME   | 发布时间 |

## 6. reply

> 回复表，记录comment下的所有回复。

|       字段       |     类型     | 更多说明 |
| :--------------: | :----------: | :------: |
|       rid        |     INT      |   主键   |
|   content_url    | VARCHAR(100) |          |
| created_datetime |   DATETIME   | 发布时间 |

## 7. note

> 笔记表。笔记只为自己服务。

|       字段       |     类型     | 更多说明  |
| :--------------: | :----------: | :-------: |
|       nid        |     INT      |   主键    |
|      title       | VARCHAR(50)  |           |
|   content_url    | VARCHAR(100) |           |
| created_datetime |   DATETIME   | 发布时间  |
| updated_datetime |   DATETIME   | 更新时间  |
|    is_public     |   BOOLEAN    | 是否公开  |
|    self_tags     | VARCHAR(100) | 自定义tag |

## 8. tag

> 系统内置的tag，服务于note

|  字段   |    类型     | 更多说明 |
| :-----: | :---------: | :------: |
|   tid   |     INT     |   主键   |
| content | VARCHAR(10) |  关键词  |
|         |             |          |

## 9. topic

> 主题板块，参考B站，生活区，舞蹈区......

|     字段      |     类型     |    更多说明    |
| :-----------: | :----------: | :------------: |
|      tid      |     INT      |      主键      |
|  description  | VARCHAR(200) |    主题描述    |
|     name      | VARCHAR(20)  |      名称      |
| article_count |     INT      | 包含的文章数量 |
| inquiry_count |     INT      | 包含的提问数量 |

## 10. admin_role_mapper

> 映射管理员到所拥有的角色上。

| 字段 | 类型 | 更多说明 |
| :--: | :--: | :------: |
| aid  | INT  |   主键   |
| rid  | INT  | 二级索引 |

## 11. user_admin_mapper

| 字段 | 类型 | 更多说明 |
| :--: | :--: | :------: |
| uid  | INT  |   主键   |
| aid  | INT  | 二级索引 |

## 12. user_post_mapper

> 发布者和帖子关联起来。

| 字段 | 类型 | 更多说明 |
| :--: | :--: | :------: |
| uid  | INT  |   主键   |
| pid  | INT  | 二级索引 |

## 13. user_comment_mapper

> 记录评论的发布者和评论间的关联。

| 字段 | 类型 | 更多说明 |
| :--: | :--: | :------: |
| uid  | INT  |   主键   |
| cid  | INT  | 二级索引 |

## 14. post_comment_mapper

> 建立帖子和评论间的关联。

| 字段 | 类型 | 更多说明 |
| :--: | :--: | :------: |
| pid  | INT  |   主键   |
| cid  | INT  | 二级索引 |

## 15. comment_reply_mapper

> 建立评论和其下回复的关联。

| 字段 | 类型 | 更多说明 |
| :--: | :--: | :------: |
| cid  | INT  |   主键   |
| rid  | INT  | 二级索引 |

## 16. note_tag_mapper

| 字段 | 类型 | 更多说明 |
| :--: | :--: | :------: |
| nid  | INT  |   主键   |
| tid  | INT  | 二级索引 |

## 17. topic_post_mapper

| 字段 | 类型 | 更多说明 |
| :--: | :--: | :------: |
| tid  | INT  |   主键   |
| pid  | INT  | 二级索引 |