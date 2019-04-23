package com.umairmunirahmad.androidawesomedialoglibrary;

public class AwesomeDialog {
    //required parameters
    int headerIcon;
    String bodyText;
    //optional parameters
    int headerColor;

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

    private AwesomeDialog(AwesomeDialogBuilder awesomeDialogBuilder) {
        this.headerIcon=awesomeDialogBuilder.headerIcon;
        this.bodyText=awesomeDialogBuilder.bodyText;
        this.headerColor=awesomeDialogBuilder.headerColor;
    }

    //Builder Class
    public static class AwesomeDialogBuilder{

        // required parameters
        private int headerIcon;
        private String bodyText;

        // optional parameters
        private int headerColor;

        public AwesomeDialogBuilder(int headerIcon,String bodyText){
            this.headerIcon=headerIcon;
            this.bodyText=bodyText;
        }

        public AwesomeDialogBuilder setHeaderColor(int headerColor) {
            this.headerColor=headerColor;
            return this;
        }

        public AwesomeDialog build(){
            return new AwesomeDialog(this);
        }
    }
}
