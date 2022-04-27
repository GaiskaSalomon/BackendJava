package practicaMona;

public class Mona {

    String name = "Octocat";
    String activity = "Desarrollador";
    String tool = "Tentabrazos";

    void phrase(){
        System.out.println("==> Soy el octocat de la tecnología <==");
    }

    public String showMessage(){
        return "Nombre: "+name+"\nActividad: "+activity+"\nHerramienta: "+tool+"\n";
    }
}
