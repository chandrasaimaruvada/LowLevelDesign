package SOLID.LSP;

public class DocumentExportService {

    public void callExporter(DocumentExporter documentExporter){
        documentExporter.export();
    }
}
