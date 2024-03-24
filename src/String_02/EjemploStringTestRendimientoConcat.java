package String_02;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
//            c = c.concat(a).concat(b).concat("\n");   // 500 => 1ms,   1000 => 4ms,   10000 => 100ms, 100000 => 5857ms
//            c += a + b + "\n";                          // 500 => 13ms,  1000 => 15ms,  10000 => 57ms,  100000 => 1985ms
            sb.append(a).append(b).append("\n");        // 500=> 0ms,    1000 => 0-1ms, 10000 => 2ms, 100000 => 8ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);

        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());

    }
}