package com.example.mapstruct.convert;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.StopWatch;
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
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        UserEntity userEntity = UserConvert.INSTANCE.convert(userPo);

        stopWatch.stop();
        //耗时（毫秒）： 23
        System.out.println("耗时（毫秒）： " + stopWatch.getTotalTimeMillis());

        System.out.println("userEntity: " + userEntity);
        System.out.println("-----------testNormal-----end------");

        testBeanUtil();
    }

    public static void testBeanUtil(){
        System.out.println("--------------testBeanUtil--------start----------");
        UserPo userPo = new UserPo();
        userPo.setId(1L);
        userPo.setGmtCreate(LocalDateTime.now());
        userPo.setCreateTime(LocalDateTime.now());
        userPo.setBuyerId(666L);
        userPo.setAge(18L);
        userPo.setUserNick("测试mapstruct");
        userPo.setUserVerified("ok");
        UserEntity userEntity = new UserEntity();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        BeanUtil.copyProperties(userPo, userEntity);

        stopWatch.stop();
        //耗时（毫秒）： 386
        System.out.println("耗时（毫秒）： " + stopWatch.getTotalTimeMillis());
        System.out.println("userEntity: " + userEntity);

        System.out.println("--------------testBeanUtil--------end----------");
    }
}
