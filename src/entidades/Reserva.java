/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author douglas
 */
public class Reserva {
	private int quantidadeDiarias;
	private int quantidadePessoas;
	private Suites suite;
	private Hospede hospede;

	public int getQuantidadeDiarias() {
		return quantidadeDiarias;
	}

	public void setQuantidadeDiarias(int quantidadeDiarias) {
		this.quantidadeDiarias = quantidadeDiarias;
	}

	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	public Suites getSuite() {
		return suite;
	}

	public void setSuite(Suites suite) {
		this.suite = suite;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	@Override
	public String toString() {
		return "Reserva{" + "quantidadeDiarias=" + quantidadeDiarias + ", quantidadePessoas=" + quantidadePessoas + ", suite=" + suite + ", hospede=" + hospede + '}';
	}
	
}
