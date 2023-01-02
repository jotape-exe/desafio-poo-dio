public class Curso extends Conteudo {
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    enum Nivel {
        BASICO, INTERMEDIARIO, AVANCADO
    }

    private Nivel nivelConteudo;

    public Nivel getNivelConteudo() {
        return nivelConteudo;
    }

    public void setNivelConteudo(Nivel nivelConteudo) {
        this.nivelConteudo = nivelConteudo;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public int calcularXp() {
        return xpDefaut * cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso " + "\n-----------------------------------\n" +
                getTitulo() +" - "+getNivelConteudo()+ "\n-----------------------------------\n" +
                getDescricao() + "\n-----------------------------------\n" +
                "Carga horária -> " + cargaHoraria + "h"+
                "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";
    }

}


