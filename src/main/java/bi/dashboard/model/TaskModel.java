package bi.dashboard.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_task")
public class TaskModel {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String taskId;
    
    private String taskName, taskDesc;
    
    @Temporal(TemporalType.DATE)
    private Date taskStarDate, taskEndDate;
    
    private int taskStatus;
    
    @ManyToOne
    @JoinColumn(name = "proj_id",nullable = false)
    private ProjectModel projId;
}
