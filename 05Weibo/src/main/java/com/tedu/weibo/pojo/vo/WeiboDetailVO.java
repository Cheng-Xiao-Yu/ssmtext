package com.tedu.weibo.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class WeiboDetailVO {
    @ApiModelProperty(value = "微博ID",required = true,example = "1")
    private Integer id;
    @ApiModelProperty(value = "微博内容",required = true,example = "这是一条微博")
    private String content;
    @ApiModelProperty(value = "微博创建时间",required = true,example = "2024年10月22日 12点06分16秒")
    @JsonFormat(pattern = "yyyy年MM月dd号 HH点mm分ss秒",timezone = "GMT+8")
    private Date created;
    @ApiModelProperty(value = "用户昵称",required = true,example = "晶晶")
    private String nickname;
}
