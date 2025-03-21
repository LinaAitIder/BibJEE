package controller;

import model.Document;
import model.DocumentDAO;

import java.util.List;


public class DocumentController {
    public static List<Document> getAllDocuments() {
        DocumentDAO dao = new DocumentDAO();
        return dao.getAllDocuments();
    }
}
