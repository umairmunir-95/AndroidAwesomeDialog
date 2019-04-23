package com.umairmunirahmad.androidawesomedialoglibrary;

public class AwesomeDialog {
    //required parameters
    int headerIcon;
    String bodyText;
    //optional parameters
    int headerColor;
    boolean cancelable;

    public int getHeaderIcon() {
        return headerIcon;
    }

    public void setHeaderIcon(int headerIcon) {
        this.headerIcon = headerIcon;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public int getHeaderColor() {
        return headerColor;
    }

    public void setHeaderColor(int headerColor) {
        this.headerColor = headerColor;
    }

    public boolean isCancelable() {
        return cancelable;
    }

    public void setCancelable(boolean cancelable) {
        this.cancelable = cancelable;
    }

    private AwesomeDialog(AwesomeDialogBuilder awesomeDialogBuilder) {
        this.headerIcon = awesomeDialogBuilder.headerIcon;
        this.bodyText = awesomeDialogBuilder.bodyText;
        this.headerColor = awesomeDialogBuilder.headerColor;
        this.cancelable=awesomeDialogBuilder.cancelable;
    }

    //Builder Class
    public static class AwesomeDialogBuilder {

        // required parameters
        private int headerIcon;
        private String bodyText;

        // optional parameters
        private int headerColor;
        private boolean cancelable;

        public AwesomeDialogBuilder(int headerIcon, String bodyText) {
            this.headerIcon = headerIcon;
            this.bodyText = bodyText;
        }

        public AwesomeDialogBuilder setHeaderColor(int headerColor) {
            this.headerColor = headerColor;
            return this;
        }
        public AwesomeDialogBuilder setCancelable(boolean cancelable) {
            this.cancelable=cancelable;
            return this;
        }

        public AwesomeDialog build() {
            return new AwesomeDialog(this);
        }
    }
}
