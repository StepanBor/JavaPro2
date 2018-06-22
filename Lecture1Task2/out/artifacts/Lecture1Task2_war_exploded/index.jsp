<%@ page import="java.io.File" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: borysenko
  Date: 21.06.2018
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Viewer</title>
  </head>
  <body>

  <h1>Enter absolute path to directory</h1>
  <form action="http://localhost:8080/Controler" method="get">
    <label for="folder">Name</label>
    <input type="text" id="folder" name="folder"><br>
    <input type="submit" value="send">
  </form><br>
  <br>
  <table border="1">
    <caption>File list</caption>
    <tr>
      <th>Number</th>
      <th>Name</th>
      <th>Size, Mb</th>
    </tr>
      <%
        if(request.getAttribute("listFile")!=null){
              List<File> lf=(List<File>) request.getAttribute("listFile");
//        Group gr=(Group) request.getAttribute("group");
        for (File file: lf) {
            Long size=file.isDirectory()?0:file.length()/(1024*1024);
//            String name=file.isDirectory()?"<a href=\"Controler?folder="+file.getAbsolutePath()+"\">"+file.getName().substring(file.getName().lastIndexOf("\\")+1)+"</a>":file.getName().substring(file.getName().lastIndexOf("\\")+1);
        out.println("<tr><td>"+lf.indexOf(file)+"</td><td>"+file.getName()+"</td><td>"+size+"</td></tr>");
        }
        }

    %>
  </body>
</html>
