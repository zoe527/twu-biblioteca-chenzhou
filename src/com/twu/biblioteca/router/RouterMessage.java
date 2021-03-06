package com.twu.biblioteca.router;

public class RouterMessage {
    private String  userInput;
    private boolean exit;
    private boolean waitForInput;

    public RouterMessage(String  userInput, boolean exit, boolean waitForInput) {
        this.userInput = userInput;
        this.exit = exit;
        this.waitForInput = waitForInput;
    }

    public String getUserInput() {
        return userInput;
    }

    public boolean isExit() {
        return exit;
    }

    public boolean isWaitForInput() {
        return waitForInput;
    }
}
