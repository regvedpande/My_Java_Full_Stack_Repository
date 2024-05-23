class Names {
    int id;
    String name; 

    public Names(int id, String name) { 
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Names [id=" + id + ", name=" + name + "]";
    }
}