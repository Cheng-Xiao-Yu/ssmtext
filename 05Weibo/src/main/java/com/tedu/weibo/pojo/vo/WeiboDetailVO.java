package com.tedu.weibo.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class WeiboDetailVO {
    private Integer id;
    private String content;
    @JsonFormat(pattern = "yyyy年MM月dd号 HH点mm分ss秒",timezone = "GMT+8")
    private Date created;
    private String nickname;
}
