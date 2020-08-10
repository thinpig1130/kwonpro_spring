package com.kwonpro.www;

import java.sql.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kwonpro.www.dao.MemDao;
import com.kwonpro.www.dto.Member;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = {"", "/login"})
	public String memberLogin(Locale locale, Model model,  HttpSession session) {
		logger.info("memberLogin! The client locale is {}.", locale);
		if(session.getAttribute("uid")!=null) {
			JOptionPane.showMessageDialog(null, "잘못된 접근입니다.(로그인 중)");
			return "redirect:/";
		}
		return "member/login";
	}
	
	@RequestMapping(value = "/agree")
	public String memberAgree(Locale locale, Model model,  HttpSession session) {
		logger.info("MemberAgree! The client locale is {}.", locale);
		if(session.getAttribute("uid")!=null) {
			JOptionPane.showMessageDialog(null, "이미 가입되어 있습니다. (로그인 중...)");
			return "redirect:/";
		};
		return "member/agree";
	}
	
	@RequestMapping(value = "/join",  method = RequestMethod.POST)
	public String memberJoin(Locale locale, Model model, HttpServletRequest request, HttpSession session) {
		logger.info("memberJoin! The client locale is {}.", locale);
		if(session.getAttribute("uid")!=null) {
			JOptionPane.showMessageDialog(null, "이미 가입되어 있습니다. (로그인 중...)");
			return "redirect:/";
		};
		String agree = request.getParameter("agree");
		if(agree.equals("true")) {
			return "member/join";	
		}else {
			return "member/agree";
		}
	}
	
	@RequestMapping(value = "/confirm", method = RequestMethod.POST)
	public String memberConfirm(Locale locale, Model model, HttpServletRequest request, HttpSession session) {
		logger.info("memberConfirm! The client locale is {}.", locale);
		if(session.getAttribute("uid")!=null) {
			JOptionPane.showMessageDialog(null, "이미 가입되어 있습니다. (로그인 중...)");
			return "redirect:/";
		};
		MemDao dao = sqlSession.getMapper(MemDao.class);
		Member vo = new Member();
		
		vo.setId(request.getParameter("id"));
		vo.setName(request.getParameter("name"));
		vo.setPassword(request.getParameter("pwd"));
		vo.setSex(request.getParameter("sex"));
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		vo.setBirthday(Date.valueOf(request.getParameter("birthday")));
		vo.setEmail(request.getParameter("phone"));
		vo.setPhone(request.getParameter("email"));
		
		dao.memberJoin(vo);
		
		return "member/confirm";
	}
	
	@RequestMapping(value = "/enter", method = RequestMethod.POST)
	public String memberEnter(Locale locale, Model model, HttpServletRequest request, HttpSession session) {
		logger.info("memberEnter! The client locale is {}.", locale);
		MemDao dao = sqlSession.getMapper(MemDao.class);
		String id = request.getParameter("id");
		if(dao.isId(id) == null) {
			JOptionPane.showMessageDialog(null, "아이디를 확인하세요.");
			return "member/login";
		}else {
			if(dao.checkPw(id, request.getParameter("pwd"))==null) {
				JOptionPane.showMessageDialog(null, "비밀번호를 확인하세요.");
				return "member/login";
			}else{
				session.setAttribute("uid", id);
				return "redirect:/";
			}
		}
	}
	
	@RequestMapping(value = "/logout")
	public String memberLogout(HttpSession session){
		session.invalidate();
		return "redirect:/";
	}
}
