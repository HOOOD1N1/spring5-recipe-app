package edy.springframework.spring5recipeapp.services;

import edy.springframework.spring5recipeapp.domain.Recipe;
import edy.springframework.spring5recipeapp.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Test
    void getRecipes() throws  Exception{

        Recipe recipe = new Recipe();
        HashSet receipeSet = new HashSet();
        receipeSet.add(recipe);

        when(recipeService.getRecipes()).thenReturn(receipeSet);

        Set<Recipe> recipes = recipeService.getRecipes();
        assertEquals(recipes.size(), 1);
        verify(recipeRepository, times(1)).findAll();
    }

    @BeforeEach
    void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }
}