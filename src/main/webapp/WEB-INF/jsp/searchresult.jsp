<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;600&display=swap" rel="stylesheet">
    <title>Searching by ${user.get(0).getCategory()}</title>
 <style><%@include file="/WEB-INF/css/style.css"%></style>
</head>
<body>
<%
String name = request.getParameter("nothing");

%>
<!--JSP IF implementation using JSTL core if tag.-->


        <header>

            <h2>Price Checker</h2>
        </header>
        <main>
         <h2>Results under Category ${user.get(0).getCategory()}</h2>
		<c:choose>
    <c:when test="${empty nothing}">

            <section class="products">
             <c:forEach items="${user}" var="temp">
                <div class="products__holder">
                    <div class="products__img">
                        <img src="${temp.f_imgSource}" alt="" width="100%" height="100%">
                    </div>
                    <p></p>
                    <h4>${temp.productName}</h4>
                    <form action="/productinfopage">
                        <input type="text" name="productid" value="${temp.id}"> <br>
                        <input type="submit" value="View Product">
                    </form>
                </div>
                </c:forEach>  
            </section>
		
         </c:when>
    <c:otherwise>
			<p style="padding: 200px 0;color:blue;text-align:center;font-size:46px;">
		      <strong>No Results Found</strong> 
		       
		    </p>
		    </c:otherwise>
</c:choose>
            
            
        </main>    
    <script src="./main.js"></script>
</body>
</html>