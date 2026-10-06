package com.example.ipdf.Ipdf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ipdf.Ipdf.entity.PdfRequest;
import com.example.ipdf.Ipdf.service.PdfService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/pdf")
public class PdfController {
    private final PdfService pdfService;

    public PdfController(PdfService pdfService) {
        this.pdfService = pdfService;

    }

    @PostMapping("/generate")
    public ResponseEntity<byte[]> generatedPdf(@RequestBody PdfRequest request) {
        System.out.println("Request recived");
        byte[] pdf = pdfService.generatePdf(request);

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=invoice.pdf")
                .contentType(MediaType.APPLICATION_PDF).body(pdf);
    }
}
