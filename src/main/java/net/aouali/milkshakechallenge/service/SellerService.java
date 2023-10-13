package net.aouali.milkshakechallenge.service;

import net.aouali.milkshakechallenge.entity.Recipe;
import net.aouali.milkshakechallenge.entity.Seller;

import java.util.List;
import java.util.Optional;

public interface SellerService {
    public List<Seller> findAll();
    public Optional<Seller> findById(long id);
    public  void save(Seller seller);
    public  void deleteById(Long id);
}
