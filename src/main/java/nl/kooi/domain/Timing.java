package nl.kooi.domain;

public enum Timing {

    IMMEDIATE("postnumerando"), DUE("prenumerando");
    private String dutchTerm;

    Timing(String dutchTerm) {
        this.dutchTerm = dutchTerm;

    }

    public String getDutchTerm() {
        return dutchTerm;
    }
}