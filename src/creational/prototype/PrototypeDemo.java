package creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {

        Employee emp = new Employee("urmila", "software engineer");
        Employee cloneEmp = emp.clone();

        System.out.println(emp); //output: Employee{name='urmila', role='software engineer'}
        System.out.println(cloneEmp); //output: Employee{name='urmila', role='software engineer'}

        emp.setName("Tom");
        Employee cloneNewEmp = emp.clone();

        System.out.println(emp); //output: Employee{name='Tom', role='software engineer'}
        System.out.println(cloneEmp); //output: Employee{name='urmila', role='software engineer'}
        System.out.println(cloneNewEmp); //output: Employee{name='Tom', role='software engineer'}
    }
}
