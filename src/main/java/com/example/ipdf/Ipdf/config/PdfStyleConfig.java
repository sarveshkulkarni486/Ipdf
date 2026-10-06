package com.example.ipdf.Ipdf.config;

import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.colors.DeviceRgb;

public class PdfStyleConfig {

    private PdfStyleConfig() {

    }

    // =========================================================
    // FONT SIZES
    // =========================================================

    public static final float TITLE_SIZE = 18;

    public static final float COMPANY_NAME_SIZE = 14;

    public static final float SECTION_TITLE_SIZE = 10;

    public static final float BODY_SIZE = 9;

    public static final float TABLE_HEADER_SIZE = 9;

    public static final float TABLE_BODY_SIZE = 9;

    public static final float FOOTER_SIZE = 8;

    // =========================================================
    // COLORS
    // =========================================================

    /*
     * Main corporate color.
     */
    public static final Color PRIMARY_COLOR = new DeviceRgb(31, 78, 121);

    /*
     * Light background used for section headings.
     */
    public static final Color SECTION_BACKGROUND = new DeviceRgb(221, 235, 247);

    /*
     * Very light background used for information areas.
     */
    public static final Color LIGHT_BACKGROUND = new DeviceRgb(245, 247, 250);

    /*
     * Table header text.
     */
    public static final Color HEADER_TEXT_COLOR = ColorConstants.WHITE;

    /*
     * Normal text.
     */
    public static final Color TEXT_COLOR = new DeviceRgb(40, 40, 40);

    /*
     * Secondary / less important text.
     */
    public static final Color SECONDARY_TEXT_COLOR = new DeviceRgb(100, 100, 100);

    /*
     * Borders.
     */
    public static final Color BORDER_COLOR = new DeviceRgb(210, 214, 220);

    // =========================================================
    // SPACING
    // =========================================================

    public static final float SECTION_MARGIN_TOP = 12;

    public static final float SECTION_MARGIN_BOTTOM = 6;

    public static final float CELL_PADDING = 6;

    public static final float HEADER_MARGIN_BOTTOM = 15;

}
