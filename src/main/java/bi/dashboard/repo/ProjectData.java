package bi.dashboard.repo;

import bi.dashboard.model.ProjectModel;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

public interface ProjectData extends DataTablesRepository<ProjectModel, String>{
    
}
