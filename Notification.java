class Notification {
    private String user;
    private String message;

    public Notification(String user, String message) {
        this.user = user;
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Notification for " + user + ": " + message;
    }
}
