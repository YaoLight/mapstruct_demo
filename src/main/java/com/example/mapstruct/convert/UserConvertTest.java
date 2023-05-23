package com.example.mapstruct.convert;

import com.example.mapstruct.model.UserEntity;
import com.example.mapstruct.model.UserPo;

import java.time.LocalDateTime;

/**
 * @author yjf
 * @Date: 2023/5/23
 */
public class UserConvertTest {

    public static void main(String[] args) {
        testNormal();
    }

    public static void testNormal() {
        System.out.println("-----------testNormal-----start------");
        UserPo userPo = UserPo.builder()
                .id(1L)
                .gmtCreate(LocalDateTime.now())
                .buyerId(666L)
                .userNick("测试mapstruct")
                .userVerified("ok")
                .age(18L)
                .build();
        System.out.println("userPo: " + userPo);
        UserEntity userEntity = UserConvert.INSTANCE.po2Entity(userPo);
        System.out.println("userEntity: " + userEntity);
        System.out.println("-----------testNormal-----ent------");
    }
}
