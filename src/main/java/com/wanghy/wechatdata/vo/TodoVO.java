package com.wanghy.wechatdata.vo;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TodoVO {

    private Integer id;

    private String name;

    private boolean state;
}
