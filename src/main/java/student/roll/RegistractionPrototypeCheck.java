package student.roll;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class RegistractionPrototypeCheck {

    private Integer rollNumber;

    public void printFromRegistractionPrototypeCheck(){
        System.out.println("Roll number of the student is :"+ rollNumber);
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }
}
