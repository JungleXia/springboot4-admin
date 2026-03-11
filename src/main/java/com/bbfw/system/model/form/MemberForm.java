package com.bbfw.system.model.form;

import java.io.Serial;
import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;

/**
 * 会员信息表单对象
 *
 * @author youlaitech
 * @since 2026-03-11 18:21
 */
@Data
@Schema(description = "会员信息表单对象")
public class MemberForm implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "会员姓名")
    @NotBlank(message = "会员姓名不能为空")
    @Size(max=50, message="会员姓名长度不能超过50个字符")
    private String name;

    @Schema(description = "会员手机号")
    @NotBlank(message = "会员手机号不能为空")
    @Size(max=20, message="会员手机号长度不能超过20个字符")
    private String mobile;

    @Schema(description = "性别")
    private Integer gender;

    @Schema(description = "会员年龄")
    private Integer age;


}
