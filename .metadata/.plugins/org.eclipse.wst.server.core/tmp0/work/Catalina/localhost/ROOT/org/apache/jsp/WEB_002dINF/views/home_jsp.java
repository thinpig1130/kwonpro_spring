/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.8
 * Generated at: 2020-07-30 07:34:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1585104544341L));
    _jspx_dependants.put("jar:file:/D:/githubtest/kwonpro_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/KwonProSpring/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>세종시 프로그래머 온라인 허브</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<link href=\"/resources/css/layout.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"/resources/css/index.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- header 부분 -->\n");
      out.write("\t<header id=\"header\">\n");
      out.write("\t\t<div class=\"content-container\">\n");
      out.write("\t\t\t<!-- --------------------------- <header> ----------------------------------------->\n");
      out.write("\t\t\t<h1 id=\"logo\">\n");
      out.write("\t\t\t\t<a href=\"/\"> <img src=\"/resources/images/logo.png\"\n");
      out.write("\t\t\t\t\talt=\"KwonPro 온라인\" />\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</h1>\n");
      out.write("\n");
      out.write("\t\t\t<section>\n");
      out.write("\t\t\t\t<h1 class=\"hidden\">헤더</h1>\n");
      out.write("\t\t\t\t<nav id=\"main-menu\">\n");
      out.write("\t\t\t\t\t<h1>메인메뉴</h1>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">모임가이드</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">모임선택</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">AnswerIs</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t<section id=\"search-form\">\n");
      out.write("\t\t\t\t\t\t<h1>강좌검색 폼</h1>\n");
      out.write("\t\t\t\t\t\t<form action=\"\">\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t<legend>모임검색필드</legend>\n");
      out.write("\t\t\t\t\t\t\t\t<label>모임검색</label> <input type=\"text\" name=\"q\" value=\"\" /> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"submit\" value=\"검색\" />\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<!-- --------------------------- <body> --------------------------------------- -->\n");
      out.write("\n");
      out.write("\t<!-- content 부분 -->\n");
      out.write("\t<div id=\"visual\" class=\"\">\n");
      out.write("\t\t<div class=\"content-container\">\n");
      out.write("\t\t\t<h2 class=\"hidden\">신규 강좌목록</h2>\n");
      out.write("\n");
      out.write("\t\t\t<ul class=\"banner\">\n");
      out.write("\t\t\t\t<li class=\"banner1\"><a href=\"\"> <img\n");
      out.write("\t\t\t\t\t\tsrc=\"/resources/images/banner-java.png\" data-id=\"1\"\n");
      out.write("\t\t\t\t\t\tstyle=\"cursor: pointer;\" />\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t<ul class=\"banner-button-list\"\n");
      out.write("\t\t\t\tstyle=\"color: #ffff00; font-size: 20px; position: absolute; left: 10px; bottom: 5px; z-index: 100px; display: flex; flex-direction: row;\">\n");
      out.write("\t\t\t\t<li></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"notice\">\n");
      out.write("\t\t<div class=\"content-container\">\n");
      out.write("\t\t\t<span class=\"title\">전문가를 더욱 전문가 답게 <span\n");
      out.write("\t\t\t\tstyle=\"color: yellow; font-size: 15px;\"> IT PROFESSIONAL <span\n");
      out.write("\t\t\t\t\tstyle=\"color: #00ffff;\">HUB</span> ONLINE <span\n");
      out.write("\t\t\t\t\tstyle=\"color: #00ffff;\">KWONPRO</span> STUDY MEETING\n");
      out.write("\t\t\t</span></span>\n");
      out.write("\t\t\t<!--<a class=\"detail-button\">자세히</a>-->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- ----- 공지사항 줄 ------------------------------------------------------------------------------ -->\n");
      out.write("\t<div id=\"information\">\n");
      out.write("\t\t<div class=\"content-container\">\n");
      out.write("\t\t\t<section class=\"guide\">\n");
      out.write("\t\t\t\t<h1 class=\"title\">스터디 모임 참여방법 안내</h1>\n");
      out.write("\t\t\t\t<div class=\"margin-top\">\n");
      out.write("\t\t\t\t\t<a href=\"\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"/resources/images/customer/installInfo.png\" /></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<section class=\"course-info\">\n");
      out.write("\t\t\t\t<h1 class=\"title text-center\">스터디원 모집 안내</h1>\n");
      out.write("\t\t\t\t<ul class=\"list\">\n");
      out.write("\t\t\t\t\t<li>현재 모집 과정이 없습니다.</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<section class=\"notice\">\n");
      out.write("\t\t\t\t<h1 class=\"title\">공지사항</h1>\n");
      out.write("\t\t\t\t<ul class=\"list margin-top\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- ----- 커뮤니티 시작 줄 -------------------------------------------------------------------------------------------- -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- ----- 강좌 목록 시작 줄 --------------------------------------------------------------------------------------------------------- -->\n");
      out.write("\t<main id=\"course\">\n");
      out.write("\t\t<section\n");
      out.write("\t\t\tclass=\"content-container list list-horizontal list-course list-course-index\">\n");
      out.write("\t\t\t<h1>\n");
      out.write("\t\t\t\t온라인 <span class=\"color-orange\">단기 스터디 과정</span>\n");
      out.write("\t\t\t</h1>\n");
      out.write("\t\t\t<div></div>\n");
      out.write("\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"item-course normal event\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<a href=\"\"><img src=\"/resources/images/course/java.png\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\"><span class=\"text-strong text-ellipsis\">자바\n");
      out.write("\t\t\t\t\t\t\t\t\t프로그래밍</span></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"price\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"normal deprecated\"> <span class=\"text-gray\">\n");
      out.write("\t\t\t\t\t\t\t\t\t22,000 </span> 원\n");
      out.write("\t\t\t\t\t\t\t</span> <span class=\"event\"> <span class=\"color-red text-strong\">\n");
      out.write("\t\t\t\t\t\t\t\t\t0 </span>원\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"footer text-strong\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"writer\">선생님 : newlec </span> <span class=\"update\">개설일\n");
      out.write("\t\t\t\t\t\t\t\t: 2019-09-07 </span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"more\">\n");
      out.write("\t\t\t\t<!-- <span class=\"border padding\">단과 과정 목록 더보기</span> -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\n");
      out.write("\t\t<!-- ------- 온라인 패키지 과정 ------------------------------------------------------------------------------------------------- -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"content-container\">\n");
      out.write("\t\t\t<h3 class=\"-text- center green bold -margin- top\">협력기관</h3>\n");
      out.write("\t\t\t<ul class=\"-list- horizontal center -margin- bottom top b20\">\n");
      out.write("\t\t\t\t<li><a target=\"_blank\" href=\"http://www.tjvision.co.kr\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"/resources/images/tjvision.png\" alt=\"비젼직업전문학교\" /></a></li>\n");
      out.write("\t\t\t\t<li><a target=\"_blank\" href=\"https://www.sejongcommunity.com\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"/resources/images/sejongcommunity.png\" alt=\"세종시 마을공동체지원센터\" /></a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</main>\n");
      out.write("\n");
      out.write("\t<!-- ------------------- <footer> --------------------------------------- -->\n");
      out.write("\n");
      out.write("\t<footer id=\"footer\">\n");
      out.write("\t\t<div class=\"content-container\">\n");
      out.write("\t\t\t<h2 id=\"footer-logo\">\n");
      out.write("\t\t\t\t<img src=\"/resources/images/logo-footer.png\" alt=\"모임정보\">\n");
      out.write("\t\t\t</h2>\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"company-info\">\n");
      out.write("\t\t\t\t<dl>\n");
      out.write("\t\t\t\t\t<dt>주소:</dt>\n");
      out.write("\t\t\t\t\t<dd>세종특별자치시 도움3로 160</dd>\n");
      out.write("\t\t\t\t\t<dt>관리자메일:</dt>\n");
      out.write("\t\t\t\t\t<dd>thinpig1130@gmail.com</dd>\n");
      out.write("\t\t\t\t</dl>\n");
      out.write("\t\t\t\t<dl>\n");
      out.write("\t\t\t\t\t<dt>사업자 등록번호:</dt>\n");
      out.write("\t\t\t\t\t<dd>111-11-11111</dd>\n");
      out.write("\t\t\t\t\t<dt>비영리 단체:</dt>\n");
      out.write("\t\t\t\t\t<dd>세종시마을공동체 143호</dd>\n");
      out.write("\t\t\t\t</dl>\n");
      out.write("\t\t\t\t<dl>\n");
      out.write("\t\t\t\t\t<dt>공동체명:</dt>\n");
      out.write("\t\t\t\t\t<dd>세종시프로그래머모임</dd>\n");
      out.write("\t\t\t\t\t<dt>대표:</dt>\n");
      out.write("\t\t\t\t\t<dd>권다애</dd>\n");
      out.write("\t\t\t\t\t<dt>전화번호:</dt>\n");
      out.write("\t\t\t\t\t<dd>010-4191-####</dd>\n");
      out.write("\t\t\t\t</dl>\n");
      out.write("\t\t\t\t<div id=\"copyright\" class=\"margin-top\">Copyright ⓒ kwonpro.lec\n");
      out.write("\t\t\t\t\t2020-2020 All Right Reserved. Contact thinpig1130@gmail.com for\n");
      out.write("\t\t\t\t\tmore information</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/views/home.jsp(46,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uid == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<nav id=\"acount-menu\">\n");
          out.write("\t\t\t\t\t\t\t\t<h1 class=\"hidden\">회원메뉴</h1>\n");
          out.write("\t\t\t\t\t\t\t\t<ul>\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/member/login\">로그인</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/member/agree\">회원가입</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t</ul>\n");
          out.write("\t\t\t\t\t\t\t</nav>\n");
          out.write("\t\t\t\t\t\t\t<nav id=\"member-menu\" class=\"linear-layout\">\n");
          out.write("\t\t\t\t\t\t\t\t<h1 class=\"hidden\">고객메뉴</h1>\n");
          out.write("\t\t\t\t\t\t\t\t<ul class=\"linear-layout\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/notice\"><img\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"/resources/images/txt-customer.png\" alt=\"고객센터\" /></a></li>\n");
          out.write("\t\t\t\t\t\t\t\t</ul>\n");
          out.write("\t\t\t\t\t\t\t</nav>\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<nav id=\"acount-menu\">\n");
          out.write("\t\t\t\t\t\t\t\t<h1 class=\"hidden\">회원메뉴</h1>\n");
          out.write("\t\t\t\t\t\t\t\t<ul>\n");
          out.write("\t\t\t\t\t\t\t\t\t<li>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님 접속중</li>\n");
          out.write("\t\t\t\t\t\t\t\t\t<li> <a href=\"/member/logout\"> 로그아웃 </a> </li>\n");
          out.write("\t\t\t\t\t\t\t\t</ul>\n");
          out.write("\t\t\t\t\t\t\t</nav>\n");
          out.write("\t\t\t\t\t\t\t<nav id=\"member-menu\" class=\"linear-layout\">\n");
          out.write("\t\t\t\t\t\t\t\t<h1 class=\"hidden\">고객메뉴</h1>\n");
          out.write("\t\t\t\t\t\t\t\t<ul class=\"linear-layout\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/\"><img\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"/resources/images/txt-mypage.png\" alt=\"마이페이지\" /></a></li>\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/notice\"><img\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"/resources/images/txt-customer.png\" alt=\"고객센터\" /></a></li>\n");
          out.write("\t\t\t\t\t\t\t\t</ul>\n");
          out.write("\t\t\t\t\t\t\t</nav>\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/home.jsp(139,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/home.jsp(139,5) '${list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/home.jsp(139,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("notice");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t\t<li><span class=\"notice-title\"> <a\n");
            out.write("\t\t\t\t\t\t\t\thref=\"/notice/detail?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notice.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notice.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a>\n");
            out.write("\t\t\t\t\t\t</span> <span>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notice.simpledate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span></li>\n");
            out.write("\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}