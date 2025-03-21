package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Document;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class DocumentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public DocumentServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String action=request.getParameter("action");
       if(action.equals("list")){
           PrintWriter out = response.getWriter();
           response.setContentType("application/json");
           response.setCharacterEncoding("UTF-8");
           List<Document> documentList = new ArrayList<>();
           documentList = DocumentController.getAllDocuments();
           for (Document document : documentList) {
               out.println(document.getTitle());
               out.println(document.getDateCrea());
           }
           out.flush();
       }


    }

}
