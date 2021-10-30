package com.practice.designpattern.creational.builder.document.pdf;

import com.practice.designpattern.creational.builder.document.DocumentBuilder;
import com.practice.designpattern.creational.builder.document.html.HTMLDocument;

public class PDFDocumentBuilder extends DocumentBuilder {
    PDFDocument pdfDocument;

    @Override
    public void addTitle(String title) {
        pdfDocument = new PDFDocument();
//        pdfDocument.title = new Title(title);
    }

    @Override
    public void addBody(String body) {
//        pdfDocument.body = new Body(body);
    }

    @Override
    public void addAuthor(String author) {
//        pdfDocument.author = new Author(author);
    }
    @Override
    public void addConclusion(String conclusion) {
//        pdfDocument.conclusion = new Conclusion(conclusion);
    }

    @Override
    public PDFDocument buildDocument(){
        return pdfDocument;
    }
}
