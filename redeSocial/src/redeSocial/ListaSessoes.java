package redeSocial;

import java.util.List;

public class ListaSessoes {
    private List<Sessao> listaSessao = new ArrayList<>();

    public void addSessao(Sessao sessao) {
        listaSessao.add(sessao);
    }
    public removeSessao(Sessao sessao) {
        listaSessao.remove(sessao);
    }
    public List<Sessao> getListaSessao() {
        return listaSessao;
    }

}

