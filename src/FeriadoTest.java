public class FeriadoTest {
	public static void main(String[] args) {
		Feriado feriado = new Feriado();
		
		feriado.tipoFeriado = "Nacional";
		feriado.descricao = "Natal";
		
		feriado.data = DateTimeUtils.toDate(25, 12, 2020);
		
		System.out.println(feriado.data);
		System.out.println(feriado.toString());
	}

}
