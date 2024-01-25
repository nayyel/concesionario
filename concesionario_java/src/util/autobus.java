package util;

import java.time.LocalDate;

public class autobus 
{
	private String matricula;
	private int Numero_plazas;
	private String tipo_combustible;
	private String marca;
	private String modelo;
	private int numero_facturacion;
	private LocalDate ultima_DGT;

	public autobus(String matricula, int Numero_plazas, String tipo_combustible, String marca, String modelo, int numero_facturacion, int año, int mes, int dia ) {
		this.matricula = matricula;
		this.Numero_plazas = Numero_plazas;
		this.tipo_combustible = tipo_combustible;
		this.marca = marca;
		this.modelo = modelo;
		this.numero_facturacion = numero_facturacion;
		this.ultima_DGT = LocalDate.of(año, mes, dia);
		
	}
}
