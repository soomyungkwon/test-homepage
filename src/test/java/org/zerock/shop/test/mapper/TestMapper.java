package org.zerock.shop.test.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    String getCurrentTime();
}
