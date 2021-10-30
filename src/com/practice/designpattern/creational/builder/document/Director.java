package com.practice.designpattern.creational.builder.document;

public class Director {
    DocumentBuilder documentBuilder;

    public Director(DocumentBuilder documentBuilder){
        this.documentBuilder = documentBuilder;
    }

    public Document construct(){
        documentBuilder.addTitle("Why use design patterns");
        documentBuilder.addBody("blah blah blah... more blah blah blah");
        documentBuilder.addAuthor("C. H. Afzal");
        documentBuilder.addConclusion("Happy Coding!");

        return documentBuilder.buildDocument();
    }
}
