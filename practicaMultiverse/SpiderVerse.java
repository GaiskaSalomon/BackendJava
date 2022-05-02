package practicaMultiverse;

public class SpiderVerse {

    public static void main(String[] args){
        TestPeterParker();
        TestGwenStacy();
        TestMilesMorales();
    }

    private static void TestPeterParker(){
        Screen screen = new Screen();
        PeterParker peterParker = new PeterParker(
               "Peter Parker",
               "Masculino",
               "Peter Parker es un joven huérfano que vive con sus tíos May y Ben. Durante su etapa como estudiante" +
                       " es mordido por una araña radioactiva y adquiere la agilidad y la fuerza proporcional de un arácnido."
        );
        peterParker.produceTela(screen);
        peterParker.trepaPared(screen);
        peterParker.capacidadInte(screen);
    }

    public static void TestGwenStacy(){
        Screen screen = new Screen();
        GwenStacy gwenStacy = new GwenStacy(
                "Gwen Stacy",
                "Femenino",
                "Gwen Stacy es mordida por una araña radioactiva, y se convierte en un superhéroe con el nombre de " +
                        "practicaMultiverse.Spider-Woman. También es miembro de una banda liderada por Mary Jane Watson, simplemente llamada Mary Janes."
        );
        gwenStacy.actiDetective(screen);
        gwenStacy.viajeMultidimen(screen);
        gwenStacy.fuerzaSobrehuma(screen);
    }

    public static void TestMilesMorales(){
        Screen screen = new Screen();
        MilesMorales milesMorales = new MilesMorales(
                "Miles Morales",
                "Masculino",
                "Miles Morales es mordido por una araña genéticamente modificada por la droga OZ que le otorgó sus poderes al" +
                        " Ultimate Peter Parker, Miles posee habilidades muy similares a las del practicaMultiverse.Spider-Man de su universo."
        );
        milesMorales.toqueVenenoso(screen);
        milesMorales.toqueElectro(screen);
        milesMorales.capacidadInvi(screen);
    }
}
