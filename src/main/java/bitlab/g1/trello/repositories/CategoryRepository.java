package bitlab.g1.trello.repositories;

import org.springframework.stereotype.Repository;
import bitlab.g1.trello.models.Category;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
