class RDemo {
    public static void main(String args[]) {
        ProcessBuilder r1 = new ProcessBuilder("mspaint.exe");

        try {
            Process p = r1.start();
            Thread.sleep(5000);
            p.destroy();            

        } catch (Exception tt) {
        }
    }

}
// for files == "(:File path)"

// How to perform interthread communication

// 5 sec notepad then mspaint 5sec then 5sec vlc media player, then a msg, 5
// seconds. made by thread
