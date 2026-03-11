package com.bbfw.system.service;

import com.bbfw.system.model.entity.Member;
import com.bbfw.system.model.form.MemberForm;
import com.bbfw.system.model.query.MemberQuery;
import com.bbfw.system.model.vo.MemberVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 会员信息服务类
 *
 * @author youlaitech
 * @since 2026-03-11 18:21
 */
public interface MemberService extends IService<Member> {

    /**
     *会员信息分页列表
     *
     * @return {@link IPage<MemberVo>} 会员信息分页列表
     */
    IPage<MemberVo> getMemberPage(MemberQuery queryParams);

    /**
     * 获取会员信息表单数据
     *
     * @param id 会员信息ID
     * @return 会员信息表单数据
     */
     MemberForm getMemberFormData(Long id);

    /**
     * 新增会员信息
     *
     * @param formData 会员信息表单对象
     * @return 是否新增成功
     */
    boolean saveMember(MemberForm formData);

    /**
     * 修改会员信息
     *
     * @param id   会员信息ID
     * @param formData 会员信息表单对象
     * @return 是否修改成功
     */
    boolean updateMember(Long id, MemberForm formData);

    /**
     * 删除会员信息
     *
     * @param ids 会员信息ID，多个以英文逗号(,)分割
     * @return 是否删除成功
     */
    boolean deleteMembers(String ids);

}
