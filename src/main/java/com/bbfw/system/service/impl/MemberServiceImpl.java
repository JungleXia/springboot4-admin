package com.bbfw.system.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bbfw.system.mapper.MemberMapper;
import com.bbfw.system.service.MemberService;
import com.bbfw.system.model.entity.Member;
import com.bbfw.system.model.form.MemberForm;
import com.bbfw.system.model.query.MemberQuery;
import com.bbfw.system.model.vo.MemberVo;
import com.bbfw.system.converter.MemberConverter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.StrUtil;

/**
 * 会员信息服务实现类
 *
 * @author youlaitech
 * @since 2026-03-11 18:21
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

    private final MemberConverter memberConverter;

    /**
    * 获取会员信息分页列表
    *
    * @param queryParams 查询参数
    * @return {@link IPage<MemberVo>} 会员信息分页列表
    */
    @Override
    public IPage<MemberVo> getMemberPage(MemberQuery queryParams) {
        Page<MemberVo> pageResult = this.baseMapper.getMemberPage(
                new Page<>(queryParams.getPageNum(), queryParams.getPageSize()),
                queryParams
        );
        return pageResult;
    }
    
    /**
     * 获取会员信息表单数据
     *
     * @param id 会员信息ID
     * @return 会员信息表单数据
     */
    @Override
    public MemberForm getMemberFormData(Long id) {
        Member entity = this.getById(id);
        return memberConverter.toForm(entity);
    }
    
    /**
     * 新增会员信息
     *
     * @param formData 会员信息表单对象
     * @return 是否新增成功
     */
    @Override
    public boolean saveMember(MemberForm formData) {
        Member entity = memberConverter.toEntity(formData);
        return this.save(entity);
    }
    
    /**
     * 更新会员信息
     *
     * @param id   会员信息ID
     * @param formData 会员信息表单对象
     * @return 是否修改成功
     */
    @Override
    public boolean updateMember(Long id,MemberForm formData) {
        Member entity = memberConverter.toEntity(formData);
        return this.updateById(entity);
    }
    
    /**
     * 删除会员信息
     *
     * @param ids 会员信息ID，多个以英文逗号(,)分割
     * @return 是否删除成功
     */
    @Override
    public boolean deleteMembers(String ids) {
        Assert.isTrue(StrUtil.isNotBlank(ids), "删除的会员信息数据为空");
        // 逻辑删除
        List<Long> idList = Arrays.stream(ids.split(","))
                .map(Long::parseLong)
                .toList();
        return this.removeByIds(idList);
    }

}
