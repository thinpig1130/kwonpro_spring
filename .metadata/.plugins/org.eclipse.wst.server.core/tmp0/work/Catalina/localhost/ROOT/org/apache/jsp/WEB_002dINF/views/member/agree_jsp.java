/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.8
 * Generated at: 2020-07-30 07:19:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agree_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>세종시 프로그래머 온라인 허브</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"/resources/css/member/layout.css\" type=\"text/css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("<style>\r\n");
      out.write("#visual .content-container {\r\n");
      out.write("\theight: inherit;\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("\talign-items: center;\r\n");
      out.write("\tbackground: url(\"/resources/images/customer/visual.png\") no-repeat\r\n");
      out.write("\t\tcenter;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- header 부분 -->\r\n");
      out.write("\t<header id=\"header\">\r\n");
      out.write("\t\t<div class=\"content-container\">\r\n");
      out.write("\t\t\t<!-- --------------------------- <header> ----------------------------------------->\r\n");
      out.write("\t\t\t<h1 id=\"logo\">\r\n");
      out.write("\t\t\t\t<a href=\"/\"> <img src=\"/resources/images/logo.png\"\r\n");
      out.write("\t\t\t\t\talt=\"KwonPro 온라인\" />\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<section>\r\n");
      out.write("\t\t\t\t<h1 class=\"hidden\">헤더</h1>\r\n");
      out.write("\t\t\t\t<nav id=\"main-menu\">\r\n");
      out.write("\t\t\t\t\t<h1>메인메뉴</h1>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">모임가이드</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">모임선택</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">AnswerIs</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"sub-menu\">\r\n");
      out.write("\t\t\t\t\t<section id=\"search-form\">\r\n");
      out.write("\t\t\t\t\t\t<h1>강좌검색 폼</h1>\r\n");
      out.write("\t\t\t\t\t\t<form action=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t<legend>모임검색필드</legend>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>모임검색</label> <input type=\"text\" name=\"q\" value=\"\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"submit\" value=\"검색\" />\r\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<nav id=\"acount-menu\">\r\n");
      out.write("\t\t\t\t\t\t<h1 class=\"hidden\">회원메뉴</h1>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/\">HOME</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/member/login\">로그인</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/member/agree\">회원가입</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<nav id=\"member-menu\" class=\"linear-layout\">\r\n");
      out.write("\t\t\t\t\t\t<h1 class=\"hidden\">고객메뉴</h1>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"linear-layout\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/resources/images/txt-mypage.png\" alt=\"마이페이지\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/notice\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/resources/images/txt-customer.png\" alt=\"고객센터\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"/resources/js/header.js\"></script>\r\n");
      out.write("\t<!-- --------------------------- <visual> --------------------------------------- -->\r\n");
      out.write("\t<!-- visual 부분 -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"visual\">\r\n");
      out.write("\t\t<div class=\"content-container\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- --------------------------- <body> --------------------------------------- -->\r\n");
      out.write("\t<div id=\"body\">\r\n");
      out.write("\t\t<div class=\"content-container clearfix\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- --------------------------- aside --------------------------------------- -->\r\n");
      out.write("\t\t\t<!-- aside 부분 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<aside class=\"aside\">\r\n");
      out.write("\t\t\t\t<h1>회원가입</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<nav class=\"menu text-menu first margin-top\">\r\n");
      out.write("\t\t\t\t\t<h1>회원메뉴</h1>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/member/login\">로그인</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/member/agree\">회원가입</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">아이디찾기</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">비밀번호 재발급</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<nav class=\"menu\">\r\n");
      out.write("\t\t\t\t\t<h1>협력기관</h1>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a target=\"_blank\" href=\"http://www.tjvision.co.kr\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/resources/images/tjvision.png\" alt=\"비젼직업전문학교\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a target=\"_blank\" href=\"https://www.sejongcommunity.com\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/resources/images/sejongcommunity.png\" alt=\"세종시 마을공동체지원센터\" /></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- <nav class=\"menu\">\r\n");
      out.write("\t\t\t\t\t<h1>협찬광고</h1>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t                <li style=\"width:181px;overflow:hidden;\">                            \r\n");
      out.write("                                             \r\n");
      out.write("\t\t                </li>  \r\n");
      out.write("                        <li style=\"width:181px;overflow:hidden;\">                            \r\n");
      out.write("                                                \r\n");
      out.write("\t\t                </li>\r\n");
      out.write("                    </ul>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</nav> -->\r\n");
      out.write("\t\t\t</aside>\r\n");
      out.write("\t\t\t<!-- --------------------------- main --------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<main>\r\n");
      out.write("\t\t\t\t<h2 class=\"main title\">가입동의</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"breadcrumb\" style=\"margin-top: -20px;\">\r\n");
      out.write("\t\t\t\t\t<h3 class=\"hidden\">경로</h3>\r\n");
      out.write("\t\t\t\t\t<img src=\"/resources/images/member/step1.png\" alt=\"회원가입 1단계\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"margin-top first\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"bg-light-gray border-gray padding\" style=\"\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"padding font-size-13 text-strong\">\r\n");
      out.write("\t\t\t\t\t\t\t뉴렉쳐의 <span class=\"text-orange\">개인정보 수집 및 이용</span>에 대한 안내입니다.\r\n");
      out.write("\t\t\t\t\t\t\t불편하신 사항이 없으시도록 꼭 읽어주시기 바랍니다.\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"agree-content\">\r\n");
      out.write("\t\t\t\t\t\t\t<textarea style=\"width: 100%; height: 300px\"> 블라블라 블라라\r\n");
      out.write("            </textarea>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form action=\"/member/join\" method=\"post\" class=\"margin-top\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"agree\" value=\"true\" /> 약관에 동의합니다.\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"margin-top text-align-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"\" value=\"\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"submit-button\" class=\"btn-text btn-default\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"height: 40px; width: 100px; font-size: 13px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\" value=\"다음\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</main>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\twindow\r\n");
      out.write("\t\t\t\t\t\t.addEventListener(\r\n");
      out.write("\t\t\t\t\t\t\t\t\"load\",\r\n");
      out.write("\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar agreeButton = document\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.querySelector(\"form input[type='checkbox']\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar submitButton = document\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t.querySelector(\"#submit-button\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsubmitButton.onclick = function(e) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif (!agreeButton.checked) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\talert(\"약관에 동의하셔야만 합니다.\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\te.preventDefault();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ------------------- <footer> --------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<footer id=\"footer\">\r\n");
      out.write("\t\t<div class=\"content-container\">\r\n");
      out.write("\t\t\t<h2 id=\"footer-logo\">\r\n");
      out.write("\t\t\t\t<img src=\"/resources/images/logo-footer.png\" alt=\"모임정보\">\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"company-info\">\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>주소:</dt>\r\n");
      out.write("\t\t\t\t\t<dd>세종특별자치시 도움3로 160</dd>\r\n");
      out.write("\t\t\t\t\t<dt>관리자메일:</dt>\r\n");
      out.write("\t\t\t\t\t<dd>thinpig1130@gmail.com</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>사업자 등록번호:</dt>\r\n");
      out.write("\t\t\t\t\t<dd>111-11-11111</dd>\r\n");
      out.write("\t\t\t\t\t<dt>비영리 단체:</dt>\r\n");
      out.write("\t\t\t\t\t<dd>세종시마을공동체 143호</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>공동체명:</dt>\r\n");
      out.write("\t\t\t\t\t<dd>세종시프로그래머모임</dd>\r\n");
      out.write("\t\t\t\t\t<dt>대표:</dt>\r\n");
      out.write("\t\t\t\t\t<dd>권다애</dd>\r\n");
      out.write("\t\t\t\t\t<dt>전화번호:</dt>\r\n");
      out.write("\t\t\t\t\t<dd>010-4191-####</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<div id=\"copyright\" class=\"margin-top\">Copyright ⓒ kwonpro.lec\r\n");
      out.write("\t\t\t\t\t2020-2020 All Right Reserved. Contact thinpig1130@gmail.com for\r\n");
      out.write("\t\t\t\t\tmore information</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
}
