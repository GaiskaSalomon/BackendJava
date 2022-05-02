package practicaMultiverse;

public class MilesMorales extends Spider implements MilesActionCallbacks{
    public MilesMorales(String name, String gender, String story) {
        super(name, gender, story);
    }

    @Override
    public void toqueVenenoso(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.BlueGrey);
        s.showImage("toqueVenenoso.jpg");
        s.out("Lanza un rayo de luz que paraliza a sus enemigos\n", "Helvetica", 28, Colors.FussionRed);
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void toqueElectro(Screen s) {
        s.showImage("toqueElectro.jpg");
        s.out("Tiene la capacidad de tocar a sus enemigos y electrocutarlos al instante\n", "Helvetica", 28, Colors.FussionRed);
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void capacidadInvi(Screen s) {
        s.showImage("capacidadInvi.jpg");
        s.out("Se vuelve invisible a voluntad\n", "Helvetica", 28, Colors.FussionRed);
        s.setBounds(200, 100, 1100, 900);
    }
}
