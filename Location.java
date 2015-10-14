
public class Location {

    String name;
    String size;
    String facion;
    int reputation;

    public Location(String name, String size, String facion, int reputation) {
        this.name = name;
        this.size = size;
        this.facion = facion;
        this.reputation = reputation;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getFacion() {
        return facion;
    }

    public int getReputation() {
        return reputation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setFacion(String facion) {
        this.facion = facion;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + ", size=" + size + ", facion=" + facion + ", reputation=" + reputation + '}';
    }
    
    
    
}
