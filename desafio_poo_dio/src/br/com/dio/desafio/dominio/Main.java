package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("excelente curso de java com Camila");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("excelente curso de JS com Camila");
		curso2.setCargaHoraria(6);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Mentoria de java com camila ");
		mentoria.setDateTime(LocalDate.now());
		
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java Developer");
		bootcamp.setDescricao("Descricao do Bootcamp Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		Dev dev =  new Dev();
		dev.setNome("natanael");
		dev.inscreverBootcamp(bootcamp);
		dev.progredir();
		dev.calcularTotalXP();
		dev.progredir();
		dev.calcularTotalXP();
		
		
		
		Dev dev2 = new Dev();
		dev2.setNome("joao");
		dev2.inscreverBootcamp(bootcamp);
		dev2.progredir();
		dev2.calcularTotalXP();
		
	}

}
