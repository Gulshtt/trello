package bitlab.g1.trello.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bitlab.g1.trello.models.Folder;
import bitlab.g1.trello.models.Task;
import bitlab.g1.trello.repositories.FolderRepository;

import java.util.List;

@Service
public class FolderService {

    @Autowired
    private FolderRepository folderRepository;

    public void save(Folder folder) {
        folderRepository.save(folder);
    }
    public void delete(Folder folder) {
        folderRepository.delete(folder);
    }
    public Folder findById(Long id) {
        return folderRepository.findById(id).orElse(null);
    }
    public List<Folder> findAll() {
        return folderRepository.findAll();
    }

    public List<Task> findAllByFolder(Folder folder){
        return folder.getTasks();
    }
}
