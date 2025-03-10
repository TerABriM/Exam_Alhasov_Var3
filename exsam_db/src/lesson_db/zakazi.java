package lesson_db;

public class zakazi {
    private int id;
    private int id_zakaz;
    private String name_zakaz;
    private  int ghena_zakaz;

    public zakazi(int id, int id_zakaz, String name_zakaz, int ghena_zakaz) {
        this.id = id;
        this.id_zakaz = id_zakaz;
        this.name_zakaz = name_zakaz;
        this.ghena_zakaz = ghena_zakaz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_zakaz() {
        return id_zakaz;
    }

    public void setId_zakaz(int id_zakaz) {
        this.id_zakaz = id_zakaz;
    }

    public String getName_zakaz() {
        return name_zakaz;
    }

    public void setName_zakaz(String name_zakaz) {
        this.name_zakaz = name_zakaz;
    }

    public int getGhena_zakaz() {
        return ghena_zakaz;
    }

    public void setGhena_zakaz(int ghena_zakaz) {
        this.ghena_zakaz = ghena_zakaz;
    }
}
