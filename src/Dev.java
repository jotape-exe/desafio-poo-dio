import java.util.*;

public class Dev {
    private String nome;
    private Set conteudosinscritos = new LinkedHashSet();
    private Set conteudosConcluidos = new LinkedHashSet();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosinscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosinscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosinscritos.remove(conteudo.get());
        } else{
            System.out.println("Voce nao esta matriculado em nenhum bootcamp");
        }
    }

    public int calcularTotalXp(){
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        int soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;
    }

    public Set getConteudosinscritos() {
        return conteudosinscritos;
    }

    public void setConteudosinscritos(Set conteudosinscritos) {
        this.conteudosinscritos = conteudosinscritos;
    }

    public Set getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome) && conteudosinscritos.equals(dev.conteudosinscritos) && conteudosConcluidos.equals(dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosinscritos, conteudosConcluidos);
    }
}
