public class Carro {
    IAnfibio anfibio;
    AnfibioAdapter persistencia;

    public Carro(){
        anfibio = new CarroEstrada();
        persistencia = new AnfibioAdapter(anfibio);
    }

    public void setAnfibio(String estrada){
        anfibio.setAnfibio(estrada);
        persistencia.salvarAnfibio();
    }

    public String getAnfibio(){
        return persistencia.transformaAnfibio();
    }

    public String getAquatico(){
        return persistencia.getAquatico();
    }

}
