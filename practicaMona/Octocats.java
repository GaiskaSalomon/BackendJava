package practicaMona;

public class Octocats{
    public static void main(String[] args) {
        Labtocat();
        Luchadortocat();
        Minertocat();
        Skatocat();
        Sentrytocat();
        Surftocat();
    }

    private static void Labtocat(){
        Labtocat labtocat = new Labtocat(
                "Soy el octocat de la ciencia",
                "Labtocat",
                "Investigación científica",
                "Conocimiento"
        );
        System.out.println(labtocat.showMessage());
    }

    private static void Luchadortocat(){
        Luchadortocat luchadortocat = new Luchadortocat(
                "Soy el octocat de los cuadriláteros",
                "Luchadortocat",
                "Lucha libre",
                "Fuerza física"
        );
        System.out.println(luchadortocat.showMessage());
    }

    private static void Minertocat(){
        Minertocat minertocat = new Minertocat(
                "Soy el octocat de la minería",
                "Minertocat",
                "Minería",
                "Charola cribadora"
        );
        System.out.println(minertocat.showMessage());
    }

    private static void Skatocat(){
       Skatetocat skatetocat = new Skatetocat(
                "Soy el octocat del skate",
                "Skatetocat",
                "Patinar en los parques",
                "Patineta"
        );
        System.out.println(skatetocat.showMessage());
    }

    private static void Sentrytocat(){
        Sentrytocat sentrytocat = new Sentrytocat(
                "Soy el octocat que apaga incendios",
                "Sentrytocat",
                "Bombero",
                "Equipo contra incedios"
        );
        System.out.println(sentrytocat.showMessage());
    }

    private static void Surftocat(){
        Surftocat surftocat = new Surftocat(
                "Soy el octocat de las olas",
                "Surftocat",
                "Surfista",
                "Tabla de surf"
        );
        System.out.println(surftocat.showMessage());
    }

}
