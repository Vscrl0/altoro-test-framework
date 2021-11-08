public enum Account {
    CORPORATE("800000 Corporate", 800000),
    CHECKING("800001 Checking", 800001);
    private final String name;
    private final int id;

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    Account(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static Account selectAccount(String name) {
        switch (name) {
            case "CHECKING":
                return Account.CHECKING;
            case "CORPORATE":
                return Account.CORPORATE;
        }
        throw new IllegalArgumentException();
    }

}
