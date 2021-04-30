package bi.dashboard.repo;

import bi.dashboard.model.ProjectModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<ProjectModel, String>{
    List<ProjectModel> findAllByOrderByProjIdAsc();
    
    @Query(value = "SELECT * FROM T_PROJECT", nativeQuery = true)
    List<Object[]> findData();
    
    @Query(value = "SELECT COUNT(JABATAN) JUMLAH,JABATAN FROM T_RESOURCE GROUP BY JABATAN",nativeQuery = true)
    List<Object[]> jumlahResource();
}
