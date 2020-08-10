package com.kwonpro.www.dao;

import java.util.ArrayList;

import com.kwonpro.www.dto.Notice;

public interface NDao {
	public void write(Notice vo);
	public ArrayList<Notice> list(int page);
	public void upHit(int id);
	public Notice curNotice(int id);
	public Notice nextNotice(int id);
	public Notice preNotice(int id);
	public void delete(int id);
	public void update(Notice vo);
	public ArrayList<Notice> recentlyList();
	public int allPage();
}
