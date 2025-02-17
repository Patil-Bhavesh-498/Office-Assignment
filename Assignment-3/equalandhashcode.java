import java.util.HashSet;
import java.util.Objects;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class equalandhashcode {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
         Employee e1 = new Employee(101, "Alice");
         Employee e2 = new Employee(101, "Alice");
        Employee e3 = new Employee(102, "Bob");

        employees.add(new Employee(101, "Alice"));
        employees.add(new Employee(101, "Alice"));
        employees.add(new Employee(102, "Bob"));
        
        for (Employee employee: employees) {
            System.out.println(employee.id+" "+employee.name);
        }
        System.out.println("E1 to E2:"+e1.equals(e2));  // true (Same id & name)
        System.out.println("E1 to E3:"+e1.equals(e3));  // false (Different id & name)
    
        System.out.println("E1 :"+e1.hashCode());  // Example: 12345678
        System.out.println("E2 :"+e2.hashCode());  // Same as e1
        System.out.println("E3 :"+e3.hashCode());  // Different hash code
    
    } 
}
