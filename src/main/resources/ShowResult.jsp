<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:f="http://xmlns.jcp.org/jsf/core"
      xmlns:a="http://xmlns.jcp.org/jsf/passthrough">
<h:head>
  <title>Result</title>
</h:head>

<h:body>
<Center>
<ui:debug hotkey="x" rendered="#{initParam['javax.faces.FACELETS_DEVELOPMENT']}"/>

<div id="header">
    <ui:insert name="header">
    	
    </ui:insert>
</div>


<div id="content">
  <ui:insert name="content">
<a href="StockScreener.html" ><input type="button" value="screenerCriteria" id="screenerCriteria" /></a>
<h:commandButton type="button" id="searchResult" value="SearchResult" onClick="#{stockscreener.Reload()}"/>
<table border="1">
<tr>
<th>Symbol</th>
<th>Company Name</th>
<th>Open Price</th>
<th>High</th>
<th>Low</th>
<th>ClosePrice</th>
<th>Volume</th>
<th>More</th>
</tr>

<tr>

<td><h:outputTextArea value="#{stock._symbol}"/></td>
<td><h:outputTextArea value="#{stock._symbol}" /></td>
<td><h:outputTextArea value="#{stock._price}" /></td>
<td><h:outputTextArea value="#{stock._change}" /></td>
<td><h:outputTextArea value="#{stock._changePercent}" /></td>
<td><h:outputTextArea value="#{stock._marketCap}" /></td>
<td><h:outputTextArea value="#{stock._closePrice}" /></td>
<td><h:outputTextArea value="#{stock._volume}" /></td>
<td><h:button type="button" outcome="ShowPerformance.jsp" value="More Detail"  />

</td>
</tr>
</table>
    	<!--  include your content file or uncomment the include below and create content.xhtml in this directory -->
	  	<!-- <div> -->
    	<!-- <ui:include src="content.xhtml"/> -->  
    	<!-- </div> -->
  </ui:insert>
</div>

<div id="footer">
  <ui:insert name="footer">

  </ui:insert>
</div>
</Center>
</h:body>

</html>
