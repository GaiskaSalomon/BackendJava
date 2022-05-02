package practicaComic;

public class ComicReader {
    public static void main(String[] args) throws InterruptedException {
        TestBatmanHush();
    }

    private static void TestBatmanHush() throws InterruptedException {
        Screen screen = new Screen();
        BarmanHush batmanhush = new BarmanHush(
                "Tales from the Dark Multiverse",
                "Batman Hush",
                1,
                "13+",
                "Batman the silenced will be heard!\n"
        );
        batmanhush.visualizeIntro(screen);
        Thread.sleep(4000);
        batmanhush.page01(screen);
        Thread.sleep(6000);
        batmanhush.page02(screen);
        Thread.sleep(6000);
        batmanhush.page03(screen);
        Thread.sleep(6000);
        batmanhush.page04(screen);
        Thread.sleep(6000);
        batmanhush.page05(screen);
        Thread.sleep(6000);
        batmanhush.page06(screen);
        Thread.sleep(6000);
        batmanhush.page07(screen);
        Thread.sleep(6000);
        batmanhush.page08(screen);
        Thread.sleep(6000);
        batmanhush.page09(screen);
        Thread.sleep(6000);
        batmanhush.page10(screen);
        Thread.sleep(6000);
        batmanhush.page11(screen);
        Thread.sleep(6000);
        batmanhush.page12(screen);
        Thread.sleep(6000);
        batmanhush.page13(screen);
        Thread.sleep(6000);
        batmanhush.page14(screen);
        Thread.sleep(6000);
        batmanhush.page15(screen);
        Thread.sleep(6000);
        batmanhush.page16(screen);
        Thread.sleep(6000);
        batmanhush.page17(screen);
        Thread.sleep(6000);
        batmanhush.page18(screen);
        Thread.sleep(6000);
        batmanhush.page19(screen);
        Thread.sleep(6000);
        batmanhush.page20(screen);
    }
}
