package com.seleniummaster.homework2.CubeCartNewLetter;

public class NewsLetter {

    private String NewsletterSubject;
    private String senderName;
    private String senderEmail;
    private String htmlContent;

    public NewsLetter() {
    }

    public NewsLetter(String newsletterSubject, String senderName, String senderEmail, String htmlContent) {
        NewsletterSubject = newsletterSubject;
        this.senderName = senderName;
        this.senderEmail = senderEmail;
        this.htmlContent = htmlContent;
    }

    public String getNewsletterSubject() {
        return NewsletterSubject;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setNewsletterSubject(String newsletterSubject) {
        NewsletterSubject = newsletterSubject;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }
}