package com.example.cah_ngganteng.BarcodeTest;

/**
 * Created by cah_Ngganteng on 10/15/2017.
 */

public final class IntentResult {
    private final String contents;
    private final String formatName;

    IntentResult(String contents, String formatName) {
        this.contents = contents;
        this.formatName = formatName;
    }

    /**
     * @return raw content of barcode
     */
    public String getContents() {
        return contents;
    }

    /**
     * @return name of format, like "QR_CODE", "UPC_A". See <code>BarcodeFormat</code> for more format names.
     */
    public String getFormatName() {
        return formatName;
    }
}
