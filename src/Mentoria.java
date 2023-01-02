import java.text.SimpleDateFormat;
import java.util.Date;

public class Mentoria extends Conteudo{
    Date data = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    private String dataMentoria = formatter.format(data);

    @Override
    public int calcularXp() {
        return xpDefaut+45;
    }

    public String getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(String dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String toString() {
        return "\nMentoria" +
                "\n-----------------------------------\n"+
                getTitulo() +" - "+ getTecnologia()+
                "\n-----------------------------------\n"+
                 getDescricao() +
                "\n-----------------------------------\n"+
                 dataMentoria+"\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";
    }
}
