package redeSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private int id;
    private String nome;
    private String email;
    private String senha;
    private Sessao sessao;
    private List<Postagem> listaPostagens;
    private List<Usuario> amigos;
    
    public Usuario(String nome, String email, String senha) {
    	this.id = id++;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaPostagens = new ArrayList<>();
    }    
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }    
    
    public void novaPostagem(Postagem postagem) {
        listaPostagens.add(postagem);
    }

    public void novaPostagem(String postagem) {
        listaPostagens.add(new Postagem(postagem));
    }
    
    public List<Postagem> getListaPostagens() {
        return listaPostagens;
    }
    
    public List<Usuario> getAmigos() {
		return amigos;
	}

	public void adcionaAmigo(Usuario user) {
		amigos.add(user);
	}
	
	public void removeAmigo(Usuario user) {
		amigos.remove(user);
	} 
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

	public void logar() {
		Sessao.logar(this);
	}
	
	public void deslogar() {
		sessao.deslogar();
	}
}
