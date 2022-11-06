package repo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import Dao.Employees;
@Service
public interface EmpRepository extends JpaRepository<Employees, String>{

}
