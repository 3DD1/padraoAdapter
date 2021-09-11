public class Anfibio {
    IAnfibio anfibio;
    AnfibioAdapter persistencia;

    public Anfibio(){
        anfibio = new AnfabioEstrada();
        persistencia = new AnfibioAdapter(anfibio);
    }

    public void setAnfibio(String anfibio){
        anfibio.setAnfibio()
    }

}
