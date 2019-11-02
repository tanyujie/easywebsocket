package org.easymis.easycompany.entitys.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.easymis.easycompany.entitys.mybatis.vo.CompanyStaffVo;

@Mapper
public interface CompanyStaffMapper {
	CompanyStaffVo findById(@Param("id") String id);
}
