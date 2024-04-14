package bitlab.g1.trello.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Entity
@Table(name = "t_tasks")
@Getter
@Setter
@ToString
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private int status;

    @ManyToOne(fetch = FetchType.EAGER,
            targetEntity = Folder.class)
    private Folder folder;
}
