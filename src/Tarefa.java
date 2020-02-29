import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Tarefa {
	public static void main(String[] args) {
		
	}
	public String titulo;
	public String descricao;
	public Date   dataPrevisao;
	
    public String toString() {
    	return String.format("título: %s \ndescrição: %s \ndata: %s", titulo, descricao, dataPrevisao);
    }
    
    public long getDias() {
    	LocalDate localDataPrevista = dataPrevisao.toInstant()
    											  .atZone(ZoneId.systemDefault())
    											  .toLocalDate();
    	return LocalDate.now().until(localDataPrevista, ChronoUnit.DAYS);
    }
}
