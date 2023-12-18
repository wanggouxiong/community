package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//设置优先级
@Primary
public class AlphaDaoMybatisImpl implements AlphaDao{
    @Override
    public String test() {
        return "Mybatis";
    }
}
