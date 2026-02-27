package Association.aggregation;

public class Patient
{
    String patientName;
    int patientAge;
    String disease,dateOfArrival;
    Information info;
    Payment pay;

    public Patient(String patientName, int patientAge, String disease, String dateOfArrival,Information info,Payment pay)
    {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.disease = disease;
        this.dateOfArrival = dateOfArrival;
        this.info=info;
        this.pay=pay;
    }
    void patientDetails()
    {
        System.out.println("Name:"+this.patientName);
        System.out.println("Age:"+this.patientAge);
        System.out.println("Disease:"+this.disease);
        System.out.println("Date of Arrival:"+this.dateOfArrival);
        System.out.println("Block Number:"+this.info.blockNo);
        System.out.println("Floor number:"+this.info.floorNo);
        System.out.println("Room number:"+this.info.roomNo);
        System.out.println("Bed number:"+this.info.bedNo);
        System.out.println("Admission Fees:"+this.pay.admFees);
        System.out.println("Registration Fees:"+this.pay.regFees);
        System.out.println("Balance Amount:"+this.pay.balAmt);
    }

    public static void main(String[] args)
    {
        Information info=new Information('C',3,810,6);
        Payment pay=new Payment(6000,10000,4000);
        Patient p1=new Patient("Shreyas",22,"AIDS","25-02-2026",info,pay);
        p1.patientDetails();
    }
}
