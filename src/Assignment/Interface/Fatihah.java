package Assignment.Interface;

public class Fatihah implements Uncle {

    @Override
    public String takeUpResponsibilities() {
        return "Washing Plates";
    }

    @Override
    public String praying() {
        return "Prays five times daily";
    }

    @Override
    public void strict() {
        System.out.println("She is strict at beating ");

    }

    @Override
    public void sings() {
        System.out.println("She is a good singer");
    }

    public static void main(String[] args) {
        Fatihah f = new Fatihah();
        System.out.println(f.praying());
        System.out.println(f.takeUpResponsibilities());
        f.sings();
        f.strict();
    }
}
