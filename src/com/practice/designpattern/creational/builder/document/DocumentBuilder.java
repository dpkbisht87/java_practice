package com.practice.designpattern.creational.builder.document;

public abstract class DocumentBuilder {

    public void addTitle(String title) {
    }

    public void addBody(String body) {
    }

    public void addAuthor(String body) {
    }

    public void addConclusion(String conclusion) {
    }

    public void addProtocol() {
    }

    public abstract Document buildDocument();
}
