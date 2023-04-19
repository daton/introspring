package educarvr.introspring;

public class FTPReader implements Reader{
    private String ftpHost;
    private String ftpPort;
    public FTPReader(String host, String port){

    }

    @Override
    public String leer() {
        return "Leyendo desde un ftp";
    }
}
