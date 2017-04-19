<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
 xmlns:h="http://xmlns.jcp.org/jsf/html"
xmlns:f="http://xmlns.jcp.org/jsf/core"
xmlns:a="http://xmlns.jcp.org/jsf/passthrough">
<h:head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</h:head>
<h:body>
<div id="header">
    <ui:insert name="header">
 <CENTER><h1>Stock Screener</h1></CENTER>
    
    	<!--  include your header file or uncomment the include below and create header.xhtml in this directory -->
    	<!-- <ui:include src="header.xhtml"/> -->
    </ui:insert>
</div>
<CENTER>
<div id="content">
  <ui:insert name="content">

 <h:commandButton  value="screenerCriteria" id="screenerCriteria" action="#{stockScreener.Reload()}" />
 <h:button outcome="ShowResult.jsp" onclick="#{stock.Display()}" id="searchResult" value="SearchResult" />
  <table class="type00">
	<tr>
		<th scope="row">
	     </th>
		<td>
		<h:selectOneMenu>
  <f:selectItem id="perset" value="Perset Screen"></f:selectItem>
 <!--option value="strong">Strong Forecasted Growth</option>
  <option value="small">Small Cap Value</option>
  <option value="mid">Mid Cap Value</option>
   <option value="large">Large Cap Value</option>
  <option value="scgrpwth">Small Cap Growth</option>
  <option value="mcg">Mid  Cap Growth</option>
  <option value="lcg">Large Cap Growth</option>
   <option value="scm">Small Cap Momentum</option>
  <option value="mcm">Mid Cap Momentum</option>
  <option value="lcm">Large Cap Momentum</option>
  <option value="dpd">Dogs of Dow</option>
   <option value="bf">Bottom Fishing</option>
  <option value="lsr">Large Sales Revenue</option>
  <option value="hv">High Volume</option>
  <option value="lmc">Largest Market Cap</option>-->
</h:selectOneMenu>
</td> 
</tr>
</table>
    	<table class="type01" border="1">
		<tr>
		<td>Criteria</td>
		<td>Condition</td>
		<td>Value</td>
		</tr>
       
	<tr id="deleterow1">
		<td>
		<h:selectOneMenu id="selection1cri"size = 3>
            <f:selectItems value="Descriptive"></f:selectItems>
            <f:selectItems id="ex1" value="#{csvfilereader._kindOfCriteria}" >Exchange</f:selectItems>
            <f:selectItems id="gi1" value="#{csvfilereader._kindOfCriteria}">GICS</f:selectItems>
           
        </h:selectOneMenu>
		</td>
	
			<td>
			<h:selectOneMenu id="selection1con" size = 2>
            <f:selectItems id="condition1Eq" value="#{csvfilereader._condition }" >=</f:selectItems>
            <f:selectItems id="condition1No" value="#{csvfilereader._condition }">Not=</f:selectItems>
             </h:selectOneMenu>
             </td>
				<td>
				<h:selectOneMenu id="selection1val" size = 2>
             <f:selectItems id="na2" value="#{csvfilereader._kindOfValue}">NASDAQ</f:selectItems>
             <f:selectItems id="ny2" value="#{csvfilereader._kindOfValue}">New York Stock Exchange</f:selectItems>
             </h:selectOneMenu>
             </td>
	       </tr>
     		
	
	<tr id="deleterow2">	

		<td>
			<h:selectOneMenu id="selection2cri" size = 3>
              <f:selectItems value="Descriptive"></f:selectItems>
            <f:selectItems id="ex2" value="#{csvfilereader._kindOfCriteria2 }">Exchange</f:selectItems>
            <f:selectItems id="gi1" value="#{csvfilereader._kindOfCriteria2 }">GICS</f:selectItems>
        
          </h:selectOneMenu>
		</td>
			<td>
				<h:selectOneMenu id="selection2con" size = 2>
            <f:selectItem id="condition2Eq" value="#{csvfilereader._condition2 }">=</f:selectItem>
            <f:selectItem id="condition2No" value="#{csvfilereader._condition2 }">Not=</f:selectItem>
             </h:selectOneMenu>
             </td>
				<td>
				<h:selectOneMenu id="selection2val2" size=2>
           <f:selectItem id="na2" value="#{csvfilereader._kindOfValue2 }">NASDAQ</f:selectItem>
            <f:selectItem id="ny2" value="#{csvfilereader._kindOfCriteria2 }">New York Stock Exchange</f:selectItem>
             </h:selectOneMenu>
             </td>			
	</tr>
	
	<tr id="deleterow3">
	
		
		<td>
		<h:selectOneMenu id="selection3cri" size=3>
             <f:selectItem value="Descriptive"></f:selectItem>
            <f:selectItem  id="mc3" value="#{csvfilereader._kindOfCriteria3}">MarketCap</f:selectItem>
       <f:selectItem id="cp3" value="#{csvfilereader._kindOfCriteria3 }">ClosePrice</f:selectItem>
          </h:selectOneMenu >
		</td>
			<td>
				<h:selectOneMenu id="selection3con" size=3>
	        <f:selectItem id="bt3" value="Between">Between</f:selectItem>
            <f:selectItem id="ge3"  value="#{csvfilereader._condition3} }">>=</f:selectItem>
            <f:selectItem id="le3" value="#{csvfilereader._condition3} }"><=</f:selectItem >
             </h:selectOneMenu>
             </td>
           
				<td>
			<h:selectOneMenu id="selection3val1" value="#{csvfilereader.choose }" size=16>
           <f:selectItem id="closePriceOne1" value="#{csvfilereader.values}"></f:selectItem>
          <!--<f:selectItem id="closePriceOne2" value="#{csvfilereader._condition3 }"></f:selectItem>
           <f:selectItem id="closePriceOne3" value="#{csvfilereader._condition3 }"></f:selectItem >
            <f:selectItem  id="closePriceOne4" value="#{csvfilereader._condition3 }"></f:selectItem >
             <f:selectItem  id="closePriceOne5" value="#{csvfilereader._condition3 }"></f:selectItem >
            <f:selectItem  id="closePriceOne6" value="#{csvfilereader._condition3 }"></f:selectItem >
              <f:selectItem  id="closePriceOne7" value="#{csvfilereader._condition3 }"></f:selectItem >
            <f:selectItem  id="closePriceOne8" value="#{csvfilereader._condition3 }"></f:selectItem >
             <f:selectItem  id="closePriceOne9" value="#{csvfilereader._condition3 }"></f:selectItem >
            <f:selectItem  id="closePriceOne10" value="#{csvfilereader._condition3 }"></f:selectItem >
              <f:selectItem  id="closePriceOne11" value="#{csvfilereader._condition3 }"></f:selectItem >
            <f:selectItem  id="closePriceOne12" value="#{csvfilereader._condition3 }"></f:selectItem >
             <f:selectItem  id="closePriceOne13" value="#{csvfilereader._condition3 }"></f:selectItem >
            <f:selectItem  id="closePriceOne14" value="#{csvfilereader._condition3 }"></f:selectItem >
              <f:selectItem  id="closePriceOne15" value="#{csvfilereader._condition3 }"></f:selectItem >
            <f:selectItem  id="closePriceOne16" value="#{csvfilereader._condition3}"></f:selectItem >  --> 
            
             </h:selectOneMenu>
             <h:selectOneMenu id="selection3val2"  value="#{csvfilereader.choose }" size = 16>
              <f:selectItem  id="closePriceTwo1" value="#{csvfilereader.values}"></f:selectItem >
       <!-- <f:selectItem  id="closePriceTwo1" value="0"></f:selectItem >
            <f:selectItem  id="closePriceTwo2" value="100m"></f:selectItem >
              <f:selectItem  id="closePriceTwo3" value="250m"></f:selectItem >
            <f:selectItem  id="closePriceTwo4" value="500m"></f:selectItem >
             <f:selectItem  id="closePriceTwo5" value="1b"></f:selectItem >
            <f:selectItem id="closePriceTwo6" value="2b"></f:selectItem >
             <f:selectItem  id="closePriceTwo7" value="3b"></f:selectItem >
            <f:selectItem  id="closePriceTwo8" value="4b"></f:selectItem >
             <f:selectItem  id="closePriceTwo9" value="5b"></f:selectItem>
            <f:selectItem id="closePriceTwo10" value="10b"></f:selectItem>
              <f:selectItem id="closePriceTwo11" value="15b"></f:selectItem>
            <f:selectItem id="closePriceTwo12" value="25b"></f:selectItem>
             <f:selectItem id="closePriceTwo13" value="50b"></f:selectItem>
            <f:selectItem id="closePriceTwo14" value="75b"></f:selectItem>
              <f:selectItem id="closePriceTwo15" value="100b"></f:selectItem>
            <f:selectItem id="closePriceTwo16" value="200b"></f:selectItem> --> 
             </h:selectOneMenu>
             </td>
					
	</tr>
	
	<tr id="deleterow4">
	
		
		<td>
		<h:selectOneMenu id="selection4cri"   size = 3>
                <f:selectItem value="Descriptive"></f:selectItem>      
            <f:selectItem id="mc4" value="MarketCap"></f:selectItem>
         
            <f:selectItem id="cp4" value="ClosePrice"></f:selectItem>
          </h:selectOneMenu>
		</td>
			<td>
	  	<h:selectOneMenu id="selection4con" size =3>
            <f:selectItem id="bt4" value="Between"></f:selectItem>
            <f:selectItem id="ge4" value=">="></f:selectItem>
            <f:selectItem id="le4" value="<="></f:selectItem>
             </h:selectOneMenu>
             </td>
				<td>
	        <h:selectOneMenu id="selection4val1" value="#{csvfilereader.choose }" size = 16>
	        <f:selectItem id="closePriceThree1" value="#{csvfilereader.values}"></f:selectItem>
	       
           <!-- <f:selectItem id="closePriceThree1" value="0"></f:selectItem>
            <f:selectItem id="closePriceThree2" value="100m"></f:selectItem>
              <f:selectItem id="closePriceThree3" value="250m"></f:selectItem>
            <f:selectItem id="closePriceThree4" value="500m"></f:selectItem>
             <f:selectItem id="closePriceThree5" value="1b"></f:selectItem>
            <f:selectItem id="closePriceThree6" value="2b"></f:selectItem>
              <f:selectItem id="closePriceThree7" value="3b"></f:selectItem>
            <f:selectItem id="closePriceThree8" value="4b"></f:selectItem>
             <f:selectItem id="closePriceThree9" value="5b"></f:selectItem>
            <f:selectItem id="closePriceThree10" value="10b"></f:selectItem>
              <f:selectItem id="closePriceThree11" value="15b"></f:selectItem>
            <f:selectItem id="closePriceThree12" value="25b"></f:selectItem>
             <f:selectItem id="closePriceThree13" value="50b"></f:selectItem>
            <f:selectItem id="closePriceThree14" value="75b"></f:selectItem>
              <f:selectItem id="closePriceThree15" value="100b"></f:selectItem>
            <f:selectItem id="closePriceThree16" value="200b"></f:selectItem>-->
             </h:selectOneMenu>
             
             <h:selectOneMenu id="selection4val1" value="#{csvfilereader.choose }" size = 16>
             <f:selectItem id="closePriceFour1"  value="#{csvfilereader.values}"></f:selectItem>
     <!--  <f:selectItem id="closePriceFour1" value="0m"></f:selectItem>
            <f:selectItem id="closePriceFour2" value="100m"></f:selectItem>
              <f:selectItem id="closePriceFour3" value="250m"></f:selectItem>
            <f:selectItem id="closePriceFour4" value="500m"></f:selectItem>
             <f:selectItem id="closePriceFour5" value="1b"></f:selectItem>
            <f:selectItem id="closePriceFour6" value="2b"></f:selectItem>
              <f:selectItem id="closePriceFour7" value="3b"></f:selectItem>
            <f:selectItem id="closePriceFour8" value="4b"></f:selectItem>
             <f:selectItem id="closePriceFour9" value="5b"></f:selectItem>
            <f:selectItem id="closePriceFour10" value="10b"></f:selectItem>
              <f:selectItem id="closePriceFour11" value="15b"></f:selectItem>
            <f:selectItem id="closePriceFour12" value="25b"></f:selectItem>
             <f:selectItem id="closePriceFour13" value="50b"></f:selectItem>
            <f:selectItem id="closePriceFour14" value="75b"></f:selectItem>
             <f:selectItem id="closePriceFour15" value="100b"></f:selectItem>
            <f:selectItem id="closePriceFour16" value="200b"></f:selectItem>-->
             </h:selectOneMenu>
             </td>					
	</tr>
	
	
	</table>
	<table>
	<tr>

	<td>
	<h:button  action="#{stock.Display()}"  outcome="ShowResult.jsp" value="Run Server" id="runBTN" />
	</td>
	</tr>
	</table>

    	<!--  include your content file or uncomment the include below and create content.xhtml in this directory -->
	  	<!-- <div> -->
    	<!-- <ui:include src="content.xhtml"/> -->  
    	<!-- </div> -->
  </ui:insert>
</div>
</CENTER>
<div id="footer">
  <ui:insert name="footer">
    <h4>COMP303-JavaEEProject</h4>
    	<!--  include your header file or uncomment the include below and create footer.xhtml in this directory -->
		<!--<ui:include src="footer.xhtml"/>  -->
  </ui:insert>
 </div>
</h:body>
</html>