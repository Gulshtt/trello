package bitlab.g1.trello.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bitlab.g1.trello.models.Category;
import bitlab.g1.trello.repositories.CategoryRepository;

import java.util.List;

@Service

public class CategoryService {
    @Autowired
    private  CategoryRepository categoryRepository;

    public void save(Category category) {
        categoryRepository.save(category);
    }
    public void delete(Category category) {
        categoryRepository.delete(category);
    }
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

}
