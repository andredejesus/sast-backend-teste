package br.com.sast.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sast.model.Colaborador;
import br.com.sast.model.DadosEmpresa;
import br.com.sast.repository.ColaboradorRepository;
import br.com.sast.repository.DadosEmpresaRepository;

@Service
public class ColaboradorServiceImpl implements ColaboradorService {

	@Autowired
	private ColaboradorRepository cr;
	
	@Autowired
	private DadosEmpresaRepository dr;
	
	@Override
	public void salvarColaborador(Colaborador colaborador) {
		cr.save(colaborador);
		dr.save(colaborador.getDadosEmpresa());
	}

	@Override
	public Colaborador buscarColaborador(Short id) {
		Colaborador colaboradorRetornado = cr.buscarColaborador(id);
		return colaboradorRetornado;
	}

	@Override
	public List<Colaborador> buscaColaboradores() {
		return cr.findAll();
	}

	@Override
	public void editarColaborador(Colaborador colaborador) {
		cr.save(colaborador);
		
	}

	@Override
	public void deletarColaborador(Short id) {
		cr.deleteById(id);
		
	}

	@Override
	public List<Colaborador> filtroColaboradores(String nome, 
												 String rg, 
												 String cpf, 
												 String data_nascimento, 
												 String data_admissao, 
												 String funcao,
												 String departamento,
												 String lotacao,
												 String situacao) {
		
		return cr.filtroColaboradores(nome, 
									  rg, 
									  cpf, 
									  data_nascimento, 
									  data_admissao, 
									  funcao,
									  departamento,
									  lotacao,
									  situacao);
	}

}
