package structural.execute_around;

public class Sample {

    public static void main(String[] args) {
        //Chaining operations
        Resource.use(resource -> resource.operation("1").operation("2"));
    }
}
