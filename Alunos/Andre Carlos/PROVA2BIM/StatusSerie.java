public enum StatusSerie {

    EM_TRANSMISSAO("Em transmissao"),
    CONCLUIDA("Concluida"),
    CANCELADA("Cancelada"),
    DESCONHECIDO("Desconhecido");

    private final String descricao;

    StatusSerie(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    /**
     * Converte o status textual da API TVMaze para o enum interno.
     */
    public static StatusSerie fromApi(String apiStatus) {
        if (apiStatus == null) {
            return DESCONHECIDO;
        }
        switch (apiStatus.trim().toLowerCase()) {
            case "running":
                return EM_TRANSMISSAO;
            case "ended":
                return CONCLUIDA;
            default:
                return DESCONHECIDO;
        }
    }

    @Override
    public String toString() {
        return descricao;
    }
}
