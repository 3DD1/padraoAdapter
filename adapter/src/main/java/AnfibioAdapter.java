public class AnfibioAdapter  extends AnfabioAquatico{

    private IAnfibio anfibioEstrada;

    public AnfibioAdapter(IAnfibio anfibioEstrada){
        this.anfibioEstrada = anfibioEstrada;
    }

    public String transformaAnfibio(){
        if (this.getAquatico() == "Rio"){
            anfibioEstrada.setAnfibio("Lama");
        }else if(this.getAquatico() == "Lagoa"){
            anfibioEstrada.setAnfibio("Terra");
        }else if(this.getAquatico() == "Mar"){
            anfibioEstrada.setAnfibio("Areia");
        }else{
            anfibioEstrada.setAnfibio("Não transforma");
        }
        return anfibioEstrada.getAnfibio();
    }

    public String adaptarAnfibio(){
        if (this.getAquatico() == "Lama"){
            anfibioEstrada.setAnfibio("Rio");
        }else if(this.getAquatico() == "Terra"){
            anfibioEstrada.setAnfibio("Lagoa");
        }else if(this.getAquatico() == "Areia"){
            anfibioEstrada.setAnfibio("Mar");
        }else{
            anfibioEstrada.setAnfibio("Não transforma");
        }
        return anfibioEstrada.getAnfibio();
    }

}
