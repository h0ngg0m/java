package nestedclass;

public class ShadowingMain {

    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain outer = new ShadowingMain();
        ShadowingMain.Inner inner = outer.new Inner();
        inner.go();
        /*
        value = 3
        this.value = 2
        ShadowingMain.this.value = 1
         */
    }
}
