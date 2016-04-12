package com.integrationwizards.admin.service;


import java.util.List;

import com.integrationwizards.admin.model.UserInfo;
import com.integrationwizards.admin.model.PageVO;

public interface UserInfoService {
	public UserInfo selectAdminInfoByEmail(UserInfo vo) throws Exception;
	
	public UserInfo selectAdminInfo(UserInfo vo) throws Exception;
	
	public void insertUserInfo(UserInfo vo) throws Exception;
	
	public List<UserInfo> selectAdminInfoList(PageVO vo) throws Exception;
	
	public int selectAdminInfoListCnt(PageVO vo) throws Exception;
	
	public UserInfo selectAdminInfoById(UserInfo vo) throws Exception;
	
	public void updateUserInfo(UserInfo vo) throws Exception;
	
	public void deleteAdminInfo(UserInfo vo) throws Exception;	
	
	public void updateLoginFail(String email) throws Exception;
	
	public void updateLoginSuccess(UserInfo vo) throws Exception;
	
}
