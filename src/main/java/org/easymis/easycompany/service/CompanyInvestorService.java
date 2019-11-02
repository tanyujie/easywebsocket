package org.easymis.easycompany.service;

import java.util.List;

import org.easymis.easycompany.entitys.mybatis.vo.CompanyInvestorVo;

public interface CompanyInvestorService {
	List findByList(CompanyInvestorVo vo);
}
