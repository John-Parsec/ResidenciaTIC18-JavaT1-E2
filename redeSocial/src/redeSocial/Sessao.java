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
