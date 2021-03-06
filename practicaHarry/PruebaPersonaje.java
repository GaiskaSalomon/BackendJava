package practicaHarry;

public class PruebaPersonaje {

    public static void main(String[] args) {
        harryPotter();
        ginevraWeasley();
        lunaLovegood();
        severusSnape();
        tomRiddle();
    }

    private static void harryPotter(){
        System.out.println("\n");
        Personaje harry = new Personaje(
                "Gryffindor",
                "Masculino",
                "Harry James Potter",
                "Dementor",
                "Ciervo");
        System.out.println(harry.showMessage());
    }

    private static void ginevraWeasley(){
        Personaje ginevra = new Personaje(
                "Gryffindor",
                "Femenino",
                "Ginevra Molly Potter",
                "Lord Boldemort",
                "Caballo");
        System.out.println(ginevra.showMessage());
    }

    private static void lunaLovegood(){
        Personaje luna = new Personaje(
                "Ravenclaw",
                "Femenino",
                "Luna Lovegood",
                "Ninguno",
                "Liebre");
        System.out.println(luna.showMessage());
    }

    private static void severusSnape(){
        Personaje severus = new Personaje(
                "Slytherin",
                "Masculino",
                "Severus Snape",
                "Lord Boldemort",
                "Ciervo");
        System.out.println(severus.showMessage());
    }

    private static void tomRiddle(){
        Personaje tom = new Personaje(
                "Slytherin",
                "Masculino",
                "Tom Marvolo Riddle",
                "Su propio cad?ver",
                "Ninguno");
        System.out.println(tom.showMessage());
    }
}
