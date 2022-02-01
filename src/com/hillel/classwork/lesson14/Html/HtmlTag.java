package com.hillel.classwork.lesson14.Html;

public class HtmlTag {

    String name;
    String text;
    HtmlTag child;

    public HtmlTag(String name, HtmlTag child) {
        this.name = name;
        this.child = child;
    }

    public HtmlTag(String name, String text) {
        this.name = name;
        this.text = text;
    }
}