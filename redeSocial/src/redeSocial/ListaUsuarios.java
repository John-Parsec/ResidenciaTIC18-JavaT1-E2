package redeSocial;

public class ListaUsuarios {
    private List<Usuario> lista = new ArrayList<>();

    public void add(Usuario user) {
        lista.add(user);
    }

    public void remove(Usuario user) {
        lista.remove(user);
    }

    public List<Usuario> getLista() {
        return lista;
    }

    public findUser(Usuario user){
        if(!lista.contains(user)){
            return false;
        } else {
            return true;
        }
    }
}
