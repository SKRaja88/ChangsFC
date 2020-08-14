package com.learn.spring.RecipeProject.service;

import com.learn.spring.RecipeProject.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface RecipeService  {

    Set<Recipe> getRecipes();
}
