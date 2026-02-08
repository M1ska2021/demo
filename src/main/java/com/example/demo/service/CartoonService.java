package com.example.demo.service;

import com.example.demo.model.Cartoon;
import com.example.demo.repository.CartoonRepository;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartoonService {

    private final CartoonRepository repository;

    public CartoonService(CartoonRepository repository) {
        this.repository = repository;
    }

    public Cartoon create(Cartoon cartoon) {
        return repository.save(cartoon);
    }

    public List<Cartoon> getAll() {
        return repository.findAll();
    }

    public Cartoon getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Cartoon with id " + id + " not found"
                        ));
    }

    public Cartoon update(Integer id, Cartoon cartoon) {
        Cartoon existing = getById(id);
        existing.setName(cartoon.getName());
        existing.setEpisodes(cartoon.getEpisodes());
        existing.setStudio(cartoon.getStudio());
        return repository.save(existing);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
