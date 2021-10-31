public class Nume {
    String name;
    
    Nume (String name){
        this.name = name;
    }
    
    String setNume (Nume n){
        String name = this.name + " " + n.name;
        return name;
    }
}
