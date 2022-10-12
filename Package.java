public class Package {
    //TODO: Fill in this class for step 1.
    String description;
    int weight;
    Package next; 

    Package(String description, int weight, Package next){
        this.description = description; 
        this.weight = weight; 
        this.next = next; 
    }
    public String toString(){
        return "Package Contents: " + description + "(" + weight + ")";
    }
}
