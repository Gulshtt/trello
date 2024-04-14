package bitlab.g1.trello.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bitlab.g1.trello.models.Task;
import bitlab.g1.trello.repositories.TaskRepository;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void save(Task task) {
        taskRepository.save(task);
    }

    public void delete(Task task) {
        taskRepository.deleteById(task.getId());
    }

    public Task findById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }
}
