/**
 * Excecao lancada quando ocorre um erro ao comunicar com a API da TVMaze.
 */
public class ApiException extends Exception {

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
