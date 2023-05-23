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

    UserConvert INSTANCE  = Mappers.getMapper(UserConvert.class);

    UserEntity po2Entity(UserPo userPo);
}
