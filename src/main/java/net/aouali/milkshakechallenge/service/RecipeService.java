package net.aouali.milkshakechallenge.service;

import net.aouali.milkshakechallenge.entity.Recipe;

import java.util.List;
import java.util.Optional;

public interface RecipeService {
    public List<Recipe> findAll();
    public Optional<Recipe> findById(long id);
    public  void save(Recipe recipe);
    public  void deleteById(Long id);

}
