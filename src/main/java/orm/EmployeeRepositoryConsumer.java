package orm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class EmployeeRepositoryConsumer {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EmployeeRepository repository;

    public void printEmployee() throws Exception {
        //Optional<EmployeeEntity> emp = repository.findById(2L);
        List<EmployeeEntity> emp = repository.findAll();
        System.out.println(emp);
        logger.info("Employee id 2 -> {}", emp.get(0));
        System.out.println(String.format("Employee id 2 -> {}", emp.get(0)));
    }
}
