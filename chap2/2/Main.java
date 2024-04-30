package chap2.2;

public class Main {
    public static void main(String[] args) {

        String s1 = """
                <html>
                    <body>
                        <p>"Hello, World!"</p>
                    </body>
                </html>
                """;
        String s2 = "<html>\n" +
                "   <body>\n" +
                "       <p>\"Hello, World\"</p>\n" +
                "   </body>\n" +
                "</html>\n";
        String t1 = """
                t1 text""";
        String t2 = """
                t2 text
                """;
        String t3 = """
                t3 text  """;
    }
}
