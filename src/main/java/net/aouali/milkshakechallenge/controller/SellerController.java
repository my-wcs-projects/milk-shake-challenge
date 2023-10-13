package net.aouali.milkshakechallenge.controller;

import net.aouali.milkshakechallenge.entity.Recipe;
import net.aouali.milkshakechallenge.entity.Seller;
import net.aouali.milkshakechallenge.service.RecipeService;
import net.aouali.milkshakechallenge.service.SellerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    private final SellerService sellerService;

    public SellerController( SellerService sellerService){
        this.sellerService = sellerService;
    }

    @GetMapping("")
    public List<Seller> findAll() {
        return this.sellerService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Seller> findById(@PathVariable long id) {
        return this.sellerService.findById(id);
    }

    @PostMapping("")
    public void save(@RequestBody Seller seller) {
        this.sellerService.save(seller);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        this.sellerService.deleteById(id);
    }
}
