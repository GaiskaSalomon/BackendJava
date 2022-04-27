package practicaMona;

class Surftocat extends Mona{

    String name = "Surftocat";
    String activity = "Surfista";
    String tool = "Tabla de surf";

    void phrase(){
        System.out.println("==> Soy el octocat de los mares <==");
    }

    public String showMessage(){
        return "Nombre: "+name+"\nActividad: "+activity+"\nHerramienta: "+tool+"\n";
    }
}

class Sentrytocat extends Mona{

    String name = "Sentrytocat";
    String activity = "Bombero";
    String tool = "Manguera";

    void phrase(){
        System.out.println("==> Soy el octocat de los incendios <==");
    }

    public String showMessage(){
        return "Nombre: "+name+"\nActividad: "+activity+"\nHerramienta: "+tool+"\n";
    }
}

class Skatetocat extends Mona{

    String name = "Skatetocat";
    String activity = "Skater";
    String tool = "Patineta";

    void phrase(){
        System.out.println("==> Soy el octocat de las patinetas <==");
    }

    public String showMessage(){
        return "Nombre: "+name+"\nActividad: "+activity+"\nHerramienta: "+tool+"\n";
    }
}

class Minertocat extends Mona{

    String name = "Minertocat";
    String activity = "Minero";
    String tool = "Charola cribadora";

    void phrase(){
        System.out.println("==> Soy el octocat de las minas <==");
    }

    public String showMessage(){
        return "Nombre: "+name+"\nActividad: "+activity+"\nHerramienta: "+tool+"\n";
    }
}

class Luchadortocat extends Mona{

    String name = "Luchadortocat";
    String activity = "Lucha libre";
    String tool = "Fuerza física";

    void phrase(){
        System.out.println("==> Soy el octocat de los cuadriláteros <==");
    }

    public String showMessage(){
        return "Nombre: "+name+"\nActividad: "+activity+"\nHerramienta: "+tool+"\n";
    }
}

class Labtocat extends Mona{

    String name = "Labtocat";
    String activity = "Ciencia";
    String tool = "Conocimiento";

    void phrase(){
        System.out.println("==> Soy el octocat de la ciencia <==");
    }

    public String showMessage(){
        return "Nombre: "+name+"\nActividad: "+activity+"\nHerramienta: "+tool;
    }
}

public class Octocats{
    public static void main(String[] args) {
        Mona mona = new Mona();
        mona.phrase();
        System.out.println(mona.showMessage());
        Surftocat surftocat = new Surftocat();
        surftocat.phrase();
        System.out.println(surftocat.showMessage());
        Sentrytocat sentrytocat = new Sentrytocat();
        sentrytocat.phrase();
        System.out.println(sentrytocat.showMessage());
        Skatetocat skatetocat = new Skatetocat();
        skatetocat.phrase();
        System.out.println(skatetocat.showMessage());
        Minertocat minertocat = new Minertocat();
        minertocat.phrase();
        System.out.println(minertocat.showMessage());
        Luchadortocat luchadortocat = new Luchadortocat();
        luchadortocat.phrase();
        System.out.println(luchadortocat.showMessage());
        Labtocat labtocat = new Labtocat();
        labtocat.phrase();
        System.out.println(labtocat.showMessage());
    }
}
