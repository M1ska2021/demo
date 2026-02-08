package com.example.demo.controller;

import com.example.demo.model.Cartoon;
import com.example.demo.service.CartoonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cartoons")
public class CartoonController {

    private final CartoonService service;

    public CartoonController(CartoonService service) {
        this.service = service;
    }

    @PostMapping
    public Cartoon create(@RequestBody Cartoon cartoon) {
        return service.create(cartoon);
    }

    @GetMapping
    public List<Cartoon> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Cartoon getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Cartoon update(
            @PathVariable Integer id,
            @RequestBody Cartoon cartoon) {
        return service.update(id, cartoon);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
