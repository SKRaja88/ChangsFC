package com.learn.spring.RecipeProject.repositories;

import com.learn.spring.RecipeProject.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
