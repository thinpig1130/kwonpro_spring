<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<html>
<head>
<title>세종시 프로그래머 온라인 허브</title>
<meta charset="UTF-8">

<link href="/resources/css/member/layout.css" type="text/css"
	rel="stylesheet" />
<style>
#visual .content-container {
	height: inherit;
	display: flex;
	align-items: center;
	background: url("/resources/images/customer/visual.png") no-repeat
		center;
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

					<nav id="acount-menu">
						<h1 class="hidden">회원메뉴</h1>
						<ul>
							<li><a href="/">HOME</a></li>
							<li><a href="/member/login">로그인</a></li>
							<li><a href="/member/agree">회원가입</a></li>
						</ul>
					</nav>

					<nav id="member-menu" class="linear-layout">
						<h1 class="hidden">고객메뉴</h1>
						<ul class="linear-layout">
							<li><a href=""><img
									src="/resources/images/txt-mypage.png" alt="마이페이지" /></a></li>
							<li><a href="/notice"><img
									src="/resources/images/txt-customer.png" alt="고객센터" /></a></li>
						</ul>
					</nav>

				</div>
			</section>

		</div>

	</header>

	<script src="/resources/js/header.js"></script>
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
				<h1>회원가입</h1>

				<nav class="menu text-menu first margin-top">
					<h1>회원메뉴</h1>
					<ul>
						<li><a href="/member/login">로그인</a></li>
						<li><a href="/member/agree">회원가입</a></li>
						<li><a href="">아이디찾기</a></li>
						<li><a href="">비밀번호 재발급</a></li>
					</ul>
				</nav>



				<nav class="menu">
					<h1>협력기관</h1>
					<ul>
						<li><a target="_blank" href="http://www.tjvision.co.kr"><img
								src="/resources/images/tjvision.png" alt="비젼직업전문학교" /></a></li>
						<li><a target="_blank" href="https://www.sejongcommunity.com"><img
								src="/resources/images/sejongcommunity.png" alt="세종시 마을공동체지원센터" /></a></li>

					</ul>
				</nav>

				<!-- <nav class="menu">
					<h1>협찬광고</h1>
					<ul>
		                <li style="width:181px;overflow:hidden;">                            
                                             
		                </li>  
                        <li style="width:181px;overflow:hidden;">                            
                                                
		                </li>
                    </ul>					
				</nav> -->
			</aside>
			<!-- --------------------------- main --------------------------------------- -->




			<main>
				<h2 class="main title">가입확인</h2>

				<div class="breadcrumb" style="margin-top: -20px;">
					<h3 class="hidden">경로</h3>
					<img src="/resources/images/member/step3.png" alt="회원가입 3단계" />
				</div>

				<div class="margin-top first"
					style="background: url('/resources/images/member/bg-login.png') no-repeat center; height: 277px;">
					<div class="text-align-center">
						<img style="margin-left: 170px; margin-top: 70px;"
							alt="뉴렉처의 회원가입이 완료되었습니다."
							src="/resources/images/member/txt-join-welcome.png">
					</div>
					<div class="text-align-center">
						<a class="btn"
							style="margin-left: 170px; margin-top: 50px; display: inline-block; width: 83px; height: 53px; background: url('/resources/images/member/btn-login.png') no-repeat center;"
							href="/member/login">로그인 페이지로 이동합니다.</a>
					</div>
				</div>
			</main>


		</div>
	</div>

	<!-- ------------------- <footer> --------------------------------------- -->



	<footer id="footer">
		<div class="content-container">
			<h2 id="footer-logo">
				<img src="/resources/images/logo-footer.png" alt="모임정보">
			</h2>

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
				<div id="copyright" class="margin-top">Copyright ⓒ kwonpro.lec
					2020-2020 All Right Reserved. Contact thinpig1130@gmail.com for
					more information</div>
			</div>
		</div>
	</footer>
</body>

</html>