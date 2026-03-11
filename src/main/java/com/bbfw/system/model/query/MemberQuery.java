package com.bbfw.system.model.query;

import com.bbfw.common.base.BaseQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 会员信息查询对象
 *
 * @author youlaitech
 * @since 2026-03-11 18:21
 */
@Schema(description ="会员信息查询对象")
@Data
public class MemberQuery extends BaseQuery {

    @Schema(description = "会员姓名")
    private String name;
    @Schema(description = "会员手机号")
    private String mobile;
}
