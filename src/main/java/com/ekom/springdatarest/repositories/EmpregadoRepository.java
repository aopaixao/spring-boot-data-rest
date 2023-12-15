package com.ekom.springdatarest.repositories;

import com.ekom.springdatarest.entities.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(collectionResourceRel = "empregados", path = "empregados")
public interface EmpregadoRepository extends JpaRepository<Empregado,Long> {
    List<Empregado> findByNome(@Param("nome") String nome);
}
