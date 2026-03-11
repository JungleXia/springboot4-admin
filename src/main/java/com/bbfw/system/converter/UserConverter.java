package com.bbfw.system.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bbfw.common.model.Option;
import com.bbfw.system.model.entity.User;
import com.bbfw.system.model.dto.CurrentUserDTO;
import com.bbfw.system.model.vo.UserPageVO;
import com.bbfw.system.model.vo.UserProfileVO;
import com.bbfw.system.model.bo.UserBO;
import com.bbfw.system.model.form.UserForm;
import com.bbfw.system.model.dto.UserImportDTO;
import com.bbfw.system.model.form.UserProfileForm;
import org.mapstruct.*;

import java.util.List;

/**
 * 用户对象转换器
 *
 * @author Ray.Hao
 * @since 2022/6/8
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserConverter {

    UserPageVO toPageVo(UserBO bo);

    Page<UserPageVO> toPageVo(Page<UserBO> bo);

    List<UserPageVO> toPageVo(List<UserBO> bo);

    UserForm toForm(User entity);

    @InheritInverseConfiguration(name = "toForm")
    User toEntity(UserForm entity);

    @Mappings({
            @Mapping(target = "userId", source = "id")
    })
    CurrentUserDTO toCurrentUserDto(User entity);

    User toEntity(UserImportDTO vo);


    UserProfileVO toProfileVo(UserBO bo);

    User toEntity(UserProfileForm formData);

    @Mappings({
            @Mapping(target = "label", source = "nickname"),
            @Mapping(target = "value", source = "id")
    })
    Option<String> toOption(User entity);

    List<Option<String>> toOptions(List<User> list);
}
