package bi.dashboard;

import bi.dashboard.repo.ProjectRepo;
import bi.dashboard.model.ProjectModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private ProjectRepo pr;

    @Autowired
    public DatabaseSeeder(ProjectRepo pr) {
        this.pr = pr;
    }

    @Override
    public void run(String... strings) throws Exception {
        Date date = new Date();
        List<ProjectModel> project = new ArrayList<>();
        project.add(new ProjectModel("BI-WEB", "BI-WEB", "PIA-MI", date, date, 0, 50));
        project.add(new ProjectModel("SI-BISSSS", "SI-BSSSS", "PIA-MI", date, date, 0, 60));
        project.add(new ProjectModel("BI-RTGS", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("BI-SSSS", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("BI-ETP", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("SKNBI", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("HARTIS", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("PVP", "BI-RTGS", "PIA-SP", date, date, 0, 70));        project.add(new ProjectModel("BI-WEB", "BI-WEB", "PIA-MI", date, date, 0, 50));
        project.add(new ProjectModel("SI-BISSSS", "SI-BSSSS", "PIA-MI", date, date, 0, 60));
        project.add(new ProjectModel("BI-RTGS", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("BI-SSSS", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("BI-ETP", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("SKNBI", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("HARTIS", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("PVP", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("BI-WEB", "BI-WEB", "PIA-MI", date, date, 0, 50));
        project.add(new ProjectModel("SI-BISSSS", "SI-BSSSS", "PIA-MI", date, date, 0, 60));
        project.add(new ProjectModel("BI-RTGS", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("BI-SSSS", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("BI-ETP", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("SKNBI", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("HARTIS", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("PVP", "BI-RTGS", "PIA-SP", date, date, 0, 70));        project.add(new ProjectModel("BI-WEB", "BI-WEB", "PIA-MI", date, date, 0, 50));
        project.add(new ProjectModel("SI-BISSSS", "SI-BSSSS", "PIA-MI", date, date, 0, 60));
        project.add(new ProjectModel("BI-RTGS", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("BI-SSSS", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("BI-ETP", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("SKNBI", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("HARTIS", "BI-RTGS", "PIA-SP", date, date, 0, 70));
        project.add(new ProjectModel("PVP", "BI-RTGS", "PIA-SP", date, date, 0, 70));

        pr.save(project);
    }
    
    
}
