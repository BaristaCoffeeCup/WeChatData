package com.wanghy.wechatdata.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Todo {
    private Integer id;
    private String name;
    private boolean state;
    private boolean isDeleted;
}
