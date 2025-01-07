package gr.aueb.cf.ch4;

public class StringSplit {

    public static void main(String[] args) {

        String s = "Athens Uni of  Econ and  Business";

        String[] tokens = s.split("\\s+");

        for (String token : tokens) {
            System.out.println(token + " ");
        }
    }
}
