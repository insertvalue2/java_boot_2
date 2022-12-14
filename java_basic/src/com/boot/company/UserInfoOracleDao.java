package com.boot.company;

public class UserInfoOracleDao implements IUserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Oracle : 저장하기 - 이름 :  " + userInfo.getName());
		System.out.println("Oracle : 저장하기 - ID :  " + userInfo.getId());
		System.out.println("Oracle : 저장하기 - pw :  " + userInfo.getPw());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Oracle : 수정하기 - 이름 :  " + userInfo.getName());
		System.out.println("Oracle : 수정하기 - ID :  " + userInfo.getId());
		System.out.println("Oracle : 수정하기 - pw :  " + userInfo.getPw());

	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Oracle : 삭제하기 - 이름 :  " + userInfo.getName());
		System.out.println("Oracle : 삭제하기 - ID :  " + userInfo.getId());
		System.out.println("Oracle : 삭제하기 - pw :  " + userInfo.getPw());
	}

	@Override
	public void selectUserInfo(String id) {
		System.out.println("Oracle : 사용자 정보 조회  - " + id);

	}

}
