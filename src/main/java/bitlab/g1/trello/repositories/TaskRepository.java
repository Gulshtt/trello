package bitlab.g1.trello.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bitlab.g1.trello.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
