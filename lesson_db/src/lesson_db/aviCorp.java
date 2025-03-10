package lesson_db;

public class aviCorp {
   private int id;
   private String name;
   private  int idsomolet;
   private String namesomolet;

    public aviCorp(int id, String name, int idsomolet, String namesomolet) {
        this.id = id;
        this.name = name;
        this.idsomolet = idsomolet;
        this.namesomolet = namesomolet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdsomolet() {
        return idsomolet;
    }

    public void setIdsomolet(int idsomolet) {
        this.idsomolet = idsomolet;
    }

    public String getNamesomolet() {
        return namesomolet;
    }

    public void setNamesomolet(String namesomolet) {
        this.namesomolet = namesomolet;
    }

}
