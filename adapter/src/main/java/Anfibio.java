public class Anfibio {
    IAnfibio anfibio;
    AnfibioAdapter persistencia;

    public Anfibio(){
        anfibio = new AnfabioEstrada();
        persistencia = new AnfibioAdapter(anfibio);
    }

    public void setAnfibio(String estrada){
        anfibio.setAnfibio(estrada);
        persistencia.adaptarAnfibio();
    }

    public String getAnfibio(){
        return persistencia.transformaAnfibio();
    }
    /*
    public String getAquatico(){
        return persistencia.getAquatico();
    }
    */
}
