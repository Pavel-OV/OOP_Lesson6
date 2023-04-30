package solid;

import solid.dip.PrintReport;
import solid.dip.Report;
import solid.dip.Reportable;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        report.output(new PrintReport() );
    }
}
