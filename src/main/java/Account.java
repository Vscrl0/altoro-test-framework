public enum Account {
    admin_CORPORATE("800000 Corporate", "admin"),
    admin_CHECKING("800001 Checking", "admin"),
    jsmith_SAVINGS("800002 Savings", "jsmith"),
    jsmith_CHECKING("800003 Checking", "jsmith"),
    jsmith_CREDIT_CARD("4539082039396288 Credit Card", "jsmith");
    private final String name;
    private final String user;

    public String getName() {
        return this.name;
    }
    public String getId() {
        return this.name.split(" ")[0];
    }

    public String getUser() {
        return this.user;
    }

    Account(String name, String user) {
        this.name = name;
        this.user = user;
    }

    public static Account selectAccount(String name) {
        switch (name) {
            case "admin_CORPORATE":
                return Account.admin_CORPORATE;
            case "admin_CHECKING":
                return Account.admin_CHECKING;
            case "jsmith_SAVINGS":
                return Account.jsmith_SAVINGS;
            case "jsmith_CHECKING":
                return Account.jsmith_CHECKING;
            case "jsmith_CREDIT_CARD":
                return Account.jsmith_CREDIT_CARD;
        }
        throw new IllegalArgumentException();
    }

}
