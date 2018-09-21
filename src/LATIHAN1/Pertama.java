package LATIHAN1;

class Pertama {

    private int a = 10;

    protected void terprotek() {
        System.out.println("Method Ini Hanya Untuk Hanya");
    }

    public void info() {
        System.out.println("a = " + a);
        System.out.println("Dipanggil Pada = " + this.getClass().getName());

    }
}
