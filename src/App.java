import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Holydays listHolydays = new Holydays();
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Buscar um feriado específico");
		System.out.println("2 - Buscar todas as datas de feriados");
		try (Scanner scan = new Scanner(System.in)) {
			int option = scan.nextInt();

			switch (option) {
				case 1:
				  System.out.println("Digite a data (Formato da data: DD/MM/YYYY)");
					String date = scan.next();
					listHolydays.getHolyday(date);
					break;
				
				case 2:
					listHolydays.getAllHolydays();
					break;

				default:
					break;
			}
		}
		
	}
}
