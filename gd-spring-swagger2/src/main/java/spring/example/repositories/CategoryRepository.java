package spring.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import spring.example.domain.Category;

@RepositoryRestResource
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
