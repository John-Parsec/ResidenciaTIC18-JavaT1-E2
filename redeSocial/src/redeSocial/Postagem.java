package redeSocial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Postagem {
    private String post;
    private Date dataPostagem;
    private SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
    
    Postagem(String post){
    	super();
        this.post = post;
        this.dataPostagem =  new Date();
    }
    
    Postagem(String post, String dataPostagem){
        super();
        this.post = post;
        
        try {
			this.dataPostagem = this.formato.parse(dataPostagem);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    }
    
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
    
    public Date getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(Date dataPostagem) {
        this.dataPostagem = dataPostagem;
    }
    
    public void setDataPostagem(String dataPostagem) {
        try {
			this.dataPostagem = this.formato.parse(dataPostagem);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    }

    public String toString() {
    	return formato.format(dataPostagem);
    }
}
