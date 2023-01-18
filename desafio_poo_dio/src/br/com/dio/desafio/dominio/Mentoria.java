package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria extends Conteudo{

	private LocalDateTime data;
	
	

	public LocalDateTime getDateTime() {
		return data;
	}

	public void setDateTime(LocalDate data) {
		this.data = this.data;
	}

	

	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 10d;
	}

	@Override
	public String toString() {
		return "Mentoria [dateTime=" + data + ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
