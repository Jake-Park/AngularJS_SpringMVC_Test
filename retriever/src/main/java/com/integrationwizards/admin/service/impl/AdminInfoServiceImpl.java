package com.integrationwizards.admin.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.admin.dao.AdminInfoDao;
import com.integrationwizards.admin.model.AdminInfo;
import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.admin.service.AdminInfoService;

@Service
public class AdminInfoServiceImpl implements AdminInfoService {
	private AdminInfoDao adminInfoDao;
	
	public void setAdminInfoDao(AdminInfoDao adminInfoDao) {
		this.adminInfoDao = adminInfoDao;
	}	
	
	@Transactional
	public AdminInfo selectAdminInfoByEmail(AdminInfo vo)throws Exception {
		return adminInfoDao.selectAdminInfoByEmail(vo);
	}	
	@Transactional
	public AdminInfo selectAdminInfo(AdminInfo vo) throws Exception {
		return adminInfoDao.selectAdminInfo(vo);
	}
	@Transactional
	public void insertAdminInfo(AdminInfo vo) throws Exception {
		adminInfoDao.insertAdminInfo(vo);
	}
	@Transactional
	public List<AdminInfo> selectAdminInfoList(PageVO vo) throws Exception {
		return adminInfoDao.selectAdminInfoList(vo);
	}
	@Transactional
	public int selectAdminInfoListCnt(PageVO vo) throws Exception {
		return adminInfoDao.selectAdminInfoListCnt(vo);
	}	
	@Transactional
	public AdminInfo selectAdminInfoById(AdminInfo vo)throws Exception {
		return adminInfoDao.selectAdminInfoById(vo);
	}	
	@Transactional
	public void updateAdminInfo(AdminInfo vo) throws Exception {
		adminInfoDao.updateAdminInfo(vo);
	}
	@Transactional
	public void deleteAdminInfo(AdminInfo vo) throws Exception {
		adminInfoDao.deleteAdminInfo(vo);
	}
	@Transactional
	public void updateLoginFail(String email) throws Exception {
		adminInfoDao.updateLoginFail(email);
	}
	@Transactional
	public void updateLoginSuccess(AdminInfo vo) throws Exception {
		adminInfoDao.updateLoginSuccess(vo);
	}
}
