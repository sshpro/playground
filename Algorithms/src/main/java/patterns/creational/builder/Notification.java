package patterns.creational.builder;

import java.util.Locale;

public class Notification {
    // for simplicity now I use everything as String but remember these are complex objects
    private String mTitle;
    private String mMessage;
    private String mType;
    private String[] mAttachments; // & many more Configurations goes on...


    public static class Builder{

        Notification mNotification;
        public Builder(){
            mNotification = new Notification();
        }

        void addTitle(String title){
            mNotification.mTitle = title;
        }

        void addMessage(String message){
            mNotification.mMessage = message;
        }

        void addType(String type){
            mNotification.mType = type;
        }

        void addAttachments(String [] attachments){
            mNotification.mAttachments = attachments;
        }

        public Notification build(){
            return mNotification;
        }

    }
}
