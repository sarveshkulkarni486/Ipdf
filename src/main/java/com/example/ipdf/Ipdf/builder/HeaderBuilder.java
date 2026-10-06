package com.example.ipdf.Ipdf.builder;

import com.example.ipdf.Ipdf.config.PdfStyleConfig;
import com.example.ipdf.Ipdf.entity.PdfRequest;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;

public class HeaderBuilder {
    private HeaderBuilder() {
    }

    public static void build(
            Document document,
            PdfRequest request) {

        /*
         * Main header table
         *
         * Left side -> Company information
         * Right side -> Document information
         */
        Table headerTable = new Table(2);

        headerTable.setWidth(UnitValue.createPercentValue(100));

        /*
         * ------------------------------------------------
         * COMPANY INFORMATION
         * ------------------------------------------------
         */

        Paragraph companyName = new Paragraph(request.getCompanyName())
                .setBold()
                .setFontSize(PdfStyleConfig.COMPANY_NAME_SIZE);

        Paragraph companyAddress = new Paragraph(request.getCompanyAddress())
                .setFontSize(PdfStyleConfig.BODY_SIZE);

        Paragraph companyEmail = new Paragraph(request.getCompanyEmail())
                .setFontSize(PdfStyleConfig.BODY_SIZE);

        Paragraph companyPhone = new Paragraph(request.getCompanyPhone())
                .setFontSize(PdfStyleConfig.BODY_SIZE);

        Cell companyCell = new Cell();

        companyCell
                .add(companyName)
                .add(companyAddress)
                .add(companyEmail)
                .add(companyPhone);

        companyCell.setBorder(null);

        /*
         * ------------------------------------------------
         * DOCUMENT INFORMATION
         * ------------------------------------------------
         */

        Paragraph documentTitle = new Paragraph(request.getTitle())
                .setBold()
                .setFontSize(PdfStyleConfig.TITLE_SIZE)
                .setTextAlignment(TextAlignment.RIGHT);

        Paragraph documentNumber = new Paragraph(
                "Document No: "
                        + request.getDocumentNumber())
                .setFontSize(PdfStyleConfig.BODY_SIZE)
                .setTextAlignment(TextAlignment.RIGHT);

        Paragraph documentDate = new Paragraph(
                "Date: "
                        + request.getDocumentDate())
                .setFontSize(PdfStyleConfig.BODY_SIZE)
                .setTextAlignment(TextAlignment.RIGHT);

        Cell documentCell = new Cell();

        documentCell
                .add(documentTitle)
                .add(documentNumber)
                .add(documentDate);

        documentCell.setBorder(null);

        /*
         * Add both cells to the header table
         */

        headerTable.addCell(companyCell);
        headerTable.addCell(documentCell);

        /*
         * Add header to PDF
         */

        document.add(headerTable);

        /*
         * Add spacing after header
         */

        document.add(
                new Paragraph(" ")
                        .setMarginBottom(5));
    }

}
