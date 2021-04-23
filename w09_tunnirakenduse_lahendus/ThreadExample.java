

public class ThreadExample {
    public static String[] names = { "Kati", "Mati", "Jüri", "Taavi", "Alo" };

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            try {
                new Thread(getRunnable(), names[i]).start();
                Thread.sleep(500);
            } catch (Exeption e) {
                System.out.println(e.getMessage());
            }
        }

        public static Runnable getRunnable(){
            retur
        }
    }
}
