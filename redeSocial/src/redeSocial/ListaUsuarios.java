package redeSocial;

import java.util.ArrayList;

public class ListaUsuarios {
    private ArrayList<Usuario> lista = new ArrayList<Usuario>();

    public void criarUsuario(Usuario user) {
        lista.add(user);
    }
    
    public void removerUsuario(Usuario user) {
        lista.remove(user);
    }

    public ArrayList<Usuario> getUsers() {
        return lista;
    }

    public boolean containsUser(Usuario user){
        return lista.contains(user);
    }
}
