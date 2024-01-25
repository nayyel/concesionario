package util;

import java.time.LocalDate;

public class coche {
private String matricula;
private int Numero_puertas;
private String tipo_combustible;
private String marca;
private String modelo;
private int numero_facturacion;
private LocalDate ultima_DGT;

public coche(String matricula, int Numero_puertas, String tipo_combustible, String marca, String modelo, int numero_facturacion, int año, int mes, int dia ) {
	this.matricula = matricula;
	this.Numero_puertas = Numero_puertas;
	this.tipo_combustible = tipo_combustible;
	this.marca = marca;
	this.modelo = modelo;
	this.numero_facturacion = numero_facturacion;
	this.ultima_DGT = LocalDate.of(año, mes, dia);
	
}

}
