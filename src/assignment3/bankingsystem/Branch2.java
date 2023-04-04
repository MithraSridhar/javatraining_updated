package assignment3.bankingsystem;

public class Branch2 implements BankHeadOffice {

    @Override
    public boolean verifyDocuments(String docType, String uploadStatus) {
        if(docType.equals("PANCard")&&uploadStatus.equals("UploadSuccess")){
            System.out.println("Document verification is success");
            return true;
        }
        else{
            System.out.println("Document verification is not success");
            return false;
        }
    }

    @Override
    public String approveLoans(boolean docVerifyStatus) {
        if(docVerifyStatus){
            System.out.println("Loan is approved");
            return "Loan is approved";
        }
        else{
            System.out.println("Loan is not approved");
            return "Loan not approved";
        }
    }

    @Override
    public void getAccountDetails(String cusName, String cusID, String branchName) {

        System.out.println("Customer name is "+cusName);
        System.out.println("Customer ID is "+cusID);
        System.out.println("Branch name is "+branchName);


    }
}
