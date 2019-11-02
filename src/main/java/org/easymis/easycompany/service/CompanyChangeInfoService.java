package org.easymis.easycompany.service;

import org.easymis.easycompany.entitys.mybatis.vo.CompanyChangeVo;

import com.github.pagehelper.Page;

public interface CompanyChangeInfoService {
	Page findByPage(CompanyChangeVo vo);
}
