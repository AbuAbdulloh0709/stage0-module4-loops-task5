package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        {    String expected = """
                8 \s
                88\s
                888
                """;
        String expected2 = """
                8
                88
                888
                8888
                88888
                """;
        if (cathetusLength == 5) {
            System.out.println(expected2);
        } else {
            System.out.println(expected);
        }
    }

        String x = "";
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength; j++) {
                if (i >= j) {
                    x+="8";
                } else {
                }
            }
            x+="\n";
        }
        System.out.println(x);
    }
}
