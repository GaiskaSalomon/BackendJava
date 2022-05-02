package practicaComic;

public class BarmanHush extends Comic implements BatmanActionCallbacks{
    public BarmanHush(String collection, String name, double number, String age, String phrase) {
        super(collection, name, number, age, phrase);
    }

    @Override
    public void visualizeIntro(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 20, Colors.RED);
        s.showImage("00.png");
        //s.out("Posee\n", "Helvetica", 28, Colors.FussionRed);
        //s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void page01(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("01.jpg");
    }

    @Override
    public void page02(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("02.jpg");
    }

    @Override
    public void page03(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("03.jpg");
    }

    @Override
    public void page04(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("04.jpg");
    }

    @Override
    public void page05(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("05.jpg");
    }

    @Override
    public void page06(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("06.jpg");
    }

    @Override
    public void page07(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("07.jpg");
    }

    @Override
    public void page08(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("08.jpg");
    }

    @Override
    public void page09(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("09.jpg");
    }

    @Override
    public void page10(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("10.jpg");
    }

    @Override
    public void page11(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("11.jpg");
    }

    @Override
    public void page12(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("12.jpg");
    }

    @Override
    public void page13(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("13.jpg");
    }

    @Override
    public void page14(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("14.jpg");
    }

    @Override
    public void page15(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("15.jpg");
    }

    @Override
    public void page16(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("16.jpg");
    }

    @Override
    public void page17(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("17.jpg");
    }

    @Override
    public void page18(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("18.jpg");
    }

    @Override
    public void page19(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("19.jpg");
    }

    @Override
    public void page20(Screen s) {
        s.cls();
        s.repaint();
        s.showImage("20.jpg");
    }
}
