package net.aouali.milkshakechallenge;

import net.aouali.milkshakechallenge.entity.Recipe;
import net.aouali.milkshakechallenge.repository.RecipeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MilkShakeChallengeApplication {

    private final RecipeRepository recipeRepository;

    public MilkShakeChallengeApplication(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    public static void main(String[] args) {
        SpringApplication.run(MilkShakeChallengeApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() throws Exception {
        return (String[] args) -> {

            Recipe recipe1 = new Recipe("Vanilla Milkshake", 10, "Vanilla");
            Recipe recipe2 = new Recipe("Chocolate Milkshake", 5, "Chocolate");
            Recipe recipe3 = new Recipe("Strawberry Milkshake", 10, "Strawberry");
            Recipe recipe4 = new Recipe("Banana Milkshake", 20, "Bananas");

            this.recipeRepository.save(recipe1);
            this.recipeRepository.save(recipe2);
            this.recipeRepository.save(recipe3);
            this.recipeRepository.save(recipe4);
        };
    }
}
