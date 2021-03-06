package br.com.sast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sast.model.DadosEmpresa;

@Repository
public interface DadosEmpresaRepository extends JpaRepository<DadosEmpresa, Short> {

}
