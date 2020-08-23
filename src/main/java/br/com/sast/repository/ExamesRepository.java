package br.com.sast.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.sast.model.Exames;

@Repository
public interface ExamesRepository extends JpaRepository<Exames, Short> {
	
	@Query("SELECT e FROM Exames e WHERE e.id_aso = :id_aso")
	List<Exames> buscaExamesPorAso(@Param("id_aso") Short id_aso);


}
