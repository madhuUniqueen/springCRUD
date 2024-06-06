package repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import entity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity,Integer>{

	void findAll(List<StudentEntity> li);
 
}
