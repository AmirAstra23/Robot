public class PoolThreads implements Runnable {
    Data obj;
    int countValue;

    public PoolThreads(Data obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        int countChar = 0;
        String s = Data.generateRoute("RLRFR", 100);

        for (int i = 0; i < 100; i++) {
            char c = s.charAt(i);
            if (c == 'R') {
                countChar++;
            }
        }
        System.out.println(countChar);
        Data.addIntoMap(countChar);

    }
}
