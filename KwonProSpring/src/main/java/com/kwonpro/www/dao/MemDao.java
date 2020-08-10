package com.kwonpro.www.dao;

import org.apache.ibatis.annotations.Param;

import com.kwonpro.www.dto.Member;

public interface MemDao {
	public void memberJoin(Member vo);
	public Member memberInfo(String id);
	public String isId(String id);
	public String checkPw(@Param("id") String id, @Param("pwd") String pw);
	public void updateInfo(Member vo);
}
