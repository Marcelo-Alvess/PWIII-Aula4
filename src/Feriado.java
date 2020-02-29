import java.util.Date;

public class Feriado {
	public static void main(String[] args) {
	}
	
	public Long   id;
    public String tipoFeriado;
    public String descricao;
    public Date   data;
    
    public String toString() {
    	return String.format("tipo: %s \ndescrição: %s \ndata: %s", tipoFeriado, descricao, data);
    }
}
