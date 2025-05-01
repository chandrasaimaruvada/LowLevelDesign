package SOLID.LSP;

public class ExcelExporter implements DocumentExporter{
    @Override
    public void export() {
        System.out.println("exports Excel");
    }
}
