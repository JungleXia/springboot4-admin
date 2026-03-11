package com.bbfw.system.model.vo;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * 会员信息视图对象
 *
 * @author youlaitech
 * @since 2026-03-11 18:21
 */
@Data
@Schema( description = "会员信息视图对象")
public class MemberVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "会员编号")
    private Integer id;
    @Schema(description = "会员姓名")
    private String name;
    @Schema(description = "会员手机号")
    private String mobile;
    @Schema(description = "性别")
    private Integer gender;
    @Schema(description = "会员年龄")
    private Integer age;
}
