package com.integrationwizards.admin.dao;

import java.util.List;

import com.integrationwizards.admin.model.UserInfo;
import com.integrationwizards.admin.model.PageVO;

public interface UserInfoDao {
	public UserInfo selectAdminInfoByEmail(UserInfo vo);
	
	public UserInfo selectAdminInfo(UserInfo vo);
	
	public void insertUserInfo(UserInfo vo);
	
	public List<UserInfo> selectAdminInfoList(PageVO vo);
	
	public int selectAdminInfoListCnt(PageVO vo);
	
	public UserInfo selectAdminInfoById(UserInfo vo);
	
	public void updateAdminInfo(UserInfo vo);
	
	public void deleteAdminInfo(UserInfo vo);
	
	public void updateLoginFail(String email);
	
	public void updateLoginSuccess(UserInfo vo);
}
