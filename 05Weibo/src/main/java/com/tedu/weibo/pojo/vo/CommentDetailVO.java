package com.tedu.weibo.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
public class CommentDetailVO {
    @ApiModelProperty(value = "评论ID",required = true,example = "1")
    private Integer id;
    @ApiModelProperty(value = "评论内容",required = true,example = "666")
    private String content;
    @ApiModelProperty(value = "评论发表时间",required = true,example = "2024年10月22日 12点01分04秒")
    @JsonFormat(pattern = "yyyy年MM月dd号 HH点mm分ss秒",timezone = "GMT+8")
    private Date created;
    @ApiModelProperty(value = "用户昵称",required = true,example = "晶晶")
    private String nickname;
}
