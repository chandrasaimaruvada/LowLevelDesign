package SOLID.LSP;

public class PdfExporter implements DocumentExporter{
    @Override
    public void export() {
        System.out.println("exports PDF");
    }
}
