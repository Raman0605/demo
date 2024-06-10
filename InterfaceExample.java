
class A {
    public static void main(String[] args) {
        Object obj = getManLog(1);

        //System.out.print(getManLog(1));
    }

    static void callingB() {
        b obj = new b();
        obj.calculate();
    }

    static Object getManLog(int type) {
        callingB();
        switch (type) {
            case 1:
                new C();
            case 2:
                new D();

        }
        System.out.println("hi i am here");

        return null;
    }

}