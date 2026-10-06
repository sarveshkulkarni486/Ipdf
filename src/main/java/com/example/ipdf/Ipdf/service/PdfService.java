package com.example.ipdf.Ipdf.service;

import java.io.ByteArrayOutputStream;

import org.springframework.stereotype.Service;

import com.example.ipdf.Ipdf.builder.PdfDocumentBuilder;
import com.example.ipdf.Ipdf.dto.ItemRequest;
import com.example.ipdf.Ipdf.entity.PdfRequest;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

@Service
public class PdfService {

    public byte[] generatePdf(PdfRequest pdfRequest) {

        return PdfDocumentBuilder.build(pdfRequest);

    }

}
