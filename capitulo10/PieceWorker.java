package capitulo10;

import java.util.Date;

public class PieceWorker extends Employee{

    private final double wage;
    private final double pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, double pieces) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        this.wage = wage;
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public double getPieces() {
        return pieces;
    }

    @Override
    public double getPaymentAmount() {
        return earnings();
    }

    @Override
    public double earnings() {
        return getWage() * getPieces();
    }

    @Override
    public String toString() {
        return String.format("pieceWorker employee: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "piece wage", getWage(), "quantity pieces", getPieces());
    }
}
