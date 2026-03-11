package com.bbfw.system.converter;

import org.mapstruct.Mapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bbfw.system.model.entity.Member;
import com.bbfw.system.model.form.MemberForm;

/**
 * 会员信息对象转换器
 *
 * @author youlaitech
 * @since 2026-03-11 18:21
 */
@Mapper(componentModel = "spring")
public interface MemberConverter{

    MemberForm toForm(Member entity);

    Member toEntity(MemberForm formData);
}
