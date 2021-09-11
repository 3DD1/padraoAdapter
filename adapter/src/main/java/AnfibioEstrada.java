public class AnfibioEstrada implements IAnfibio{
    private String estrada;

    @Override
    public String getAnfibio(){
        return this.estrada;
    }

    @Override
    public void setAnfibio(String estrada){
        this.estrada = estrada;
    }
}
