package bi.dashboard.model;

import com.fasterxml.jackson.annotation.JsonView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

@Entity
@Table(name = "t_project")
public class ProjectModel {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @JsonView(DataTablesOutput.View.class)
    private String projId;
    @JsonView(DataTablesOutput.View.class)
    private String projName, projDesc, projOwner;

    @Temporal(TemporalType.DATE)
    @JsonView(DataTablesOutput.View.class)
    private Date projStartDate, projEndDate;

    @JsonView(DataTablesOutput.View.class)
    private int projStatus;

    @JsonView(DataTablesOutput.View.class)
    private double projProgress;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "projId")
    private List<TaskModel> taskProject = new ArrayList<>();

    public ProjectModel(String projName, String projDesc, String projOwner, Date projStartDate, Date projEndDate, int projStatus, double projProgress) {
        this.projName = projName;
        this.projDesc = projDesc;
        this.projOwner = projOwner;
        this.projStartDate = projStartDate;
        this.projEndDate = projEndDate;
        this.projStatus = projStatus;
        this.projProgress = projProgress;
    }

    public ProjectModel() {
        super();
    }

    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public String getProjDesc() {
        return projDesc;
    }

    public void setProjDesc(String projDesc) {
        this.projDesc = projDesc;
    }

    public String getProjOwner() {
        return projOwner;
    }

    public void setProjOwner(String projOwner) {
        this.projOwner = projOwner;
    }

    public Date getProjStartDate() {
        return projStartDate;
    }

    public void setProjStartDate(Date projStartDate) {
        this.projStartDate = projStartDate;
    }

    public Date getProjEndDate() {
        return projEndDate;
    }

    public void setProjEndDate(Date projEndDate) {
        this.projEndDate = projEndDate;
    }

    public int getProjStatus() {
        return projStatus;
    }

    public void setProjStatus(int projStatus) {
        this.projStatus = projStatus;
    }

    public double getProjProgress() {
        return projProgress;
    }

    public void setProjProgress(double projProgress) {
        this.projProgress = projProgress;
    }

}
