import java.util.Date;

public class TarefaTest {
	public static void main(String[] args) {
		Tarefa tarefa = new Tarefa();
		
		tarefa.titulo = "Fazer";
		tarefa.descricao = "Algo";
		tarefa.dataPrevisao = new Date();
		
		tarefa.dataPrevisao = DateTimeUtils.toDate(25, 12, 2021);
		
		System.out.println(tarefa.dataPrevisao);
		System.out.println(tarefa.toString());
	}
}
