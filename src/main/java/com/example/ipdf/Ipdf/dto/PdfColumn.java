package com.example.ipdf.Ipdf.dto;

public class PdfColumn {
    private String header;
    private float width;

    public PdfColumn() {
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

}
