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
        
        <title>Dodawanie Produktu</title>
        
        <link type="text/css"
              rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/style.css" />
        
        <link type="text/css"
              rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />
        
    </head>
    
    <body>
        <div id="wrapper">
            <div id="header">
                <h2>DIABETES - Przelicznik Wymienników</h2>
            </div>
        </div>
        
        <div id="container">
            <h3>Zapisz Produkt</h3>
            
            <form:form action="saveProduct" modelAttribute="product" method="POST">
                <table>
                    <tbody>
                        <tr>
                            <td><label>Nazwa:</label></td>
                            <td><form:input path="name" /></td>
                        </tr>
                        
                        <tr>
                            <td><label>Kcal:</label></td>
                            <td><form:input path="kcal" /></td>
                        </tr>
                        
                        <tr>
                            <td><label>Węglowodany:</label></td>
                            <td><form:input path="carbohydrates" /></td>
                        </tr>
                        
                        <tr>
                            <td><label>Białka:</label></td>
                            <td><form:input path="protein" /></td>
                        </tr>
                        
                        <tr>
                            <td><label>Tłuszcze:</label></td>
                            <td><form:input path="fat" /></td>
                        </tr>
                        
                        <tr>
                            <td><label>Typ Produktu:</label></td>
                            <td><form:input path="productType" /></td>
                        </tr>
                        
                        <tr>
                            <td><label></label></td>
                            <td><input type="submit" value="Zapisz" class="save" /></td>
                        </tr>
                        
                    </tbody>
                </table>
                
            </form:form>
            
            <div style="clear: both;"></div>
            
            <p>
                <a href="${pageContext.request.contextPath}/product/list">Powrót do Listy</a>
            </p>
            
        </div>
    </body>
</html>
