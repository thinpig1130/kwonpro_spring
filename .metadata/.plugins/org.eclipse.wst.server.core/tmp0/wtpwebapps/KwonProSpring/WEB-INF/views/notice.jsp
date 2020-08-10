<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <title>세종시 프로그래머 온라인 허브</title>
    <meta charset="UTF-8">
    
    <link href="/resources/css/customer/layout.css" type="text/css" rel="stylesheet" />
    <style>
        #visual .content-container{	
            height:inherit;
            display:flex; 
            align-items: center;
            background: url("/resources/images/customer/visual.png") no-repeat center;
        }
    </style>
</head>
<body>
	<!-- header 부분 -->
	<header id="header">
		<div class="content-container">
			<!-- --------------------------- <header> ----------------------------------------->
			<h1 id="logo">
				<a href="/"> <img src="/resources/images/logo.png"
					alt="KwonPro 온라인" />
				</a>
			</h1>

			<section>
				<h1 class="hidden">헤더</h1>
				<nav id="main-menu">
					<h1>메인메뉴</h1>
					<ul>
						<li><a href="">모임가이드</a></li>
						<li><a href="">모임선택</a></li>
						<li><a href="">AnswerIs</a></li>
					</ul>
				</nav>

				<div class="sub-menu">
					<section id="search-form">
						<h1>강좌검색 폼</h1>
						<form action="">
							<fieldset>
								<legend>모임검색필드</legend>
								<label>모임검색</label> <input type="text" name="q" value="" /> <input
									type="submit" value="검색" />
							</fieldset>
						</form>
					</section>
					<c:choose>
						<c:when test="${uid == null}">
							<nav id="acount-menu">
								<h1 class="hidden">회원메뉴</h1>
								<ul>
									<li><a href="/member/login">로그인</a></li>
									<li><a href="/member/agree">회원가입</a></li>
								</ul>
							</nav>
							<nav id="member-menu" class="linear-layout">
								<h1 class="hidden">고객메뉴</h1>
								<ul class="linear-layout">
									<li><a href="/notice"><img
											src="/resources/images/txt-customer.png" alt="고객센터" /></a></li>
								</ul>
							</nav>
						</c:when>
						<c:otherwise>
							<nav id="acount-menu">
								<h1 class="hidden">회원메뉴</h1>
								<ul>
									<li>${uid}님 접속중</li>
									<li> <a href="/member/logout"> 로그아웃 </a> </li>
								</ul>
							</nav>
							<nav id="member-menu" class="linear-layout">
								<h1 class="hidden">고객메뉴</h1>
								<ul class="linear-layout">
									<li><a href="/"><img
											src="/resources/images/txt-mypage.png" alt="마이페이지" /></a></li>
									<li><a href="/notice"><img
											src="/resources/images/txt-customer.png" alt="고객센터" /></a></li>
								</ul>
							</nav>
						</c:otherwise>
					</c:choose>

				</div>
			</section>

		</div>

	</header>

    
	<!-- --------------------------- <visual> --------------------------------------- -->
	<!-- visual 부분 -->
	
	<div id="visual">
		<div class="content-container"></div>
	</div>
	<!-- --------------------------- <body> --------------------------------------- -->
	<div id="body">
		<div class="content-container clearfix">

			<!-- --------------------------- aside --------------------------------------- -->
			<!-- aside 부분 -->


			<aside class="aside">
				<h1>Online 연구소</h1>

				<nav class="menu text-menu first margin-top">
					<h1>메뉴</h1>
					<ul>
						<li><a class="current"  href="/notice">공지사항</a></li>
						<li><a class=""  href="">자주하는 질문</a></li>
						<li><a class="" href="">모임문의</a></li>
						<li><a class="" href="">이벤트/번개</a></li>
					</ul>
				</nav>


	<nav class="menu">
		<h1>협력기관</h1>
		<ul>
			<li><a target="_blank" href="http://www.tjvision.co.kr"><img src="/resources/images/tjvision.png" alt="비젼직업전문학교" /></a></li>
            <li><a target="_blank" href="https://www.sejongcommunity.com"><img src="/resources/images/sejongcommunity.png" alt="세종시 마을공동체지원센터" /></a></li>                
            			
		</ul>
	</nav>
					
			</aside>
			<!-- --------------------------- main --------------------------------------- -->



		<main class="main">
			<h2 class="main title">공지사항</h2>
			
			<div class="breadcrumb">
				<h3 class="hidden">경로</h3>
				<ul>
					<li>home</li>
					<li>고객센터</li>
					<li>공지사항</li>
				</ul>
			</div>
			
			<div class="search-form margin-top first align-right">
				<h3 class="hidden">공지사항 검색폼</h3>
				<form class="table-form">
					<fieldset>
						<legend class="hidden">공지사항 검색 필드</legend>
						<label class="hidden">검색분류</label>
						<select name="f">
							<option  value="title">제목</option>
							<option  value="writerId">작성자</option>
						</select> 
						<label class="hidden">검색어</label>
						<input type="text" name="q" value=""/>
						<input class="btn btn-search" type="submit" value="검색" />
					</fieldset>
				</form>
			</div>
			
			<div class="notice margin-top">
				<h3 class="hidden">공지사항 목록</h3>
				<table class="table">
					<thead>
						<tr>
							<th class="w60">번호</th>
							<th class="expand">제목</th>
							<th class="w100">작성자</th>
							<th class="w100">작성일</th>
							<th class="w60">조회수</th>
						</tr>
					</thead>
					<tbody>
					
					<c:forEach items="${list}" var="notice">
						<tr>
							<td>${notice.id}</td>
							<td class="title indent text-align-left"><a href="/notice/detail?id=${notice.id}">${notice.title}</a></td>
							<td>${notice.writerId}</td>
							<td>
								${notice.simpledate}		
							</td>
							<td>${notice.hit}</td>
						</tr>
					</c:forEach>
					
					</tbody>
				</table>
			</div>
			<div class="indexer margin-top align-left">
				<a class="btn-text btn-default" href="/notice/write">글쓰기</a>
			</div>
			<div class="indexer margin-top align-right">
				<h3 class="hidden">현재 페이지</h3>
				<div><span class="text-orange text-strong">${page}</span> / ${maxPage} pages</div>
			</div>

			<div class="margin-top align-center pager">	
		
	<div>
		
		
		<span class="btn btn-prev" onclick="alert('이전 페이지가 없습니다.');">이전</span>
		
	</div>
	<ul class="-list- center">
		<c:forEach var="p" begin="1" end="${maxPage}" step="1">
			<li><a class="-text- orange bold" href="?page=${p}" >${p}</a></li>
		</c:forEach>				
	</ul>
	<div>
		
		
			<span class="btn btn-next" onclick="alert('다음 페이지가 없습니다.');">다음</span>
		
	</div>
	
			</div>
		</main>
		
			
		</div>
	</div>

    <!-- ------------------- <footer> --------------------------------------- -->



        <footer id="footer">
        <div class="content-container">
            <h2 id="footer-logo"><img src="/resources/images/logo-footer.png" alt="모임정보"></h2>

            <div id="company-info">
                <dl>
                    <dt>주소:</dt>
                    <dd>세종특별자치시 도움3로 160</dd>
                    <dt>관리자메일:</dt>
                    <dd>thinpig1130@gmail.com</dd>
                </dl>
                <dl>
                    <dt>사업자 등록번호:</dt>
                    <dd>111-11-11111</dd>
                    <dt>비영리 단체:</dt>
                    <dd>세종시마을공동체 143호</dd>
                </dl>
                <dl>
                    <dt>공동체명:</dt>
                    <dd>세종시프로그래머모임</dd>
                    <dt>대표:</dt>
                    <dd>권다애</dd>
                    <dt>전화번호:</dt>
                    <dd>010-4191-####</dd>
                </dl>
                <div id="copyright" class="margin-top">Copyright ⓒ kwonpro.lec 2020-2020 All Right Reserved.
                    Contact thinpig1130@gmail.com for more information</div>
            </div>
        </div>
    </footer>
    </body>
    
    </html>