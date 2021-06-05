package app.ito.poo;
import clases.ito.poo.Transporte;
import clases.ito.poo.Viaje;
import java.time.LocalDate;

public class MyApp {
	
	static void run() {
		Transporte t1 = new Transporte("Carga", "rtx", 30, LocalDate.of(2021, 01, 12));
		System.out.println(t1);
		System.out.println();
		Viaje v1 = new Viaje("Guadalajara","Jalisco",
				LocalDate.of(2021, 1, 4), LocalDate.of(2021, 1, 10), "mercancia", 40000);
		Viaje v2 = new Viaje("Veracruz","Cordoba",
				LocalDate.of(2021, 04, 24), LocalDate.of(2021, 05, 26), "piedra", 86600);
		t1.addViaje(v1);
		t1.addViaje(v2);
		System.out.println(t1);
		t1.elimViaje(v1);
		System.out.println();
		System.out.println(t1);
		} 

	public static void main(String[] args) {
		run();
	}

}

