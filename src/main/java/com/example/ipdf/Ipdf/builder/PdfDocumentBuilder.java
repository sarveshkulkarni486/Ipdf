package com.example.ipdf.Ipdf.builder;

import java.io.ByteArrayOutputStream;

import com.example.ipdf.Ipdf.entity.PdfRequest;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class PdfDocumentBuilder {
    private PdfDocumentBuilder() {

    }

    public static byte[] build(PdfRequest request) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PdfWriter writer = new PdfWriter(outputStream);

            PdfDocument pdfDocument = new PdfDocument(writer);

            Document document = new Document(pdfDocument);

            // Header
            HeaderBuilder.build(document, request);

            // Customer
            document.add(new Paragraph("Customer Details").setBold());

            document.add(new Paragraph(request.getCustomerName()));

            document.add(
                    new com.itextpdf.layout.element.Paragraph(
                            request.getCustomerEmail()));

            document.add(
                    new com.itextpdf.layout.element.Paragraph(
                            request.getCustomerAddress()));

            // TABLE
            TableBuilder.build(
                    document,
                    request);

            // Footer
            FooterBuilder.build(
                    document,
                    request);

            document.close();

            return outputStream.toByteArray();

        } catch (Exception e) {
            throw new RuntimeException("Error generating PDF", e);
        }

    }

}
