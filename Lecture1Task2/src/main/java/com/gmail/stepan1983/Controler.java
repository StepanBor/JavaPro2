package com.gmail.stepan1983;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class Controler extends javax.servlet.http.HttpServlet {
//    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//
//    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        FileModel fm=new FileModel();

        File filFolder=new File(request.getParameter("folder"));
        if(filFolder!=null) {
            if (filFolder.isDirectory()) {
                List<File> lf = fm.getFileList(filFolder);
                request.setAttribute("listFile", lf);
            } else {
                String message = request.getParameter("folder") + "is not dirrectory";
                request.setAttribute("listFile", message);
            }

            request.getRequestDispatcher("index.jsp").forward(request, response);

        }
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
