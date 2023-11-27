package redeSocial;

import java.util.ArrayList;

public class ListaSessoes {
    private ArrayList<Sessao> listaSessao = new ArrayList<>();

    public void addSessao(Sessao sessao) {
        listaSessao.add(sessao);
    }
    public void removeSessao(Sessao sessao) {
        listaSessao.remove(sessao);
    }
    public ArrayList<Sessao> getListaSessao() {
        return listaSessao;
    }

}

