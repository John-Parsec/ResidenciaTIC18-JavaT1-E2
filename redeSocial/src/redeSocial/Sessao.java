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

	public criarAmizade(Usuario amigo2) {
		if (!this.user.amigos.contains(amigo2)) {
            this.user.adcionaAmigo(amigo2); // Adiciona o usuário atual à lista de amigos do amigo
            amigo2.amigos.adcionaAmigo(this); // Adiciona o usuário atual à lista de amigos do amigo
        }
	}

	public desfazerAmizade(Usuario amigo2) {
		if (this.user.amigos.contains(amigo2)) {
			this.user.removeAmigo(amigo2); // Remove o usuário atual da lista de amigos do amigo
			amigo2.amigos.removeAmigo(this); // Remove o usuário atual da lista de amigos do amigo
		}
	}

	public criarPostagem(String post){
		Postagem postagem = new Postagem();
		postagem.setDataPostagem(new Date());
		postagem.setPost(this.user.getNome() + " postou: " + post);
		this.user.novaPostagem(postagem);
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
