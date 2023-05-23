package com.example.mapstruct.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author yjf
 * @Date: 2023/5/23
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private Long id;
    private LocalDateTime gmtCreate;
    private LocalDateTime createTime;
    private Long buyerId;
    private Long age;
    private String userNick;
    private String userVerified;

}
