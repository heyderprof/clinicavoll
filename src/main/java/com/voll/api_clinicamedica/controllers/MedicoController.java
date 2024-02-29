package com.voll.api_clinicamedica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voll.api_clinicamedica.medico.DadosCadastroMedico;
import com.voll.api_clinicamedica.medico.Medico;
import com.voll.api_clinicamedica.medico.MedicoRepository;

@RestController
@RequestMapping("medicos")
public class MedicoController {
	
	@Autowired
	private MedicoRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroMedico dados) {
		repository.save(new Medico(dados));
	}
	
}
