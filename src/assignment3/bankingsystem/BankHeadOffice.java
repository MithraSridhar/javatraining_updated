package assignment3.bankingsystem;

public interface BankHeadOffice {

    public boolean verifyDocuments(String docType, String uploadStatus);

    public String approveLoans(boolean docVerifyStatus);

    public void getAccountDetails(String cusName, String cusID , String branchName);

}
