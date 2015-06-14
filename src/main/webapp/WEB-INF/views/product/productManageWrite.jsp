<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Wilco Solution Administrator Page</title>

    <!-- Bootstrap core CSS -->
    <link href="/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/bootstrap/docs/examples/jumbotron/jumbotron.css" rel="stylesheet">
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="/bootstrap/docs/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/main.wilco">Wilco Solution</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <form class="navbar-form navbar-right" id="loginForm" name="loginForm" method="post" action="/login/loginProcess.wilco">
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <div class="form-group">
              <input type="text" placeholder="아이디" class="form-control" id="memId" name="memId">
            </div>
            <div class="form-group">
              <input type="password" placeholder="비밀번호" class="form-control" id="memPwd" name="memPwd">
            </div>
            <button type="submit" class="btn btn-success" id="signBtn" name="signBtn">Sign in</button>
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1>Hello, world!</h1>
        <p>This is a template for a simple marketing or informational website. It includes a large callout called a jumbotron and three supporting pieces of content. Use it as a starting point to create something more unique.</p>
        <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more &raquo;</a></p>
      </div>
    </div>

    <div class="container">
	    <form class="form-horizontal" id="writeForm" method="post" action="/company/companyWriteAction.wilco">
	      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	      <input type="hidden" class="form-control" id="cpMngId" name="cpMngId" placeholder="관리번호" value="${newCpMngId}">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">관리번호</label>
		    <div class="col-sm-10">
		      <p class="form-control-static">WILCO-${newCpMngId}</p>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-2 control-label">발주처명</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="cpName" name="cpName" placeholder="발주처명">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">담당자명</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="cpWorkNm" name="cpWorkNm"  placeholder="담당자명">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-2 control-label">담당자사무실번호</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="cpWorkOffice" name="cpWorkOffice" placeholder="담당자사무실번호">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-2 control-label">담당자팩스번호</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="cpWorkFax" name="cpWorkFax" placeholder="담당자팩스번호">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-2 control-label">담당자휴대폰번호</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="cpWorkMobile" name="cpWorkMobile" placeholder="담당자휴대폰번호">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-2 control-label">담당자이메일</label>
		    <div class="col-sm-10">
		      <input type="email" class="form-control" id="cpWorkEmail" name="cpWorkEmail" placeholder="담당자이메일">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-primary">저장</button>
		    </div>
		  </div>
		</form>	
  
      <footer>
        <p>&copy; Company 2015</p>
      </footer>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="/bootstrap/vendors/datatables/js/jquery.dataTables.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="/bootstrap/docs/assets/js/ie10-viewport-bug-workaround.js"></script>
    <script src="/bootstrap/vendors/assets/scripts.js"></script>
    <script src="/bootstrap/vendors/assets/DT_bootstrap.js"></script>
  </body>
</html>
