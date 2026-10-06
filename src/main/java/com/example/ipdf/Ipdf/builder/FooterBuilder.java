package com.example.ipdf.Ipdf.builder;

import com.example.ipdf.Ipdf.entity.PdfRequest;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class FooterBuilder {

    private FooterBuilder() {

    }

    public static void build(
            Document document, PdfRequest request) {
        document.add(new Paragraph(request.getFooter()).setFontSize(8));
    }

}
