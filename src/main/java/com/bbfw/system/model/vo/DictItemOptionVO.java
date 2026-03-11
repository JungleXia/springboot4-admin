package com.bbfw.system.model.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 字典项键值对象
 *
 * @author Ray.Hao
 * @since 0.0.1
 */
@Schema(description = "字典项键值对象")
@Data
public class DictItemOptionVO {

    @Schema(description = "字典项值")
    private String value;

    @Schema(description = "字典项标签")
    private String label;

    @Schema(description = "标签类型")
    private String tagType;

}

