package net.aouali.milkshakechallenge.service;

import net.aouali.milkshakechallenge.entity.Recipe;
import net.aouali.milkshakechallenge.entity.Seller;
import net.aouali.milkshakechallenge.repository.RecipeRepository;
import net.aouali.milkshakechallenge.repository.SellerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellerServiceImplemt implements SellerService {

    private final SellerRepository sellerRepository;

    public SellerServiceImplemt(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }
    @Override
    public List<Seller> findAll() {
        return this.sellerRepository.findAll();
    }

    @Override
    public Optional<Seller> findById(long id) {
        return this.sellerRepository.findById(id);
    }

    @Override
    public void save(Seller seller) {
        this.sellerRepository.save(seller);
    }


    @Override
    public void deleteById(Long id) {
        Optional<Seller> elemToDelete = findById(id);
        elemToDelete.ifPresent(seller -> this.sellerRepository.delete(seller));
    }
}
