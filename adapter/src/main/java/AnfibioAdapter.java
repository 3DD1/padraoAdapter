public class AnfibioAdapter  extends CarroAquatico {

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

    public void salvarAnfibio(){
        if (anfibioEstrada.getAnfibio().equals("Lama")){
            this.setAquatico("Rio");
        }else if(anfibioEstrada.getAnfibio().equals("Terra")){
            this.setAquatico("Lagoa");
        }else if(anfibioEstrada.getAnfibio().equals("Areia")){
            this.setAquatico("Mar");
        }else{
            this.setAquatico("Não salva");
        }

    }

}
