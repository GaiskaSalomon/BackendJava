package practicaMultiverse;

public class PeterParker extends Spider implements PeterActionCallbacks{
    public PeterParker(String name, String gender, String story) {
        super(name, gender, story);
    }

    @Override
    public void produceTela(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.BlueGrey);
        s.showImage("produceTela.jpg");
        s.out("Lanza telaraña producida por su propio cuerpo\n", "Helvetica", 28, Colors.FussionRed);
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void trepaPared(Screen s) {
        s.showImage("trepaPared.jpg");
        s.out("Tiene la habilidad de trepar paredes ya que se adhiere con su piel\n", "Helvetica", 28, Colors.FussionRed);
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void capacidadInte(Screen s) {
        s.showImage("capacidadInte.jpg");
        s.out("Posee una gran capacidad intelectual que le ayuda a solucionar varias dificultadesn", "Helvetica", 28, Colors.FussionRed);
        s.setBounds(200, 100, 1100, 900);
    }
}
