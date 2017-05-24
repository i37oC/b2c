# 工程结构




    b2c
        b2c-common （公共模块）
        b2c-api (对外接口)
        b2c-leaf (数据实体及操作接口)
            b2c-leaf-{具体模块 product}
            b2c-leaf-{具体模块 user}
            b2c-leaf-{具体模块 item}
            ...
        b2c-root (数据操作实现层)
            b2c-root-{具体模块 product}
            b2c-root-{具体模块 user}
            b2c-root-{具体模块 item}
            ...    
        ...
        b2c-kit (辅助开发模块 MBG表生成，数据收集等)

# 模块包结构
### leaf





# 一、金额处理
mysql 中的存储字段为 bigint 对应 java long 类型  以分为单位
BIGINT 存储为8字节，值范围 （-9223372036854775808，9223372036854775807）可以满足需求

# 二、商品主键ID
使用 VARCHAR 36 ： java 中使用 uuid 生成。

优点：
- 唯一性，不同库中也会唯一
- 安全，在url或者接口返回中不容易暴露意义，也防止猜测攻击


