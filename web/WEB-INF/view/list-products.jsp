<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    response.setCharacterEncoding("UTF-8");
    request.setCharacterEncoding("UTF-8");
%>


<!DOCTYPE html>
<html lang="pl-PL">
    <head>
        <meta charset="UTF-8">
        
        <title>List Products</title>
        
        <link type="text/css"
              rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/style.css" />
        
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h2>DIABETES - Przelicznik Wymienników</h2>
            </div>
        </div>
        
        <div id="container">
            <div id="content">
                
                
                <input type="button" value="Dodaj Produkt" 
                       onclick="window.location.href='showFormForAdd'; return false;"
                       class="add-button"
                />
                
                <table>
                    <tr>
                        <th>Nazwa</th>
                        <th>Kalorie</th>
                        <th>Węglowodany</th>
                        <th>Białka</th>
                        <th>Tłuszcze</th>
                        <th>Kategoria</th>
                        <th>Opcje</th>
                    </tr>
                    
                    <c:forEach var="tempProduct" items="${products}">
                        
                        <c:url var="updateLink" value="/product/showFormForUpdate">
                            <c:param name="productId" value="${tempProduct.id}" />
                        </c:url>
                        
                        <tr>
                            <td>${tempProduct.name}</td>
                            <td>${tempProduct.kcal}</td>
                            <td>${tempProduct.carbohydrates}</td>
                            <td>${tempProduct.protein}</td>
                            <td>${tempProduct.fat}</td>
                            <td>${tempProduct.productType.name}</td>
                            <td><a href="${updateLink}">Aktualizuj</a></td>
                        </tr>
                    </c:forEach>
                        
                    
                </table>
                
            </div>
        </div>
    </body>
</html>
    
