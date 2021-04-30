package bi.dashboard.view;

import bi.dashboard.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeView {

    @Autowired
    private ProjectRepo pr;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("content", "home");
        return "index";
    }

    @RequestMapping("/users")
    public String list(ModelMap model, @SortDefault("projId") Pageable pageable) {
        model.addAttribute("page", pr.findAll(pageable));
        return "view/Page";
    }
    
    
    
    
}
