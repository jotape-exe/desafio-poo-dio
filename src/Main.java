public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Estruturas de repetição Java");
        cursoJava.setTecnologia("Java");
        cursoJava.setCargaHoraria(5);
        cursoJava.setDescricao("Curso sobre estrutura de dados em Java");
        cursoJava.setNivelConteudo(Curso.Nivel.INTERMEDIARIO);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("Arrays em JS");
        cursoJs.setTecnologia("Javascript");
        cursoJs.setCargaHoraria(2);
        cursoJs.setDescricao("Curso sobre arrays de dados em Javascript");
        cursoJs.setNivelConteudo(Curso.Nivel.BASICO);

        Mentoria mentoriaJaveiros = new Mentoria();
        mentoriaJaveiros.setDataMentoria("12/02/2023");
        mentoriaJaveiros.setDescricao("Aprenda OOP de uma vez por todas");
        mentoriaJaveiros.setTitulo("Mentoria POO Java");

        Bootcamp bootcampBackEndJava = new Bootcamp();
        bootcampBackEndJava.setNome("Bootcamp Java Back-End");
        bootcampBackEndJava.setDescricao("Aprenda tudo sobre Java");
        bootcampBackEndJava.getConteudos().add(cursoJava);
        bootcampBackEndJava.getConteudos().add(mentoriaJaveiros);

        System.out.println("Programador 1\n");
        Dev joaoDev = new Dev();
        joaoDev.setNome("Joaozinho");
        joaoDev.inscreverBootcamp(bootcampBackEndJava);
        System.out.println("Conteudos Incritos de "+joaoDev.getNome()+" - "+joaoDev.getConteudosinscritos()+"\n");
        joaoDev.progredir();
        System.out.println("\nProgressao ---------------------------------------------------------\n");
        System.out.println("Conteudos Incritos de "+joaoDev.getNome()+" - "+joaoDev.getConteudosinscritos()+"\n");
        System.out.println("Conteudos Concluidos de "+joaoDev.getNome()+" - "+joaoDev.getConteudosConcluidos()+"\n");
        System.out.println("XP - "+joaoDev.calcularTotalXp());

        System.out.println("Programador 2\n");
        Dev pedroDev = new Dev();
        pedroDev.setNome("Pedrinho");
        pedroDev.inscreverBootcamp(bootcampBackEndJava);
        System.out.println("Conteudos Incritos de "+pedroDev.getNome()+" - "+pedroDev.getConteudosinscritos()+"\n");
        pedroDev.progredir();
        System.out.println("\nProgressao ---------------------------------------------------------\n");
        System.out.println("Conteudos Incritos de "+pedroDev.getNome()+" - "+pedroDev.getConteudosinscritos()+"\n");
        System.out.println("Conteudos Concluidos de "+pedroDev.getNome()+" - "+pedroDev.getConteudosConcluidos()+"\n");
        System.out.println("XP - "+pedroDev.calcularTotalXp());
    }
}