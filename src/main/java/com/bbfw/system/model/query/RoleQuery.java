package com.bbfw.system.model.query;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.bbfw.common.base.BaseQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 角色查询对象
 *
 * @author Ray
 * @since 2022/6/3
 */
@Schema(description = "角色查询对象")
@Data
public class RoleQuery extends BaseQuery {

    @Schema(description="关键字(角色名称/角色编码)")
    private String keywords;

    @Schema(description="开始日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime startDate;

    @Schema(description="结束日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime endDate;
}
