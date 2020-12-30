<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${product.productName}</title>
    <style><%@include file="/WEB-INF/css/style.css"%></style>
</head>
<body>
   
    <header>
        <h2>Price Checker</h2>
    </header>

    <main class="container">

        <section class="product row">
            <div class="product__img col_md_6 col_12">
                <div class="img__holder">
                     <img src="${product.a_imgSource}" alt="" width="100%" height="100%">
                </div>
            </div>
            <div class="product__info col_md_6 col_12">
          		<h2>${product.productName}</h2>
                <p>${product.a_description}
                </p>
                <div class="product__info-price">
                <div class="product__seller">
                        <h3 id="seller1Name">Amazon</h3>
                        </div>
                    <div class="product__seller">
                        
                        <p id="seller1price">Original Price = ${product.a_mrp}</p>
                        <p id="seller1offer">Offer Price = ${product.a_offerPrice}</p>
                        <a href="${product.a_source}">
                        <button>Buy Now</button>
                        </a>
                    </div>
                    <div class="product__seller">
                        <h3 id="seller1Name">Flipkart</h3>
                        </div>
                    <div class="product__seller">
                      
                        <p id="seller1price">Original Price = ${product.f_mrp}</p>
                        <p id="seller1offer">Offer Price = ${product.f_offerPrice}</p>
                        <a href="${product.f_source}">
                        <button>Buy Now</button>
                        </a>
                      
                    </div>
                    
                </div>
            </div>

        </section>
    </main>    
  
</body>
</html>