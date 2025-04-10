package com.hasan.gwserver.dto;

public class MessageDto {
    private String emailBody; 
    private String smsBody; 
    private String emailRecepient; 
    private String smsRecepient;

    public String getEmailBody() {
        return emailBody;
    }
    public String getSmsBody() {
        return smsBody;
    }
    public String getEmailRecepient() {
        return emailRecepient;
    }
    public String getSmsRecepient() {
        return smsRecepient;
    }
    @Override
    public String toString() {
        return "MessageDto [emailBody=" + emailBody + ", smsBody=" + smsBody + ", emailRecepient=" + emailRecepient
                + ", smsRecepient=" + smsRecepient + "]";
    }

    
}
