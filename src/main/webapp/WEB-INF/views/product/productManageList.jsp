<%@page import="com.wilco.manage.global.paging.Paging"%>
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
    	<div class="table-responsive">
    	<form id="manageForm" method="post">
    	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    	<input type="hidden" id="pdMngId" name="pdMngId" value="" />
		  <table class="table table-hover">
		    <thead>
		    <tr>
            <th>#</th>
            <th>순번</th>
            <th>Type</th>
            <th>Paint</th>
            <th>..</th>
            <th>..</th>
            <th>..</th>
            </tr>
          	<tbody>
	         <c:forEach items="${pagingList.list}" var="productList" varStatus="pdIdx">
	               <tr onclick="javascript:goDetail('${productList.cpMngId}')">
		          	<th scope="row"><input type="checkbox" id="pdMngIds" name="pdMngIds" value="${productList.pdMngId}"/></th> 
		            <td>${pdIdx.count}</td>
		            <td><c:out value="${productList.pdType}"/></td>
		            <td><c:out value="${productList.pdPaint}"/></td>
		            <td></td>
		            <td></td>
		            <td></td>
		          </tr> 
		      </c:forEach>
       		 </tbody>
       	  </table>
    	  </form>
    	  
    	  <!-- paging -->
    	  <jsp:include page="../common/paging.jsp" />
    	  <!-- /paging -->
    	  
    	  <div class="pull-right"> 	  
    	  	<button type="button" id="write" name="write"  class="btn btn-primary" >신규</button>
  			<button type="button" id="delete" name="delete" class="btn btn-default">삭제</button>
		</div>
  		</div>
  		<hr>
 		
 		<!-- footer -->
      	<jsp:include page="../common/footer.jsp" />
		<!-- /footer -->

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
    
    <script type="text/javascript">
    var manageForm = $("#manageForm");	
    	$(function(){
    		
	    	/** write  **/
	    	$("#write").click(function(){
	    		manageForm.prop("action" , "/product/productManageWrite.wilco").submit();
	    	});	
	    	
	    	$("#delete").click(function(){
	    		manageForm.prop("action" , "/product/productDeleteAction.wilco").submit();
	    	});
	    	
   		});
    	
    	var goDetail = function(cpMngId){
    		$("#cpMngId").val(cpMngId);
    		manageForm.prop("action" , "/product/productManageDetail.wilco").submit();
    	}
    	
    </script> 
  </body>
</html>
