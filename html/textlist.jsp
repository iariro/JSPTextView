<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv=Content-Style-Type content=text/css>
		<link media=all href="hatena.css" type=text/css rel=stylesheet>
		<title>テキストビューア</title>
	</head>

	<body>

		<div class=hatena-body>
		<div class=main>
		<div class=day>

		<s:iterator value="folderAndFilesCollection">
			<h1>path=<s:property value="folder" /></h1>

			<s:form action="textview" theme="simple">
				<input type="hidden" name="folder" value="<s:property value="folder" />" />
				<s:select list="files" name="filename" />
				<s:submit />
			</s:form>
		</s:iterator>

		</div>
		</div>
		</div>

	</body>
</html>
