package exception;

public class DiagnosticFaildException extends Exception {
    public DiagnosticFaildException () {
        super("Необходимо указать тип прав!");
    }
}
