package com.learn.spring.RecipeProject.repositories;

import com.learn.spring.RecipeProject.model.Category;
import com.learn.spring.RecipeProject.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);
}
