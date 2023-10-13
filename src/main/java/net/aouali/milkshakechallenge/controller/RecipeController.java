package net.aouali.milkshakechallenge.controller;


import net.aouali.milkshakechallenge.entity.Recipe;
import net.aouali.milkshakechallenge.service.RecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController( RecipeService recipeService){
        this.recipeService = recipeService;
    }

    @GetMapping("")
    public List<Recipe> findAll() {
        return this.recipeService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Recipe> findById(@PathVariable long id) {
        return this.recipeService.findById(id);
    }

    @PostMapping("")
    public void save(@RequestBody Recipe recipe) {
        this.recipeService.save(recipe);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        this.recipeService.deleteById(id);
    }

}
