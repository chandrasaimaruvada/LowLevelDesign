package SOLID.LSP;

public class Main {
    public static void main(String[] args) {
        DocumentExportService documentExportService = new DocumentExportService();
        documentExportService.callExporter(new ExcelExporter());
        documentExportService.callExporter(new PdfExporter());
        documentExportService.callExporter(new WordExporter());
        documentExportService.callExporter(new PowerPointExporter());
    }
}
