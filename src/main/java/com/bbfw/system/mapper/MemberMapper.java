package com.bbfw.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bbfw.system.model.entity.Member;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bbfw.system.model.query.MemberQuery;
import com.bbfw.system.model.vo.MemberVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员信息Mapper接口
 *
 * @author youlaitech
 * @since 2026-03-11 18:21
 */
@Mapper
public interface MemberMapper extends BaseMapper<Member> {

    /**
     * 获取会员信息分页数据
     *
     * @param page 分页对象
     * @param queryParams 查询参数
     * @return {@link Page<MemberVo>} 会员信息分页列表
     */
    Page<MemberVo> getMemberPage(Page<MemberVo> page, MemberQuery queryParams);

}
