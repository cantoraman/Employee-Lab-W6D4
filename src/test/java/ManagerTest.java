import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager ("James", "J2", 10000, "Accounting");
    }

    @Test
    public void hasName(){
        assertEquals("James", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("J2", manager.getNiNumber());
    }

    @Test
    public void hasASalary(){
        assertEquals(10000, manager.getSalary());
    }

    @Test
    public void hasADept(){
        assertEquals("Accounting", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(200);
        assertEquals(10200,manager.getSalary());
    }


}
