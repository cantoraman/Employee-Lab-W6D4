import Management.Director;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director ("James", "J2", 10000, 100000);
    }

    @Test
    public void hasName(){
        assertEquals("James", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("J2", director.getNiNumber());
    }

    @Test
    public void hasASalary(){
        assertEquals(10000, director.getSalary());
    }


    @Test
    public void canRaiseSalary(){
        director.raiseSalary(200);
        assertEquals(10200,director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(100, director.payBonus());
    }
    @Test
    public void hasBudget(){
        assertEquals(100000, director.getBudget());
    }


}
