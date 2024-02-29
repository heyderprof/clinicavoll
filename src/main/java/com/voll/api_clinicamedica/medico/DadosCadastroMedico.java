package com.voll.api_clinicamedica.medico;

import com.voll.api_clinicamedica.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {

}
