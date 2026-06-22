import java.util.Comparator;

public final class SerieComparators {

    private SerieComparators() {
    }

    public enum Criterio {
        ALFABETICA("Ordem alfabética"),
        NOTA("Nota geral"),
        ESTADO("Estado da série"),
        DATA_ESTREIA("Data de estreia");

        private final String descricao;

        Criterio(String descricao) {
            this.descricao = descricao;
        }

        @Override
        public String toString() {
            return descricao;
        }
    }

    /** Ordem alfabética (case-insensitive, nulos por último). */
    public static Comparator<Serie> porNome() {
        return Comparator.comparing(
                s -> s.getNome() == null ? "" : s.getNome().toLowerCase(),
                Comparator.naturalOrder());
    }

    /** Nota geral, da maior para a menor (nulos por último). */
    public static Comparator<Serie> porNota() {
        return (a, b) -> {
            Double na = a.getNotaGeral();
            Double nb = b.getNotaGeral();
            if (na == null && nb == null) return 0;
            if (na == null) return 1;
            if (nb == null) return -1;
            return nb.compareTo(na); // decrescente
        };
    }

    /** Estado da série, agrupando por descrição. */
    public static Comparator<Serie> porEstado() {
        return Comparator.comparing(s -> s.getStatus().getDescricao());
    }

    /** Data de estreia, da mais recente para a mais antiga (nulos por último). */
    public static Comparator<Serie> porDataEstreia() {
        return (a, b) -> {
            String da = a.getDataEstreia();
            String db = b.getDataEstreia();
            if (da == null && db == null) return 0;
            if (da == null) return 1;
            if (db == null) return -1;
            return db.compareTo(da); // datas yyyy-MM-dd comparam corretamente como String
        };
    }

    public static Comparator<Serie> deCriterio(Criterio criterio) {
        switch (criterio) {
            case ALFABETICA:    return porNome();
            case NOTA:          return porNota();
            case ESTADO:        return porEstado();
            case DATA_ESTREIA:  return porDataEstreia();
            default:            return porNome();
        }
    }
}
