package bi.dashboard.controller;

import bi.dashboard.model.ProjectModel;
import bi.dashboard.repo.ProjectData;
import bi.dashboard.repo.ProjectRepo;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/project", method = RequestMethod.GET)
public class ProjectController {

    @Autowired
    private ProjectRepo pr;

    @Autowired
    private ProjectData pd;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<ProjectModel> all() {
        return pr.findAll();
    }

    @RequestMapping(value = "/obj", method = RequestMethod.GET)
    public List<Object[]> obj() {
        return pr.findData();
    }

    @JsonView(DataTablesOutput.View.class)
    @RequestMapping(value = "/dt_project", method = RequestMethod.GET)
    public DataTablesOutput<ProjectModel> dtProject(@Valid DataTablesInput input) {
        return pd.findAll(input);
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public Page<ProjectModel> semua(Pageable page) {
        return pr.findAll(page);
    }
    
    

}
