package practicaMultiverse;

public class GwenStacy extends Spider implements GwenActionCallbacks{
    public GwenStacy(String name, String gender, String story) {
        super(name, gender, story);
    }

    @Override
    public void actiDetective(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.BlueGrey);
        s.showImage("actiDetective.jpg");
        s.out("Posee habilidades detectivescas que le permiten resolver problemas\n", "Helvetica", 28, Colors.FussionRed);
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void viajeMultidimen(Screen s) {
        s.showImage("viajeMultidimen.jpg");
        s.out("Puede viajer multidimensionalmente\n", "Helvetica", 28, Colors.FussionRed);
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void fuerzaSobrehuma(Screen s) {
        s.showImage("fuerzaSobrehumana.jpg");
        s.out("Tiene gran fuerza sobrehumana lo que la convierte en una rival muy fuerte\n", "Helvetica", 28, Colors.FussionRed);
        s.setBounds(200, 100, 1100, 900);
    }
}
