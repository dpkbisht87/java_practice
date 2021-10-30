package com.practice.designpattern.creational.builder.document;

import com.practice.designpattern.creational.builder.document.pdf.PDFDocument;
import com.practice.designpattern.creational.builder.document.pdf.PDFDocumentBuilder;

public class Client {
    public void main(){
        PDFDocumentBuilder pdfDocumentBuilder = new PDFDocumentBuilder();
        Director director = new Director(pdfDocumentBuilder);
        director.construct();
    }
}
