package edy.springframework.spring5recipeapp.services;

import edy.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
