package net.empleos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.empleos.model.Categoria;

//public interface CategoriasRepository extends CrudRepository<Categoria, Integer> {

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

}
