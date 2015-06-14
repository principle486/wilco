<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pagingList.totalCount}" var="totalCount"/>
<c:set value="${pagingList.currentPage}" var="currentPage"/>
<c:set value="${pagingList.rowPerPage}" var="rowPerPage"/>
<c:set value="${pagingList.pagePerPage}" var="pagePerPage"/>
<c:set value="${pagingList.firstPage}" var="firstPage" />
<c:set value="${pagingList.lastPage}" var="lastPage" />
<nav>
    <ul class="pagination">
      <li class="disabled">
      	<a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a>
      </li>
      <li class="active">
      <c:forEach var="pagePerCount" begin="${firstPage}" end="${pagePerPage}" step="1">
		<li>
			<a href="#">${pagePerCount}
				<!-- 현재페이지와 보여주는 페이지 하이라이트 -->
				<c:if test="${pagePerCount eq currentPage}">
					<span class="sr-only">(current)</span>
				</c:if>
			</a>
		</li>
 	 </c:forEach>
     <li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
   </ul>
</nav>
<c:out value="${totalCount}"/>
<c:out value="${currentPage}"/>
<c:out value="${rowPerPage}"/>
<c:out value="${pagePerPage}"/>
<c:out value="${firstPage}"/>
<c:out value="${lastPage}"/>
 