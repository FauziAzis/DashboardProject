package bi.dashboard.controller;

import bi.dashboard.repo.ProjectRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/resource")
public class ResourceController {
    
    @Autowired
    private ProjectRepo pr;
    
    @RequestMapping(value = "/jumlah",method = RequestMethod.GET)
    public List<Object[]> jumlahResource(){
        return pr.jumlahResource();
    }
}
