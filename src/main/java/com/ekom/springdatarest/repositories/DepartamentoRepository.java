package com.ekom.springdatarest.repositories;

import com.ekom.springdatarest.entities.Departamento;
import com.ekom.springdatarest.entities.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "departamentos", path = "departamentos")
public interface DepartamentoRepository extends JpaRepository<Departamento,Long> {
    List<Departamento> findByNome(@Param("nome") String nome);
}
