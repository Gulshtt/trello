package bitlab.g1.trello.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bitlab.g1.trello.models.Folder;

@Repository
public interface FolderRepository extends JpaRepository<Folder,Long> {

}
