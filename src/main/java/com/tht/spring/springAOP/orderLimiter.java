package com.tht.spring.springAOP;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * springAOP 自定义注解 对每个订单限流
 * 深入（用lua脚本和redis实现分布式限流，用redis的值判断
 * 是否满足设置的QPS(每秒查询率)）
 * mysql 数据库连接瓶颈 300(机械)-700(固态)
 * redis是单进程单线程10w并发
 */
//切面类
@Aspect
//javaBean
@Component
public @interface orderLimiter {



}
