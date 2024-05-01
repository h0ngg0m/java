package methodcall;

class Data {
    int value;
}

public class MethodChange2 {

    public static void main(String[] args) {
        Data data1 = new Data();
        data1.value = 10;
        System.out.println("before data1.value = " + data1.value);
        changeReference(data1);
        System.out.println("after data1.value = " + data1.value);
    }

    private static void changeReference(Data dataX) {
        dataX.value = 20;
    }

}
