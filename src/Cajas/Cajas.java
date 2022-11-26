package Cajas;

public class Cajas {

    private double totalDia;
    private double totalSemana;

    public Cajas() {
    }

    public void CajasDia(double totalDia) {
        this.totalDia = totalDia;
    }

    public void CajasSemana(double totalSemana) {
        this.totalSemana = totalSemana;

    }

    public double getTotalDia() {
        return totalDia;
    }

    public void setTotalDia(double totalDia) {
        this.totalDia = totalDia;
    }

    public double getTotalSemana() {
        return totalSemana;
    }

    public void setTotalSemana(double totalSemana) {
        this.totalSemana = totalSemana;
    }

}
