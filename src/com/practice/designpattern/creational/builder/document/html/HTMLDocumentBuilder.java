package com.practice.designpattern.creational.builder.document.html;

import com.practice.designpattern.creational.builder.document.DocumentBuilder;

public class HTMLDocumentBuilder extends DocumentBuilder {
    HTMLDocument htmlDocument;

    @Override
    public void addTitle(String title) {
        htmlDocument = new HTMLDocument();
//        htmlDocument.title = new Title(title);
    }

    @Override
    public void addBody(String body) {
//        htmlDocument.body = new Body(body);

    }

    @Override
    public void addAuthor(String author) {
//        htmlDocument.author = new Author(author);

    }

    @Override
    public void addConclusion(String conclusion) {
//        htmlD∂ocument.conclusion = new Conclusion(author);
    }

    @Override
    public void addProtocol() {
//        htmlD∂ocument.protocol = new Conclusion(author);

    }

    @Override
    public HTMLDocument buildDocument(){
        return htmlDocument;
    }
}
