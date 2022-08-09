public enum ChargeType {
    STANDARD(12),
    RAPID(2),
    SELF_CHARGING(0);

    private final int chargingTime;

    ChargeType(int chargingTime) {
        this.chargingTime = chargingTime;
    }

    public int getChargingTime() {
        return chargingTime;
    }
}
