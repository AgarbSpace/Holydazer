import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Holydays {
	private List<Holyday> listHolydays = new ArrayList<>();

	public Holydays() {
		Holyday holyday = new Holyday("Confraternização Mundial", "01/01/2023");
		listHolydays.add(holyday);
		holyday = new Holyday("Carnaval", "21/02/2023");
		listHolydays.add(holyday);
		holyday = new Holyday("Páscoa", "17/04/2023");
		listHolydays.add(holyday);
		holyday = new Holyday("Tiradentes", "21/04/2023");
		listHolydays.add(holyday);
		holyday = new Holyday("Dia do Trabalho", "01/05/2023");
		listHolydays.add(holyday);
		holyday = new Holyday("Corpus Christi", "08/06/2023");
		listHolydays.add(holyday);
		holyday = new Holyday("Independência do Brasil", "07/09/2023");
		listHolydays.add(holyday);
		holyday = new Holyday("Nossa Senhora Aparecida", "12/10/2023");
		listHolydays.add(holyday);
		holyday = new Holyday("Finados", "02/11/2023");
		listHolydays.add(holyday);
		holyday = new Holyday("Proclamação da República", "15/11/2023");
		listHolydays.add(holyday);
		holyday = new Holyday("Natal", "25/12/2023");
		listHolydays.add(holyday);
	}

	public void getAllHolydays() {
		for (int i = 0; i < listHolydays.size(); i++) {
			System.out.println(listHolydays.get(i).getDate() + " => " + listHolydays.get(i).getName());
		}
	}

	public void getHolyday(String date) {
		
		for (int i = 0; i < listHolydays.size(); i++) {
			if(Objects.equals(listHolydays.get(i).getDate(), date)){
				System.out.println(listHolydays.get(i).getName());
				return;
			}
		}

		System.out.println("Não existe feriado com esta data!");
		
	}
}
