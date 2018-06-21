<%@ page contentType="text/html; encoding=utf-8"%>
<%@ page import="ua.kiev.prog.Messages"%>
<html>
	<body>
		<%! Messages msg = Messages.getInstance(); %>
		<%= msg %>
		<form action="/chat" method="POST">
			<input type="text" name="login" value=""> 
			<input type="text" name="msg">
			<button>Send</button>
		</form>
	</body>
</html>
