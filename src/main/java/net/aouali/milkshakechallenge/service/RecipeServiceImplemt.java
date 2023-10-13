package net.aouali.milkshakechallenge.service;

import net.aouali.milkshakechallenge.entity.Recipe;
import net.aouali.milkshakechallenge.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeServiceImplemt implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImplemt(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    @Override
    public List<Recipe> findAll() {
        return this.recipeRepository.findAll();
    }

    @Override
    public Optional<Recipe> findById(long id) {
        return this.recipeRepository.findById(id);
    }

    @Override
    public void save(Recipe recipe) {
        this.recipeRepository.save(recipe);
    }

    @Override
    public void deleteById(Long id) {
        Optional<Recipe> elemToDelete = findById(id);
        elemToDelete.ifPresent(recipe -> this.recipeRepository.delete(recipe));
    }
}
