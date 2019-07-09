/*
  2. Give your comments on the design of this class.
  Consider an insurance system that validates health insurance claims before approving one. The
  process is as follows:
  A customer of the company files a claim
  A health insurance surveyor validates a claim
  A claim manager either approves or rejects the claim
 */
package main.stackroute.SOLID;

public class InsuranceClaimProgram
{
    public static void main(String[] args)
    {
        ClaimManager claim = new ClaimManager();
        claim.setBillNumber(2943);
        claim.setHospitalName("S.C.B Medical Colleege and Hospital");
        claim.setName("Mohan");
        claim.ClaimManagerApprove();
    }

}
class Customer
{
    private int insuranceID;
    private String name;
    private int phoneNo;
    private String hospitalName;
    private int billNumber;
    private float billAmount;

    public int getInsuranceID()
    {
        return insuranceID;
    }

    public void setInsuranceID(int insuranceID)
    {
        this.insuranceID = insuranceID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPhoneNo()
    {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo)
    {
        this.phoneNo = phoneNo;
    }

    public String getHospitalName()
    {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName)
    {
        this.hospitalName = hospitalName;
    }

    public int getBillNumber()
    {
        return billNumber;
    }

    public void setBillNumber(int billNumber)
    {
        this.billNumber = billNumber;
    }

    public float getBillAmount()
    {
        return billAmount;
    }

    public void setBillAmount(float billAmount)
    {
        this.billAmount = billAmount;
    }
}
class HealthInsuranceSurveyor extends Customer
{
    int flag=1;
    public boolean validateHospital()
    {
        System.out.println("Name of Hospital : "+getHospitalName());
        return true;
    }
    public boolean validateBill()
    {
        System.out.println("Bill Number : "+getBillNumber());
        return false;
    }

}
class ClaimManager extends HealthInsuranceSurveyor
{
    public void ClaimManagerApprove()
    {
        if (validateHospital()==true && validateBill()==true)
        {
            System.out.println("Approved");
        }
        else
        {
            System.out.println("Not Approved");
        }
    }
}