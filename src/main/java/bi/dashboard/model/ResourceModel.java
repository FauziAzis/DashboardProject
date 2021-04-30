package bi.dashboard.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_resource")
public class ResourceModel {

    @Id
    @Column(unique = true)
    private String nik;
    private String nama, jabatan;

    @ManyToMany
    @JoinTable(
            name = "t_task_resource",
            joinColumns = @JoinColumn(name = "nik"),
            inverseJoinColumns = @JoinColumn(name = "task_id"))
    private List<TaskModel> taskResc = new ArrayList<>();
}
