package redeSocial;

import java.util.Date;

public class Sessao {
	private Usuario user;
	private Date dataHoraInicio;
	private Date dataHoraFim;
	
	Sessao(){
		super();
		this.dataHoraInicio = new Date();
	}

    static void logar(Usuario user){
        Sessao sessao = new Sessao();
        sessao.setUser(user);
        user.setSessao(sessao);
    }
    
    void deslogar() {
    	this.dataHoraFim = new Date();
    	user.setSessao(null);
    }

	public void criarAmizade(Usuario amigo2) {
		if (!this.user.getAmigos().contains(amigo2)) {
            this.user.adcionaAmigo(amigo2); // Adiciona o usuário atual à lista de amigos do amigo
            amigo2.adcionaAmigo(this.user); // Adiciona o usuário atual à lista de amigos do amigo
        }
	}

	public void desfazerAmizade(Usuario amigo2) {
		if (this.user.getAmigos().contains(amigo2)) {
			this.user.removeAmigo(amigo2); // Remove o usuário atual da lista de amigos do amigo
			amigo2.removeAmigo(this.user); // Remove o usuário atual da lista de amigos do amigo
		}
	}

	public void criarPostagem(String post){
		Postagem postagem = new Postagem(post);
		postagem.setDataPostagem(new Date());
		this.user.novaPostagem(postagem);
	}

	public void listaPostagens() {
		for (Postagem postagem : this.user.getListaPostagens()) {
			System.out.println(postagem.getPost());
		}
	}

	public Usuario getUser() {
		return user;
	}

	private void setUser(Usuario user) {
		this.user = user;
	}

	public Date getDataHoraInicio() {
		return dataHoraInicio;
	}

	public Date getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
}
