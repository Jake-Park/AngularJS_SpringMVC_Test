package com.integrationwizards.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrationwizards.admin.dao.UserInfoDao;
import com.integrationwizards.admin.model.UserInfo;
import com.integrationwizards.admin.model.PageVO;
import com.integrationwizards.admin.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoDao userInfoDao;
		
	@Transactional
	public UserInfo selectAdminInfoByEmail(UserInfo vo)throws Exception {
		return userInfoDao.selectAdminInfoByEmail(vo);
	}	
	@Transactional
	public UserInfo selectAdminInfo(UserInfo vo) throws Exception {
		return userInfoDao.selectAdminInfo(vo);
	}
	@Transactional
	public void insertUserInfo(UserInfo vo) throws Exception {
		userInfoDao.insertUserInfo(vo);
	}
	@Transactional
	public List<UserInfo> selectAdminInfoList(PageVO vo) throws Exception {
		return userInfoDao.selectAdminInfoList(vo);
	}
	@Transactional
	public int selectAdminInfoListCnt(PageVO vo) throws Exception {
		return userInfoDao.selectAdminInfoListCnt(vo);
	}	
	@Transactional
	public UserInfo selectAdminInfoById(UserInfo vo)throws Exception {
		return userInfoDao.selectAdminInfoById(vo);
	}	
	@Transactional
	public void updateUserInfo(UserInfo vo) throws Exception {
		userInfoDao.updateAdminInfo(vo);
	}
	@Transactional
	public void deleteAdminInfo(UserInfo vo) throws Exception {
		userInfoDao.deleteAdminInfo(vo);
	}
	@Transactional
	public void updateLoginFail(String email) throws Exception {
		userInfoDao.updateLoginFail(email);
	}
	@Transactional
	public void updateLoginSuccess(UserInfo vo) throws Exception {
		userInfoDao.updateLoginSuccess(vo);
	}
}
