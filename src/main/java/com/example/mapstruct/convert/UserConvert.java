package com.example.mapstruct.convert;

import com.example.mapstruct.model.UserEntity;
import com.example.mapstruct.model.UserPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author yjf
 * @Date: 2023/5/23
 */
@Mapper
public interface UserConvert {
    //使用Mappers工厂获取实现类
    UserConvert INSTANCE  = Mappers.getMapper(UserConvert.class);

    /**
     * 注意： Lombok引入顺序要在mapstruct之前，否则可能会导致转换赋值为null
     * 参数对象: sourceObject
     * 返回对象: TargetObject
     */
    UserEntity convert(UserPo userPo);
}
