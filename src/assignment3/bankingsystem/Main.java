package assignment3.bankingsystem;

public class Main {
    static boolean verificationStatus;
    public static void main(String[] args) {

        approveLoan("branch1","Mithra","34565","Aadhaar","UploadSuccess");
        approveLoan("Branch3","Ram","87657","PANCard","UploadSuccess");

    }

    public static void approveLoan(String branchName,String cusName, String cusID, String docType, String docStatus){

        switch (branchName.toUpperCase()){
            case "BRANCH1":
                Branch1 b1 = new Branch1();
                b1.getAccountDetails( cusName,  cusID,  branchName);
                 verificationStatus=  b1.verifyDocuments( docType,  docStatus);
                b1.approveLoans(verificationStatus);
                break;
            case  "BRANCH2":
                Branch2 b2 = new Branch2();
                b2.getAccountDetails( cusName,  cusID,  branchName);
                 verificationStatus=  b2.verifyDocuments( docType,  docStatus);
                b2.approveLoans(verificationStatus);
                break;
            default:
                System.out.println("The provided branch "+branchName+" is not valid");
                break;
        }

    }

}
