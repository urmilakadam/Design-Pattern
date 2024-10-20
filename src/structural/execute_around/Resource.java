package structural.execute_around;

import java.util.function.Consumer;

public class Resource {

    //Private constructor to disallow instantiation of object outside this class
    private Resource() {
        System.out.println("Creating Resource");
    }

    // Closing Resources
    private void close(){
        System.out.println("Closing Resource");
    }

    public Resource operation(String input){
        System.out.println("Performing operation with resource input: "+ input);
        return this;
    }

    public static void use(Consumer<Resource> resourceConsumer){
        Resource resource = new Resource();
        try{
            resourceConsumer.accept(resource);
        }
        finally {  //Cleaning up the resource
            resource.close();
        }
    }

}
