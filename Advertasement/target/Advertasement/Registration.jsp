<%--
  Created by IntelliJ IDEA.
  User: SteBor
  Date: 23.06.2018
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create user</h1>
<form action="http://localhost:8080/Controller2" method="get">
    <label for="name">Name</label>
    <input type="text" id="name" name="name"><br>

    <label for="password">Password</label>
    <input type="text" id="password" name="password"><br>

    <label for="message">Message</label><br>

    <textarea name="message" id="message" cols="30" rows="10">Type your message here</textarea><br>
    <input type="submit">


</form>

<table border="1">
    <caption>File list</caption>
    <tr>
        <th>Number</th>
        <th>Message</th>
        <th>UserName</th>
    </tr>
    <%--<%--%>
    <%--if(request.getAttribute("listFile")!=null){--%>
    <%--List<File> lf=(List<File>) request.getAttribute("listFile");--%>
    <%--//        Group gr=(Group) request.getAttribute("group");--%>
    <%--for (File file: lf) {--%>
    <%--Long size=file.isDirectory()?0:file.length()/(1024*1024);--%>
    <%--//            String name=file.isDirectory()?"<a href=\"Controler?folder="+file.getAbsolutePath()+"\">"+file.getName().substring(file.getName().lastIndexOf("\\")+1)+"</a>":file.getName().substring(file.getName().lastIndexOf("\\")+1);--%>
    <%--out.println("<tr><td>"+lf.indexOf(file)+"</td><td>"+file.getName()+"</td><td>"+size+"</td></tr>");--%>
    <%--}--%>
    <%--}--%>

    <%--%>--%>
</body>
</html>
