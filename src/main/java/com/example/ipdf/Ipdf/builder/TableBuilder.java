package com.example.ipdf.Ipdf.builder;

import java.util.List;

import com.example.ipdf.Ipdf.config.PdfStyleConfig;
import com.example.ipdf.Ipdf.entity.PdfRequest;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;

public class TableBuilder {
    private TableBuilder() {

    }

    public static void build(
            Document document,
            PdfRequest request) {

        List<String> columns = request.getColumns();
        List<List<String>> rows = request.getRows();

        if (columns == null || columns.isEmpty()) {
            return;
        }

        /*
         * Create table
         */

        Table table = new Table(columns.size());

        table.setWidth(
                UnitValue.createPercentValue(100));

        /*
         * =====================================================
         * TABLE HEADER
         * =====================================================
         */

        for (String column : columns) {

            Paragraph headerText = new Paragraph(column)
                    .setBold()
                    .setFontSize(
                            PdfStyleConfig.TABLE_HEADER_SIZE)
                    .setFontColor(
                            PdfStyleConfig.HEADER_TEXT_COLOR);

            Cell headerCell = new Cell()
                    .add(headerText);

            headerCell
                    .setBackgroundColor(
                            PdfStyleConfig.PRIMARY_COLOR)
                    .setPadding(
                            PdfStyleConfig.CELL_PADDING)
                    .setTextAlignment(
                            TextAlignment.CENTER);

            table.addHeaderCell(headerCell);
        }

        /*
         * =====================================================
         * TABLE BODY
         * =====================================================
         */

        for (int rowIndex = 0; rowIndex < rows.size(); rowIndex++) {

            List<String> row = rows.get(rowIndex);

            for (String value : row) {

                Paragraph cellText = new Paragraph(
                        value == null ? "" : value)
                        .setFontSize(
                                PdfStyleConfig.TABLE_BODY_SIZE)
                        .setFontColor(
                                PdfStyleConfig.TEXT_COLOR);

                Cell cell = new Cell()
                        .add(cellText);

                /*
                 * Alternating row background
                 */

                if (rowIndex % 2 == 0) {

                    cell.setBackgroundColor(
                            PdfStyleConfig.LIGHT_BACKGROUND);
                }

                cell.setPadding(
                        PdfStyleConfig.CELL_PADDING);

                cell.setBorder(
                        new SolidBorder(
                                PdfStyleConfig.BORDER_COLOR,
                                0.5f));

                table.addCell(cell);
            }
        }

        /*
         * Add table to document
         */

        document.add(table);

    }
}
