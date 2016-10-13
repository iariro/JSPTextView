<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv=Content-Style-Type content=text/css>
		<link media=all href="hatena.css" type=text/css rel=stylesheet>
		<title>収支</title>
	</head>

	<body>
		<h1>収支</h1>
		だめ<br>
		<s:property value="exception" /><br>
		<s:iterator value="exception.stackTrace">
			<s:property /><br>
		</s:iterator>

	</body>
</html>
