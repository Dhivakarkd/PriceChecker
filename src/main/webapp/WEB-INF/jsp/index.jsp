<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;600&display=swap" rel="stylesheet">
    <title>Price Checker</title>
<style><%@include file="/WEB-INF/css/style.css"%></style>
</head>
<body>
    <header>
        <h2>Price Checker</h2>
        </header>
        <main class="container">
            <section class="itemSearcher">
                <form action="/search">
                    <input type="text" name="searchItem" placeholder="Search for product name" id="itemSearcher">
                    <button type="submit" class="form__submit">
                        <svg x="0px" y="0px" viewBox="0 0 513.28 513.28" width="20" height="20" style="enable-background:new 0 0 513.28 513.28;" xml:space="preserve">
                            <g>
                                <g>
                                    <path fill="white" d="M495.04,404.48L410.56,320c15.36-30.72,25.6-66.56,25.6-102.4C436.16,97.28,338.88,0,218.56,0S0.96,97.28,0.96,217.6
                                        s97.28,217.6,217.6,217.6c35.84,0,71.68-10.24,102.4-25.6l84.48,84.48c25.6,25.6,64,25.6,89.6,0
                                        C518.08,468.48,518.08,430.08,495.04,404.48z M218.56,384c-92.16,0-166.4-74.24-166.4-166.4S126.4,51.2,218.56,51.2
                                        s166.4,74.24,166.4,166.4S310.72,384,218.56,384z"/>
                                </g>
                            </g>
                            </svg>
                    </button>
                </form>
            </section>
            
            <!-- Remove category part if not part of design--->
            <section class="categories">
                <div class="categories__holder">
                	<form action="/search">
                        <input type="text" name="searchItem" value="tv"> 
                        <input type="submit" value="Television">
                    </form>
               
                   
                </div>
                <div class="categories__holder">
                <form action="/search">
                        <input type="text" name="searchItem" value="washingmachine"> 
                        <input type="submit" value="Washing Machine">
                    </form>
                  
                </div>
                <div class="categories__holder">
                <form action="/search">
                        <input type="text" name="searchItem" value="ac"> 
                        <input type="submit" value="Air conditioner">
                    </form>
                   
                </div>
                <div class="categories__holder">
                 <form action="/search">
                        <input type="text" name="searchItem" value="bag"> 
                        <input type="submit" value="Bags">
                    </form>
                    
                </div>
                <div class="categories__holder">
                 <form action="/search">
                        <input type="text" name="searchItem" value="pendrive"> 
                        <input type="submit" value="Pen drives">
                    </form>
                  
                </div>
                <div class="categories__holder">
                 <form action="/search">
                        <input type="text" name="searchItem" value="headset"> 
                        <input type="submit" value="Headsets">
                    </form>
                    
                </div>
                <div class="categories__holder">
                 <form action="/search">
                        <input type="text" name="searchItem" value="speaker"> 
                        <input type="submit" value="Bluetooth Speakers">
                    </form>
                
                </div>
                <div class="categories__holder">
                 <form action="/search">
                        <input type="text" name="searchItem" value="smartphone"> 
                        <input type="submit" value="Smart Phone">
                    </form>
                  
                </div>
            </section>

        </main>    
  
</body>
</html>