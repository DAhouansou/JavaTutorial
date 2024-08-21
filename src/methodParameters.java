class Robot{
    public void speak(String text) {
        System.out.println(text);
    }
    public void jump(int height) {
        System.out.println("Im going to jump " + (7 + height) + " meters");
    }
}





public class methodParameters {
    public static void main(String[] args) {


        Robot reg = new Robot();
        reg.speak("Hello Riko!!");
        reg.jump(6);
    }
}
